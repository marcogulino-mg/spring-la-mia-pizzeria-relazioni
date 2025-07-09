package org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.controller;

import org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.model.Discount;
import org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.repository.DiscountRepository;
import org.java.exercise.pizzeria.spring_la_mia_pizzeria_relazioni.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/discounts")
public class DiscountController {

    @Autowired
    private DiscountRepository repository;

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("discount") Discount formDiscount,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "/discounts/create";
        }

        repository.save(formDiscount);
        return "redirect:/pizzas";
    }

}
