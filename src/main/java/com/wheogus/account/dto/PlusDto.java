package com.wheogus.account.dto;

import com.wheogus.account.entity.Plus;
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

    public static Plus createPlusDto(Plus plus) {
        return new Plus(
                plus.getPlusId(),
                plus.getPlusM(),
                plus.getPDate(),
                plus.getPContent()
        );
    }
}
