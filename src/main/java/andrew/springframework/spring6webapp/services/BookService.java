package andrew.springframework.spring6webapp.services;

import andrew.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
