/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.BorrowingsDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.BorrowingsService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class BorrowingsController {
    
    private BorrowingsService borrowingsService = (BorrowingsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BORROWINGS);
    
    public String aproveBorrowings(BorrowingsDto borrowingsDto) throws Exception {
        return borrowingsService.aproveBorrowings(borrowingsDto);
    }

    public String saveBorrowings(BorrowingsDto borrowingsDto) throws Exception {
        return borrowingsService.save(borrowingsDto);
    }

    public ArrayList<BorrowingsDto> getAll() throws Exception {
        return borrowingsService.getAll();
    }

    public String updateBorrowings(BorrowingsDto borrowingsDto) throws Exception {
        return borrowingsService.update(borrowingsDto);
    }

    public void approveBorrowings(String bookId, String memberId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public BorrowingsDto get(Integer id) throws Exception {
        return borrowingsService.get(id);
    }

    public String delete(Integer id) throws Exception {
       return borrowingsService.delete(id);
    }

    public String save(BorrowingsDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<BorrowingsDto> getBorrowings() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
