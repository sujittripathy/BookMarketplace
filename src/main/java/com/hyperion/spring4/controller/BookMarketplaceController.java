package com.hyperion.spring4.controller;

import com.hyperion.spring4.domain.Book;
import com.hyperion.spring4.service.BookMarketplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sujittripathy on 9/22/16.
 */
@Controller
public class BookMarketplaceController  {

    @Autowired
    BookMarketplaceService bookMarketplaceService;

    /*@RequestMapping(path = "/addBook",method = RequestMethod.POST)
    public String addBook(Book book){
        return null;
    }*/

    /*@RequestMapping(path="/test",method = RequestMethod.GET)
    public String test(Model model)
    {
        System.out.print("Inside test method ...");
        model.addAttribute("recipient","Hello New Recipient");
        return "index";
    }*/

    @RequestMapping(path="/new",method = RequestMethod.GET)
    public String test(ModelMap modelMap)
    {
        modelMap.addAttribute("greetings","Hello There !");
        return "index";
    }
    @RequestMapping(path="/",method = RequestMethod.GET)
    public String test1(ModelMap modelMap)
    {
        modelMap.addAttribute("greetings","Hello There EMPTY !");
        return "index";
    }
}
