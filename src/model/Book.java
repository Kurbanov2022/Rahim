package model;

import enums.Genre;
import enums.Language;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;

@Getter
@Setter
public class Book {
    private Long id;
    private String name;
    private Genre genre;
    private BigDecimal price;
    private String author;
    private Language language;
    private LocalDate publishedYear;

    public Book(Long id, String name, Genre genre, BigDecimal price, String author, Language language, LocalDate publishedYear) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.author = author;
        this.language = language;
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", language=" + language +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
