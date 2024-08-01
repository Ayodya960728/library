/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.BookDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class BookController {

     private final BookService bookService;
     
     public BookController() {
         this.bookService = (BookService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);
     }
    
     public String save(BookDto bookDto) throws Exception{
        return bookService.save(bookDto);
    }
    
    public String update(BookDto bookDto) throws Exception{
        return bookService.update(bookDto);
    }
    
    public String delete(Integer id) throws Exception{
        return bookService.delete(id);
    }
    
    public ArrayList<BookDto> getAll() throws Exception{
        return bookService.getAll();
    }
    
    public BookDto get(Integer id) throws Exception{
        return bookService.get(id);
    }

   // public String searchBook(Integer bookId) throws Exception {
     // return null;
   // }

    public BookDto findBook(String bookId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public BookDto searchBook(String bookId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}