//package com.wheogus.account.repository;
//
//import com.wheogus.account.entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.web.bind.annotation.PathVariable;
//
//public interface UserRepository extends JpaRepository<User, Integer> {
//    @Query(value = "select totalM from user where user_id =: userId", nativeQuery = true)
//    User findByUserId(@Param("userId") String userId);
//}
