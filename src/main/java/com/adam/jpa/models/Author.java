package com.adam.jpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
//@Table(name = "AUTHOR_TBL")
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    @Column(unique=true, nullable=false)
    private String email;

    private int age;

    @Column(updatable=false, nullable = false)
    private LocalDateTime createdAt;

    @Column(insertable=false)
    private LocalDateTime updatedAt;


}
