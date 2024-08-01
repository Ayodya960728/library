/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.MemberDao;
import edu.ijse.library.dto.MemberDto;
import edu.ijse.library.entity.MemberEntity;
import edu.ijse.library.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class MemberServiceImpl implements MemberService {

    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);
    
    @Override
    public MemberDto getMember(Integer id) throws Exception {
        MemberEntity entity = memberDao.get(id);
        if(entity != null){
            MemberDto dto = new MemberDto(entity.getId(),
                    entity.getName(),
                    entity.getPhone());
            return dto;
        }
        return null;
    }

    @Override
    public String save(MemberDto memberDto) throws Exception {
        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.create(entity) ? "Success" : "Fail";

    }

    @Override
    public String update(MemberDto memberDto) throws Exception {
        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.update(entity) ? "Success" : "Fail";

    }

    @Override
    public String delete(Integer id) throws Exception {
        return memberDao.delete(id) ? "Success" : "Fail";
    }

    @Override
    public MemberDto get(Integer id) throws Exception {
        MemberEntity entity = memberDao.get(id);
        if(entity != null) {
            return getMemberDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
         ArrayList<MemberEntity> memberEntitys = memberDao.getAll();
       if(memberEntitys != null && !memberEntitys.isEmpty()){
            ArrayList<MemberDto> memberDtos = new ArrayList<>();
            
            for (MemberEntity memberEntity : memberEntitys) {
               memberDtos.add(getMemberDto(memberEntity));
           }
            
            return memberDtos;
       }
       return null;
    }

    private MemberEntity getMemberEntity(MemberDto memberDto) {
        return new MemberEntity(memberDto.getId(), memberDto.getName(), memberDto.getPhone());
    }

    private MemberDto getMemberDto(MemberEntity entity) {
        return new MemberDto(entity.getId(), entity.getName(), entity.getPhone());
    }
    
}
