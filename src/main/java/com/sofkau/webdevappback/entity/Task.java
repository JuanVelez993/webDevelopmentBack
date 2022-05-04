package com.sofkau.webdevappback.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Task")
@Table(name = "task")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="done")
    private Boolean done;

    private Long FKCategory;
}
