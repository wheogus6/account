package com.wheogus.account.repository;

import com.wheogus.account.entity.Plus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;


public interface PlusRepository extends JpaRepository<Plus, Integer> {


}
