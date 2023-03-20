package com.wheogus.account.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {

    private Integer id;
    private String userId;
    private int totalM;
    private String pwd;


}
