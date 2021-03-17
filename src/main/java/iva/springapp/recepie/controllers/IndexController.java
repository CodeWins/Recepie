package iva.springapp.recepie.controllers;

import iva.springapp.recepie.domain.Category;
import iva.springapp.recepie.domain.UnitOfMeasure;
import iva.springapp.recepie.repositories.CategoryRepository;
import iva.springapp.recepie.repositories.UnitOfMeasureRepository;
import iva.springapp.recepie.serivces.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created By iVa on 2/19/2021.
 */
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
