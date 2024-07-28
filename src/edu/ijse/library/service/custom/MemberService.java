/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.MemberDto;
import edu.ijse.library.service.SuperService;

/**
 *
 * @author HP
 */
public interface MemberService extends SuperService {
    public MemberDto getMember(Integer id) throws Exception;
}
