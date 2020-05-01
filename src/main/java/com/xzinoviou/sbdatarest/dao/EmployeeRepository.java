package com.xzinoviou.sbdatarest.dao;

import com.xzinoviou.sbdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="users")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
