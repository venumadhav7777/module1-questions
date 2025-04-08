package com.wecp.springinsurancemanagementapplication.repository;

import com.wecp.springinsurancemanagementapplication.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
    // extends JpaRepository
}