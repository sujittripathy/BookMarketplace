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

    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @GetMapping("/add")
    public String addBook(Model model){
        model.addAttribute("book",new BookDomain());
        return "AddBook";
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
        return "ListBook";
    }

    @GetMapping("/delete/{isbn}")
    public String delete(@PathVariable Integer isbn){
        bookRepository.delete(isbn);
        return "redirect:/home";
    }

    @GetMapping("/search")
    public String searchGet(Model model){
        model.addAttribute("book",new BookDomain());
        return "SearchBook";
    }

    @PostMapping("/search")
    public String searchPost(@ModelAttribute BookDomain bookDomain, Model model)
    {
        List<Book> bookList= bookRepository.findByTitle(bookDomain.getTitle());
        System.out.print("Title >>"+bookDomain.getTitle()+", Size>> "+bookList.size());
        model.addAttribute("book",new BookDomain());
        model.addAttribute("bookList",bookList);
        return "SearchBook";
    }

    @GetMapping("/edit/{isbn}")
    public String edit(@PathVariable Integer isbn, Model model){
        Book book=bookRepository.findOne(isbn);
        model.addAttribute("book_edit",book);
        return "EditBookDetails";
    }

    @RequestMapping(value = "/editPut", method =   RequestMethod.POST,
                    headers = "content-type=application/x-www-form-urlencoded")
    public String editPut(@ModelAttribute Book book, Model model){
        //Book book=bookRepository.findOne(isbn);
        System.out.println("Book Details ::"+book.getTitle());
        model.addAttribute("book",book);
        return "EditBookDetails";
    }

    @PostMapping("/edit")
    public String editPost(@ModelAttribute Book book, Model model){
        System.out.print(book.getIsbn()+","+book.getTitle());
        bookRepository.save(book);
        return "redirect:/home";
    }
}
