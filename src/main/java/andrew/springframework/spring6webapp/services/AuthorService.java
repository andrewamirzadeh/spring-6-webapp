package andrew.springframework.spring6webapp.services;

import andrew.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
