package com.Ramzon.project.model;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotBlank
    @Column(unique = true,name = "email", nullable = false)
    private String email;

    @NotBlank
    @Column(name = "hashed_password", nullable = false)
    private String hashedPassword;

    @NotBlank
    @Size(min = 3, max = 50)
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank
    @Size(min = 3, max = 50)
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotBlank
    @Size(min = 10, max = 15)
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
    @Column(updatable = false, name = "created_at", nullable = false)
    private LocalDateTime createdAt;

}
