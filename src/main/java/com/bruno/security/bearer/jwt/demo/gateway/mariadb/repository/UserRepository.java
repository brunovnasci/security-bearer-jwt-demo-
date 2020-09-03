package com.bruno.security.bearer.jwt.demo.gateway.mariadb.repository;

import com.bruno.security.bearer.jwt.demo.gateway.mariadb.model.UserDBDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDBDomain, Long> {

}
