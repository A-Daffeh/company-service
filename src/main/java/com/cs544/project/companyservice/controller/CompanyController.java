package com.cs544.project.companyservice.controller;

import com.cs544.project.companyservice.entity.Company;
import com.cs544.project.companyservice.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Company getCompany(@PathVariable Long id) {
        return companyService.getByCompanyId(id);
    }



    @PostMapping(value = "/add", consumes = "application/json")
    public Company addCompany(@RequestBody Company company) {
       return companyService.addCompany(company);
    }



    @PutMapping(value = "/{id}", consumes = "application/json")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company company) {
        if (id != company.getCompanyId())
            throw new IllegalArgumentException();
        companyService.update(company);
        return company;
    }
}
