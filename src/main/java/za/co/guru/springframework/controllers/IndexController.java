package za.co.guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.guru.springframework.domain.Category;
import za.co.guru.springframework.domain.UnitOfMeasure;
import za.co.guru.springframework.repositories.CategoryRepository;
import za.co.guru.springframework.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @RequestMapping({"","/","/index"})
    String indexPage(){
        System.out.println("Message 1236");
        Optional<Category> category = categoryRepository.findByDescription("Mexican");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Tablespoon");

        System.out.println("Category id is: " + category.get().getId());
        System.out.println("Unit of Measure id is: " + unitOfMeasure.get().getId());
       return "index";
    }
}
