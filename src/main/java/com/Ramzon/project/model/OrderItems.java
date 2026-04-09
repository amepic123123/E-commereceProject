package com.Ramzon.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.persistence.Column;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(uniqueConstraints = 
    @jakarta.persistence.UniqueConstraint(columnNames = {"order_id", "product_item_id"})
)
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Orders order;

    @NotNull
    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @JoinColumn(name = "product_item_id", nullable = false)
    private ProductItems productItems;

    @NotNull
    @Positive
    @Column(name = "quantity", nullable = false)
    private Integer quantity;




    
}
