package com.sofkau.webdevappback.dto.mapper;

import com.sofkau.webdevappback.dto.CategoryDto;
import com.sofkau.webdevappback.entity.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TaskMapper.class})
public interface CategoryMapper {

    CategoryDto toCategoryDto(Category category);

    List<CategoryDto> toCategoryDtos(List<Category> categories);

    @InheritInverseConfiguration
    Category toCategory(CategoryDto categoryDto);

    List<Category> toCategories(List<CategoryDto> categoryDtos);

}
