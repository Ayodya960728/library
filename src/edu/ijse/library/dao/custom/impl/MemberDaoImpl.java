/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.MemberDao;
import edu.ijse.library.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class MemberDaoImpl implements MemberDao {

    @Override
    public boolean create(MemberEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean update(MemberEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return false;
    }

    @Override
    public MemberEntity get(Integer id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM members WHERE id = ?", id);
        if(rst.next()){
            MemberEntity memberEntity = new MemberEntity(
                    rst.getInt("id"), 
                    rst.getString("name"),
                    rst.getString("phone"));
            return memberEntity;
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        return null;
    }
    
}
