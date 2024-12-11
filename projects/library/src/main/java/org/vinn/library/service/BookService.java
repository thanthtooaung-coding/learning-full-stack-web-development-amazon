package org.vinn.library.service;

import org.vinn.library.model.Book;

public interface BookService {
    Book findBookById(Long id);
    Book updateBook(Book book);
}
