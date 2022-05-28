package com.AlbertAbuav.Exhibition.controller;

import com.AlbertAbuav.Exhibition.beans.Company;
import com.AlbertAbuav.Exhibition.exceptions.ExhibitionSystemException;
import com.AlbertAbuav.Exhibition.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("companies")  //==>  http://localhost:8080/companies
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

//    @PostMapping("add")
//    public ResponseEntity<?> addCompany(Company company) throws ExhibitionSystemException {
//        companyService.addCompany(company);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }

    @PostMapping  //==>  http://localhos t:8080/companies
    @ResponseStatus(HttpStatus.CREATED)  //==> Return 201 (created)
    public void addCompany(@RequestBody Company company) throws ExhibitionSystemException {
        companyService.addCompany(company);
    }

    @PutMapping("/{id}") //==>  http://localhost:8080/companies/1
    @ResponseStatus(HttpStatus.NO_CONTENT) //==> Return 204 (ok and no content)
    public void updateCompany(@PathVariable int companyId, @RequestBody Company company) throws ExhibitionSystemException {
        companyService.updateCompany(company);
    }
}
