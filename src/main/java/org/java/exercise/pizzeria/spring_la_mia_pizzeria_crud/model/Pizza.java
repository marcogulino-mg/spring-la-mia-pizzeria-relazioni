package org.java.exercise.pizzeria.spring_la_mia_pizzeria_crud.model;

import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
@Table(name = "pizza")
public class Pizza {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotBlank(message = "Name must not be null, nor empty or blank")
    @Column(name = "name", nullable = false, length = 50)
    String name;

    @Lob
    @Column(name = "description", nullable = false, length = 100)
    @NotBlank(message = "Description must not be null, nor empty or blank")
    String description;

    @Column(name = "photo_url", nullable = false, length = 100)
    @NotBlank(message = "Photo_url must not be null, nor empty or blank")
    String photo_url;

    @NotNull
    @Column(name = "price", nullable = false)
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    BigDecimal price;

    // Methods
    // INFO: Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // INFO: Others Methods
    @Override
    public String toString(){
        return String.format("%s %s %.2f", this.name, this.description, this.price);
    }
}
