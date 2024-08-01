/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.CategoryDto;
import edu.ijse.library.dto.MemberDto;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public interface MemberService extends SuperService {
    public MemberDto getMember(Integer id) throws Exception;
    
    String save(MemberDto memberDto) throws Exception;
    String update(MemberDto memberDto) throws Exception;
    String delete(Integer id) throws Exception;
    MemberDto get(Integer id) throws Exception;
    ArrayList<MemberDto> getAll() throws Exception;
}
