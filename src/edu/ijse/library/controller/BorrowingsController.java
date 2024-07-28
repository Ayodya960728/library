/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.BorrowingsDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.BorrowingsService;

/**
 *
 * @author HP
 */
public class BorrowingsController {
    
    private BorrowingsService borrowingsService = (BorrowingsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BORROWINGS);
    
    public String aproveBorrowings(BorrowingsDto borrowingsDto) throws Exception {
        return borrowingsService.aproveBorrowings(borrowingsDto);
    }
    
}
