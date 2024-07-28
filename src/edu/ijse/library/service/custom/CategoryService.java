/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.CategoryDto;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public interface CategoryService extends SuperService {
    String save(CategoryDto categoryDto) throws Exception;
    String update(CategoryDto categoryDto) throws Exception;
    String delete(Integer id) throws Exception;
    CategoryDto get(Integer id) throws Exception;
    ArrayList<CategoryDto> getAll() throws Exception;
}
