package za.co.guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import za.co.guru.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
