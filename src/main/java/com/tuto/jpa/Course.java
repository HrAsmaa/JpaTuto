package com.tuto.jpa;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "course")
@EqualsAndHashCode(callSuper = true)
public class Course extends BaseClass{

    private String name;

    private String description;

    @ManyToMany
    @JoinTable(
            name = "courses_authors",
            joinColumns = {
                   @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
