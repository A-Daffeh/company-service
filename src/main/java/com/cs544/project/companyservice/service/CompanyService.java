package com.cs544.project.companyservice.service;

import com.cs544.project.companyservice.entity.Company;
import com.cs544.project.companyservice.repository.ICompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private ICompanyDao companyDao;

    public Company addCompany(Company company) {
        return companyDao.save(company);
    }

    public Company getByCompanyId(Long id) {
        return companyDao.getByCompanyId(id);
    }

    public void update(Company company) {
        companyDao.save(company);
    }

}
