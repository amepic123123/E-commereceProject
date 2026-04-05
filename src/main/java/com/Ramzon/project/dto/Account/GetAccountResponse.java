package com.Ramzon.project.dto.Account;

public record GetAccountResponse(

    Long id,
    String firstName,
    String lastName,
    String email,
    String phoneNumber
    
) {}
