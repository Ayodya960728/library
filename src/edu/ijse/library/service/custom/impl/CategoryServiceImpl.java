/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.CategoryDao;
import edu.ijse.library.dto.CategoryDto;
import edu.ijse.library.entity.CategoryEntity;
import edu.ijse.library.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CategoryServiceImpl implements CategoryService {
    
    private CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);

    @Override
    public String save(CategoryDto categoryDto) throws Exception {
        CategoryEntity entity = getCategoryEntity(categoryDto);
         return categoryDao.create(entity) ? "Success" : "Fail";
    }

    @Override
    public String update(CategoryDto categoryDto) throws Exception {
        CategoryEntity entity = getCategoryEntity(categoryDto);
        return categoryDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(Integer id) throws Exception {
      return categoryDao.delete(id) ? "Success" : "Fail";
    }

    @Override
    public CategoryDto get(Integer id) throws Exception {
        CategoryEntity entity = categoryDao.get(id);
        if(entity != null) {
            return getCategoryDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<CategoryDto> getAll() throws Exception {
       ArrayList<CategoryEntity> categoryEntitys = categoryDao.getAll();
       if(categoryEntitys != null && !categoryEntitys.isEmpty()){
            ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
            
            for (CategoryEntity categoryEntity : categoryEntitys) {
               categoryDtos.add(getCategoryDto(categoryEntity));
           }
            
            return categoryDtos;
       }
       return null;
    }
    
    private CategoryEntity getCategoryEntity(CategoryDto categoryDto){
         return new CategoryEntity(categoryDto.getId(),
                categoryDto.getName());
    }
    
    private CategoryDto getCategoryDto(CategoryEntity entity){
        return new CategoryDto(entity.getId(), 
                entity.getName());
    }
    
}
