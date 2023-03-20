package com.wheogus.account.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Minus {

    @Id
    private Integer minusId;

    @Column
    private int minusM;

    @Column
    private Date mDate;

    @Column
    private String mContent;
}
