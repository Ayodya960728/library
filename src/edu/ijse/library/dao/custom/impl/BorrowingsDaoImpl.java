/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.BorrowingsDao;
import edu.ijse.library.entity.BorrowingsEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

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
        return CrudUtil.executeUpdate("UPDATE BORROWINGS SET NAME = ? WHERE Id = ?", t.getBook_id(), t.getMember_id(), t.getBorrow_date(), t.getDue_date(), t.getReturn_date(), t.getFine());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM borrowings WHERE id = ?", id);
    }

    @Override
    public BorrowingsEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM borrowings WHERE id = ?", id);
        if (rst.next()){
            BorrowingsEntity entity = new BorrowingsEntity(rst.getInt("book_id"), 
                    rst.getInt("member_id"), 
                    rst.getString("borrow _date"), 
                    rst.getString("due_date"), 
                    rst.getString("return_date"), 
                    rst.getString("fine"));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<BorrowingsEntity> getAll() throws Exception {
       ArrayList<BorrowingsEntity> borrowingsEntitys = new ArrayList<>();
       ResultSet rst = CrudUtil.executeQuery("SELECT * FROM borrowings");
       while (rst.next()){
           BorrowingsEntity entity = new BorrowingsEntity(rst.getInt("book_id"), 
                   rst.getInt("member_id"), 
                   rst.getString("borrow_date"), 
                   rst.getString("due_date"),
                   rst.getString("return_date"),
                   rst.getString("fine"));
           borrowingsEntitys.add(entity);
       }
       return borrowingsEntitys;
    }

    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BorrowingsEntity get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
