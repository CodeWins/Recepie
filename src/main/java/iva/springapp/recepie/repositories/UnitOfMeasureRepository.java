package iva.springapp.recepie.repositories;

import iva.springapp.recepie.domain.Category;
import iva.springapp.recepie.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created By iVa on 3/11/2021.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
