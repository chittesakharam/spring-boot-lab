package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.RecipeBook;
import com.nt.repository.RecipeBookRepository;

@Service
public class RecipeMgmtService implements IRecipeMgmtService {
	@Autowired
	private RecipeBookRepository repo;

	@Override
	public String addRecipeBook(RecipeBook recipe) {
		    Long recipeId = repo.save(recipe).getRecipeId();
		return  recipeId+" Id with RecipeBook Save" ;
	}

	@Override
	public List<RecipeBook> showAll() {
		
		return repo.findAll();
	}

	@Override
	public RecipeBook viewRecipeById(Long id) {
		   RecipeBook  recipe = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid ID "));
		return recipe;
	}

	@Override
	public String updateIngredient(Long id, List<String> ingredients) {
		RecipeBook recipe = repo.findById(id).get();
		recipe.setGredients(ingredients);
		repo.save(recipe);
		return id+" id RecipeBok Ingredients updated ";
	}

	@Override
	public String deleteAll() {
		    int size = repo.findAll().size();
		    repo.deleteAll();
		return size+" Records are deleted";
	}

}
