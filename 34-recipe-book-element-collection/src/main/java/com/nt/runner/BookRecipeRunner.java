package com.nt.runner;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.RecipeBook;
import com.nt.service.IRecipeMgmtService;

import jakarta.persistence.criteria.CriteriaBuilder.Case;

@Component
public class BookRecipeRunner implements CommandLineRunner {

	@Autowired
	private IRecipeMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		while(true) {
		IO.println("1.Save Recipe Book \n2.View All \n3.View by id \n4.Update Ingredients \n5.Delete All\n6.Exit");
		
		int choice = Integer.parseInt(IO.readln("Enter Your Choice"));
		switch(choice)
		{
		case 1->
		   {
			  String rname=IO.readln("Enter Recipe name");
			  String cuisine = IO.readln("Enter Cuisine");
			  List<String> gredients = new ArrayList<>();
			  int n = Integer.parseInt(IO.readln("Enter no of ingredients you want "));
			  for(int i=0;i<n;i++)
			  {
				  gredients.add(IO.readln((i+1)+" Enter gradient  "));
			  }
			  Set<String> tips= new LinkedHashSet<>();
			   n = Integer.parseInt(IO.readln("Enter no of Cooking tips you want "));
			  for(int i=0;i<n;i++)
			  {
				  tips.add(IO.readln((i+1)+" Enter Tips  "));
			  }
			  
			  RecipeBook rb=  new RecipeBook(rname,cuisine,gredients,tips);
			  String recipeBook = service.addRecipeBook(rb);
			  IO.println(recipeBook);
		   }
		   
		case 2-> service.showAll().forEach(IO::println);
		case 3->{
			  Long id = Long.parseLong(IO.readln("Enter ID"));
			  RecipeBook viewRecipeById = service.viewRecipeById(id);
			  IO.println(viewRecipeById);
		}
		case 4->{
			 Long id = Long.parseLong(IO.readln("Enter ID"));
			 List<String> gredients = new ArrayList<>();
			  int n = Integer.parseInt(IO.readln("Enter no of ingredients you want "));
			  for(int i=0;i<n;i++)
			  {
				  gredients.add(IO.readln((i+1)+" Enter gradient  "));
			  }
			  service.updateIngredient(id, gredients);
			
		}
		case 5->IO.println(service.deleteAll());
		case 6->System.exit(0);
		}
		}

	}

}
