package com.Ramzon.project.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotBlank
    @Column(name = "address_line", nullable = false)
    @Size(min = 5, max = 255)
    private String addressLine;

    @NotBlank
    @Column(name = "city", nullable = false)
    @Size(min = 2, max = 100)
    private String city;

    @NotBlank
    @Column(name = "state", nullable = false)
    @Size(min = 2, max = 100)
    private String state;

    @NotBlank
    @Column(name = "postal_code", nullable = false)
    @Size(min = 4, max = 20)
    private String postalCode;
    
     @NotBlank
    @Column(name = "country", nullable = false)
    @Size(min = 2, max = 100)
    private String country;

    @NotNull
    @Column(name = "is_default", nullable = false)
    private Boolean isDefault;
}
