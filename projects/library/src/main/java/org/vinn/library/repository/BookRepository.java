package org.vinn.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vinn.library.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
