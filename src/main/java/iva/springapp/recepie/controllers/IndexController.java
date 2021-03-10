package iva.springapp.recepie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By iVa on 2/19/2021.
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index","/index.html"})
    public String getIndexPage(){
        return "index";
    }
}
