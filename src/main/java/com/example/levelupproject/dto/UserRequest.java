package com.example.levelupproject.dto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Builder
@RequiredArgsConstructor
@NoArgsConstructor(force = true) // 초기화를 강제하여 final필드를 0,false,null등으로 바꾸는 생성자
public class UserRequest {
    @NotNull
    private final String userId;

    @NotNull
    private final String password;

    @NotNull
    private final String username;

    @NotNull
    private final String email;
}
