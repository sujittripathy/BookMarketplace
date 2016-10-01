package com.hyperion.spring4.controller;

import com.hyperion.spring4.entity.Book;
import com.hyperion.spring4.repository.BookRepository;
import com.hyperion.spring4.service.BookMarketplaceService;
import com.hyperion.spring4.util.BookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookMarketplaceController  {

    @Autowired
    BookMarketplaceService bookMarketplaceService;
    @Autowired
    BookRepository bookRepository;

    @RequestMapping(path = "/login",method = RequestMethod.GET)
    public String signOnPage(){
        System.out.print(".... /login GET triggered ...");
        return "Login.html";
    }

    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public String home(){
        System.out.print(".... /home GET triggered ...");
        return "home.html";
    }

    @RequestMapping(path = "/add",method = RequestMethod.GET)
    public String addBook(){
        bookRepository.save(new Book("a","b","c","d","e"));
        System.out.println("Total >>"+bookRepository.count());
        return "AddBook.html";
    }
/*
    @RequestMapping(path = "/add",method = RequestMethod.POST)
    public String submitBook(Book book){
        System.out.print("Book Details ->>>>"+book.getAuthor()+","+book.getTitle()+","+book.getTitle());
        BookUtil.sampleBooks().add(book);
        return "redirect:/book/"+book.getIsbn();
    }

    @RequestMapping(path="/{isbn}",method = RequestMethod.GET)
    public String bookProfile(@PathVariable String isbn,Model model){
       // Book b=BookUtil.sampleBooks().get(BookUtil.sampleBooks().size());
        //model.addAttribute("bookList",b);
        return "ListBook.html";
    }
    @RequestMapping(path = "/list",method = RequestMethod.GET)
    public String listBook(Model model){
        model.addAttribute("bookList", BookUtil.sampleBooks());
        return "ListBook.html";
    }



    @RequestMapping(path="/test-thymeleaf",method = RequestMethod.GET)
    public String test(Model model)
    {
        model.addAttribute("recipient"," -- Thymeleaf --");
        return "index.html";
    }*/

   /* @RequestMapping(path="/test-jsp",method = RequestMethod.GET)
    public String test(ModelMap modelMap)
    {
        modelMap.addAttribute("greetings","Hello There !");
        return "index";
    }*/
}
