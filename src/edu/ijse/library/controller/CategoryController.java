/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.CategoryDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CategoryController {
    
    private CategoryService categoryService = (CategoryService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);
    
    public String save(CategoryDto categoryDto) throws Exception{
        return categoryService.save(categoryDto);
    }
    
    public String update(CategoryDto categoryDto) throws Exception{
        return categoryService.update(categoryDto);
    }
    
    public String delete(Integer id) throws Exception{
        return categoryService.delete(id);
    }
    
    public ArrayList<CategoryDto> getAll() throws Exception{
        return categoryService.getAll();
    }
    
    public CategoryDto get(Integer id) throws Exception{
        return categoryService.get(id);
    }

    public String saveCategory(CategoryDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
