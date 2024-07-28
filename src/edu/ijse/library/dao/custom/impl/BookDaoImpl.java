/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.BookDao;
import edu.ijse.library.entity.BookEntity;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class BookDaoImpl implements BookDao {

    @Override
    public boolean create(BookEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO books VALUES(?,?,?,?,?,?)", t.getId(), t.getTitle(), t.getAuthor(), t.getPublisher(), t.getYear(), t.getCategory_id());
    }

    @Override
    public boolean update(BookEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public BookEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        return null;
    }
    
}
