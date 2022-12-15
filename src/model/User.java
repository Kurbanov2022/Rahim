package model;

import enums.Gender;
import enums.Role;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class User {
    private Long id;
    private Role role;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private BigDecimal money;
    private List<Book> books;


    public User(Long id, Role role, String name, String surname, String email, String phoneNumber, Gender gender) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber=phoneNumber;
        this.gender = gender;
    }

    public User(Long id, Role role, String name, String surname, String email,String phoneNumber, Gender gender, BigDecimal money, List<Book> books) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber=phoneNumber;
        this.gender = gender;
        this.money = money;
        this.books = books;
    }
}
