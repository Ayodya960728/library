/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.BookDao;
import edu.ijse.library.dto.BookDto;
import edu.ijse.library.entity.BookEntity;
import edu.ijse.library.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class BookServiceImpl implements BookService{
    
     private final BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(BookDto bookDto) throws Exception {
        BookEntity entity = getBookEntity(bookDto);
        return bookDao.create(entity) ? "Success" : "Fail";
    }

    @Override
    public String update(BookDto bookDto) throws Exception {
        BookEntity entity = getBookEntity(bookDto); 
        return bookDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(Integer id) throws Exception {
        return bookDao.delete(id) ? "Success" : "Fail";
    }

    @Override
    public BookDto get(Integer id) throws Exception {
        BookEntity entity = bookDao.get(id);
        if (entity != null) {
            return getBookDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
        ArrayList<BookEntity> bookEntities = bookDao.getAll(); 
        if (bookEntities != null && !bookEntities.isEmpty()) {
            ArrayList<BookDto> bookDtos = new ArrayList<>();
            for (BookEntity bookEntity : bookEntities) { 
                bookDtos.add(getBookDto(bookEntity)); 
            }
            return bookDtos;
        }
        
        return null;
    }

    private BookEntity getBookEntity(BookDto bookDto) {
        return new BookEntity(bookDto.getId(), bookDto.getTitle(), bookDto.getAuthor(), bookDto.getPublisher(), bookDto.getYear(),bookDto.getCategory_id());
    }

    private BookDto getBookDto(BookEntity entity) {
        return new BookDto(entity.getId(), entity.getTitle(), entity.getAuthor(), entity.getPublisher(), entity.getYear(), entity.getCategory_id());
    }
}