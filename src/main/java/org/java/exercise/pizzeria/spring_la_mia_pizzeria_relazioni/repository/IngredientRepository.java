package org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.repository;

import org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}
