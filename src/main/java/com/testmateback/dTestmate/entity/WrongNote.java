package com.testmateback.dTestmate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class WrongNote {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String index;
    @Column(nullable = false)
    private String note_subject;
    @Column(nullable = false)
    private String note_semester;
    @Column(nullable = false)
    private String note_photo;
    @Column(nullable = false)
    private String note_solution;
    @Column(nullable = false)
    private String note_testStyle;
    @Column(nullable = false)
    private String note_reason;
    @Column(nullable = false)
    private String note_testScope;

}