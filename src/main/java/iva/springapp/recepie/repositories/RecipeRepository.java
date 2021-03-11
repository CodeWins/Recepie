package iva.springapp.recepie.repositories;

import iva.springapp.recepie.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By iVa on 3/11/2021.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
