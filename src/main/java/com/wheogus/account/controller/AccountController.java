package com.wheogus.account.controller;

import com.wheogus.account.dto.PlusDto;
import com.wheogus.account.entity.Plus;
import com.wheogus.account.entity.User;
import com.wheogus.account.service.AccountService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/show/total/{id}")
    public User showTotal(@PathVariable Integer id){
        return accountService.showTotal(id);
    }

    @GetMapping("/show/plus/{pDate}")
    private Plus showPlus(@PathVariable Date pDate) {
        return accountService.showPlus(pDate);
    }

//    @PostMapping("/plus")
//    public Plus plusMoney(PlusDto dto, HttpSession session){
//        Integer id = (Integer) session.getAttribute("id");
//        dto.setPlusId(id);
//
//    }

}
