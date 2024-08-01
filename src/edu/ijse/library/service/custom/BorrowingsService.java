/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.BorrowingsDto;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public interface BorrowingsService extends SuperService {
    String save(BorrowingsDto borrowingsDto) throws Exception;
    String update(BorrowingsDto borrowingsDto) throws Exception;
    String delete(Integer id) throws Exception;
    BorrowingsDto get(Integer id) throws Exception;
    ArrayList<BorrowingsDto> getAll() throws Exception;
    public String aproveBorrowings(BorrowingsDto borrowingsDto) throws Exception;
}
