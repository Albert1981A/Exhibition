package com.AlbertAbuav.Exhibition.services;

import com.AlbertAbuav.Exhibition.beans.Company;
import com.AlbertAbuav.Exhibition.exceptions.ExhibitionSystemException;

import java.util.List;

public interface CompanyService {

    void addCompany(Company company) throws ExhibitionSystemException;
    void updateCompany(Company company) throws ExhibitionSystemException;
    void deleteCompany(int companyId) throws ExhibitionSystemException;
    List<Company> getAllCompanies();
    Company getSingleCompany(int companyId) throws ExhibitionSystemException;

}
