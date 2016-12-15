package com.advantum.activity.repository;

import com.advantum.activity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sevila <josevilah@gmail.com> on 15/12/2016.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}