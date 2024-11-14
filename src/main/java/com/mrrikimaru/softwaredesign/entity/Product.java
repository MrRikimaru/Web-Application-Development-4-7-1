package com.mrrikimaru.softwaredesign.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double calories;
    private double fats;
    private double proteins;

    // Конструкторы
    public Product() {}

    public Product(String name, double calories, double fats, double proteins) {
        this.name = name;
        this.calories = calories;
        this.fats = fats;
        this.proteins = proteins;
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCalories() { return calories; }
    public void setCalories(double calories) { this.calories = calories; }

    public double getFats() { return fats; }
    public void setFats(double fats) { this.fats = fats; }

    public double getProteins() { return proteins; }
    public void setProteins(double proteins) { this.proteins = proteins; }
}