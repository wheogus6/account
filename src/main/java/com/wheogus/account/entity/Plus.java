package com.wheogus.account.entity;

import com.wheogus.account.dto.PlusDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Plus {

    @Id
    private Integer plusId;

    @Column
    private int plusM;

    @Column
    private Date pDate;

    @Column
    private String pContent;

    //엔티티로 변환
    public static Plus plusMoney(PlusDto dto) {
        return new Plus(
                dto.getPlusId(),
                dto.getPlusM(),
                dto.getPDate(),
                dto.getPContent()
        );
    }
}
