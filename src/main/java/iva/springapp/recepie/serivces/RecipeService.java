package iva.springapp.recepie.serivces;

import iva.springapp.recepie.domain.Recipe;

import java.util.Set;

/**
 * Created By iVa on 3/17/2021.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
