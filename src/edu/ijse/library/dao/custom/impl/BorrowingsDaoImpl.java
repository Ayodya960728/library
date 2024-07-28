/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.BorrowingsDao;
import edu.ijse.library.entity.BorrowingsEntity;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class BorrowingsDaoImpl implements BorrowingsDao {

    @Override
    public boolean create(BorrowingsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO borrowings VALUES(?,?,?,?,?,?)", t.getBook_id(), t.getMember_id(), t.getBorrow_date(), t.getDue_date(), t.getReturn_date());
    }

    @Override
    public boolean update(BorrowingsEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public BorrowingsEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<BorrowingsEntity> getAll() throws Exception {
        return null;
    }
    
}
