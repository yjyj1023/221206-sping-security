package com.springsecurity.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.internal.build.AllowPrintStacktrace;

@AllArgsConstructor
@Getter
public class UserLoginRequest {
    private String userName;
    private String password;

}
