package com.example.demo.dao;

import com.example.demo.models.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Mail, Long> {
}
