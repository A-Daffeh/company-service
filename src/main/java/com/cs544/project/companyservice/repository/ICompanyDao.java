package com.cs544.project.companyservice.repository;

import com.cs544.project.companyservice.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICompanyDao extends JpaRepository<Company, Long> {
    Company getByCompanyId(Long id);

}
