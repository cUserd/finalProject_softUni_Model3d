package com.homecode.library.service;

import com.homecode.library.model.CategoryModelEntity;
import com.homecode.library.model.dto.CategoryDTO;

import java.util.List;

public interface CategoryModelService {

    boolean isEmpty();

    void initCategories();

    List<CategoryDTO> findAll();

    CategoryModelEntity save(CategoryDTO categoryDTO);

    CategoryModelEntity getById(Long id);

    CategoryModelEntity update(CategoryModelEntity categoryModelEntity);

    void  deleteById(Long id);
    void enableById(Long id);

    boolean findCategoryByName(CategoryDTO categoryDTO);
}