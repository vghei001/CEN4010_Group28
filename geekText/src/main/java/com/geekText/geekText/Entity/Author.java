package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Author")
@NoArgsConstructor
@AllArgsConstructor
public class Author{

    @Id
    @Column(name = "AuthorID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AuthorID;

    @Column(name = "AuthorName")
    private String AuthorName;


}
