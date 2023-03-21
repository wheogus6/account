package com.wheogus.account.dto;

import lombok.*;


import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
public class PlusDto {

    private Integer plusId;

    private int plusM;

    private Date pDate;

    private String pContent;



}
