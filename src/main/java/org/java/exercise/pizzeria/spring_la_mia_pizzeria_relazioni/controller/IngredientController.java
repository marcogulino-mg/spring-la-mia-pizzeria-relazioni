package org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.controller;

import org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.model.Ingredient;
import org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    private IngredientRepository repository;

    // CRUD
    // INFO: Create
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("ingredient", new Ingredient());
        return "/ingredients/create-or-edit";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("ingredient") Ingredient formIngredient,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "/ingredients/create-or-edit";
        }

        repository.save(formIngredient);
        return "redirect:/ingredients";
    }
}
