package com.hyperion.spring4.controller;

import com.hyperion.spring4.domain.Book;
import com.hyperion.spring4.service.BookMarketplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sujittripathy on 9/22/16.
 */
@Controller
public class BookMarketplaceController  {

    @Autowired
    BookMarketplaceService bookMarketplaceService;

    @RequestMapping(path = "/addBook",method = RequestMethod.POST)
    public String addBook(Book book){
        return null;
    }

    @RequestMapping(path="/test",method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
