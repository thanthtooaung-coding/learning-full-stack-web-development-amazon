package org.vinn.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vinn.library.model.Book;
import org.vinn.library.repository.BookRepository;
import org.vinn.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
}
