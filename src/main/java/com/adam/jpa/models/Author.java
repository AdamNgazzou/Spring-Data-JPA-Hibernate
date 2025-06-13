package com.adam.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity{



    private String firstName;

    private String lastName;

    @Column(unique=true, nullable=false)
    private String email;

    private int age;

    @Column(updatable=false, nullable = false)
    private LocalDateTime createdAt;

    @Column(insertable=false)
    private LocalDateTime updatedAt;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses ;

}
