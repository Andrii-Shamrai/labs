package com.example.demo.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "contact_number")
    private String contactNumber;

    // Явный конструктор без аргументов для JPA
    public User() {
        // Можно оставить этот конструктор пустым или инициализировать значения по умолчанию, если нужно
    }

    // Конструктор с параметрами
    public User(String name, String surname, String email, String contactNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Геттеры (или используйте Lombok аннотацию @Getter)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

}
