package com.picpaysimplificado.picpay.dtos;
import com.picpaysimplificado.picpay.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}