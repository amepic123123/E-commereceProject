package com.Ramzon.project.dto.Address;

public record ListAddressResponse(

    String addressLine,
    String city,
    String state,
    String postalCode,
    String country,
    Boolean isDefault

) {}
