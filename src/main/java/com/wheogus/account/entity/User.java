package com.wheogus.account.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // DB가 해당 객체 인식
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private Integer id;

    @Column
    private String userId;

    @Column
    private int totalM;

    @Column
    private String pwd;
}
