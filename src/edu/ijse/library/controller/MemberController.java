/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.MemberDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.MemberService;

/**
 *
 * @author HP
 */
public class MemberController {
    private MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);
    
    public MemberDto getMember(Integer id) throws Exception{
        return memberService.getMember(id);
    }
}
