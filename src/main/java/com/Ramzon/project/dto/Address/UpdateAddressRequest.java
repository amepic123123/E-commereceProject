package com.Ramzon.project.dto.Address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UpdateAddressRequest(

    @NotBlank(message = "Address line is required")
    @Size(max = 200, message = "Address line must be less than 200 characters")
    String addressLine,
    @NotBlank(message = "City is required")
    @Size(max = 100, message = "City must be less than 100 characters")
    String city,
    @NotBlank(message = "State is required")
    @Size(max = 100, message = "State must be less than 100 characters")
    String state,
    @NotBlank(message = "Postal code is required")
    @Size(max = 20, message = "Postal code must be less than 20 characters")
    String postalCode,
    @NotBlank(message = "Country is required")
    @Size(max = 100, message = "Country must be less than 100 characters")
    String country,
    Boolean isDefault


) {}
