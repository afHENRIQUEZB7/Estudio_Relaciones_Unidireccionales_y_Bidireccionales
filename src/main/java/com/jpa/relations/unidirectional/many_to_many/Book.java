package com.jpa.relations.unidirectional.many_to_many;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni_Book_many_to_many")
@Table(name = "uni_Book_many_to_many")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(targetEntity = Autor.class, fetch = FetchType.LAZY)
    @JoinTable(name = "book_autor_unidirectional",joinColumns = @JoinColumn(name = "id_book"),inverseJoinColumns = @JoinColumn(name = "id_autor"))
    private List<Autor> autors;
}
