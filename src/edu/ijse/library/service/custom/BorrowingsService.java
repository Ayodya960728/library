/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.BorrowingsDto;
import edu.ijse.library.service.SuperService;

/**
 *
 * @author HP
 */
public interface BorrowingsService extends SuperService {
    public String aproveBorrowings(BorrowingsDto borrowingsDto) throws Exception;
}
