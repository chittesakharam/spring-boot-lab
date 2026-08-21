package com.nt.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class RecipeBook {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "recipe_id",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1" )
	private Long recipeId;
	
	@NonNull
	@Column(length=30)
	private String recipeName;
	@NonNull
	@Column(length=30)
	private String cuisine;
	@NonNull
	@ElementCollection
	@CollectionTable(name="Gredients",joinColumns = @JoinColumn(name="Recipe_Id",referencedColumnName = "recipeId"))
	private List<String> gredients;
	@ElementCollection
	@NonNull
	@CollectionTable(name="Cooking_Tips",joinColumns = @JoinColumn(name="Recipe_Id", referencedColumnName = "recipeId"))
	private Set<String> cookingTips;
	
	
	

}
