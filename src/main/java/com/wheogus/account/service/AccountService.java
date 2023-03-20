package com.wheogus.account.service;

import com.wheogus.account.dto.PlusDto;
import com.wheogus.account.entity.Minus;
import com.wheogus.account.entity.Plus;
import com.wheogus.account.entity.User;
import com.wheogus.account.repository.MinusRepository;
import com.wheogus.account.repository.PlusRepository;
import com.wheogus.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AccountService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PlusRepository plusRepository;

    @Autowired
    private MinusRepository minusRepository;

    public User showTotal(Integer id) {
        return userRepository.findById(id).orElse(null);
    }


    public Plus plusMoney(PlusDto dto) {
        Plus plus = Plus.plusMoney(dto);
        Plus newPlus = plusRepository.save(plus);
        return PlusDto.createPlusDto(newPlus);
    }

    public Plus showPlus(Date pdate) {
        return plusRepository.findByPdate(pdate);
    }

}
