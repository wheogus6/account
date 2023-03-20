package com.wheogus.account.repository;

import com.wheogus.account.entity.Plus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;


public interface PlusRepository extends JpaRepository<Plus, Integer> {


    Plus findByPdate(Date pDate);
}
