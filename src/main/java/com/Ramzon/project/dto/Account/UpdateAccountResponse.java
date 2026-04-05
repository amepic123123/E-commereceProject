package com.Ramzon.project.dto.Account;

public record UpdateAccountResponse(

    Long id,
    String firstName,
    String lastName,
    String email,
    String phoneNumber,
    String message
) {}
