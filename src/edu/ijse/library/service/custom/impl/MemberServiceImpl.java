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
    
}
