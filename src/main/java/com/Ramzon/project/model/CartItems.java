package com.Ramzon.project.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.persistence.Column;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CartItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotNull
    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @JoinColumn(name = "product_item_id", nullable = false)
    private ProductItems productItems;

    @PositiveOrZero
    @NotNull
    @Column(name = "quantity", nullable = false)
    private Integer quantity;



    
}
