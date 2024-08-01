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
        return CrudUtil.executeUpdate("INSERT INTO members VALUES(?,?,?)", t.getId(), t.getName(), t.getPhone());
    }

    @Override
    public boolean update(MemberEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE MEMBERS SET Name = ? WHERE Id = ?", t.getId(), t.getName(), t.getPhone());
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM members WHERE id = ?", id);
    }

    @Override
    public MemberEntity get(Integer id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM members WHERE id = ?", id);
        if(rst.next()){
            MemberEntity entity = new MemberEntity(
                    rst.getInt("id"), 
                    rst.getString("name"),
                    rst.getString("phone"));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM members");
        while (rst.next()){
            MemberEntity entity = new MemberEntity(rst.getInt("id"), 
                    rst.getString("name"), 
                    rst.getString("phone"));
          memberEntitys.add(entity);
        }
        return memberEntitys;
    }
    
}
