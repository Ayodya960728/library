/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.BookDto;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public interface BookService extends SuperService {
    String save(BookDto bookDto) throws Exception;
    String update(BookDto bookDto) throws Exception;
    String delete(Integer id) throws Exception;
    BookDto get(Integer id) throws Exception;
    ArrayList<BookDto> getAll() throws Exception;
}
