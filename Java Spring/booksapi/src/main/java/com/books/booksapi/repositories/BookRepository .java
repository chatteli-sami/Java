package com.books.booksapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.books.booksapi.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    // Derived query methods using Spring Data JPA naming conventions:

    // Find books by an exact match of title
    List<Book> findByTitle(String title);

    // Find books where the title contains a specified substring (case sensitive)
    List<Book> findByTitleContaining(String titlePart);

    // Find books with a number of pages greater than the specified value
    List<Book> findByNumberOfPagesGreaterThan(int numPages);

    // Find books by language
    List<Book> findByLanguage(String language);

    // Find books where the description contains a specified substring
    List<Book> findByDescriptionContaining(String keyword);

    // Custom queries using the @Query annotation:

    // Using JPQL: Find books by language and order them by title (ascending)
    @Query("SELECT b FROM Book b WHERE b.language = ?1 ORDER BY b.title ASC")
    List<Book> findBooksByLanguageOrderByTitleAsc(String language);

    // Using a native query: Search for books with a keyword in the description
    @Query(value = "SELECT * FROM books WHERE description LIKE %?1%", nativeQuery = true)
    List<Book> searchBooksByDescription(String keyword);
}

