package org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.controller;

import org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.model.Ingredient;
import org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    private IngredientRepository repository;

}
