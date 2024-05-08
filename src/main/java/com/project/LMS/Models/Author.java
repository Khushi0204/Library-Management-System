package com.project.LMS.Models;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(unique = true)
    private String email;

    @CreationTimestamp
    private Date createdOn;

    @OneToMany(mappedBy = "author")
    private List<Book> bookList;


}
