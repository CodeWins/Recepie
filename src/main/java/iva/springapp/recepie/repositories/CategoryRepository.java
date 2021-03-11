package iva.springapp.recepie.repositories;

import iva.springapp.recepie.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By iVa on 3/11/2021.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
