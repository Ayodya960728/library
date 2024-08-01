/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.CrudDao;
import edu.ijse.library.entity.BorrowingsEntity;

/**
 *
 * @author HP
 */
public interface BorrowingsDao extends CrudDao<BorrowingsEntity, String> {

    public boolean delete(Integer id);

    public BorrowingsEntity get(Integer id);
    
}
