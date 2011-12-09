package com.studentmanagement.domain;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Student.class)
public interface StudentRepository {
}
