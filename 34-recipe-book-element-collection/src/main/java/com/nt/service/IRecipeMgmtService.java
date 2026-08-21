package com.nt.service;

import java.util.List;

import com.nt.entity.RecipeBook;

public interface IRecipeMgmtService {
	
	String addRecipeBook(RecipeBook recipe);
	List<RecipeBook> showAll();
	RecipeBook viewRecipeById(Long id);
	String updateIngredient(Long id,List<String> ingredients);
	String deleteAll();

}
