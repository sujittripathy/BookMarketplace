package com.hyperion.spring4.controller;

import com.hyperion.spring4.domain.BookDomain;
import com.hyperion.spring4.entity.Book;
import com.hyperion.spring4.repository.BookRepository;
import com.hyperion.spring4.service.BookMarketplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookMarketplaceController  {

    @Autowired
    BookMarketplaceService bookMarketplaceService;
    @Autowired
    BookRepository bookRepository;

    /*@RequestMapping(path = "/login",method = RequestMethod.GET)
    public String signOnPage(){
        return "Login.html";
    }*/

    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public String home(){
        return "home.html";
    }

    @GetMapping("/add")
    public String addBook(Model model){
        model.addAttribute("book",new BookDomain());
        return "AddBook.html";
    }

    @PostMapping("/add")
    public String addBookPost(@ModelAttribute BookDomain bookDomain){
        System.out.println("Title >>"+bookDomain.getTitle());
        Book book=new Book(bookDomain.getTitle(),bookDomain.getAuthor(),
                                bookDomain.getPublisher(),bookDomain.getCntry(),bookDomain.getPrice());
        bookRepository.save(book);
        System.out.println("Title >>"+bookRepository.count());
        return "redirect:/home";
    }
    @GetMapping("/list")
    public String listBook(Model model){
        List<Book> booList=new ArrayList();
        bookRepository.findAll().forEach(book -> {
            booList.add(book);});
        model.addAttribute("bookList",booList);
        return "ListBook.html";
    }

    @GetMapping("/delete/{isbn}")
    public String delete(@PathVariable Integer isbn){
        bookRepository.delete(isbn);
        return "redirect:/home";
    }
}
