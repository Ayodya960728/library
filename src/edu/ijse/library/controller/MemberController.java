/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.MemberDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class MemberController {

    public static MemberDto findMember(String memberId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);
    
    public MemberDto getMember(Integer id) throws Exception{
        return memberService.getMember(id);
    }

    public ArrayList<MemberDto> getAll() throws Exception {
       return memberService.getAll();
    }

    public String save(MemberDto dto) throws Exception {
        return memberService.save(dto);
    }

    public MemberDto get(int memberId) throws Exception {
       return memberService.get(memberId);
    }

    public String delete(int memberId) throws Exception {
        return memberService.delete(memberId);
    }

    public String update(MemberDto dto) throws Exception {
        return memberService.update(dto);
    }
}
