package za.co.guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import za.co.guru.springframework.domain.Category;
import za.co.guru.springframework.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
