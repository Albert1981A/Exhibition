package com.AlbertAbuav.Exhibition.services;

import com.AlbertAbuav.Exhibition.beans.Company;
import com.AlbertAbuav.Exhibition.exceptions.ErrorMessage;
import com.AlbertAbuav.Exhibition.exceptions.ExhibitionSystemException;
import com.AlbertAbuav.Exhibition.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImplement implements CompanyService{

    private final CompanyRepository companyRepository;

    @Override
    public void addCompany(Company company) throws ExhibitionSystemException {
        if(companyRepository.existsById(company.getId())) {
            throw new ExhibitionSystemException(ErrorMessage.ID_ALREADY_EXIST);
        }
        companyRepository.save(company);
    }

    @Override
    public void updateCompany(Company company) throws ExhibitionSystemException {
        if(!companyRepository.existsById(company.getId())) {
            throw new ExhibitionSystemException(ErrorMessage.ID_NOT_FOUND);
        }
        companyRepository.saveAndFlush(company);
    }

    @Override
    public void deleteCompany(int companyId) throws ExhibitionSystemException {
        if(!companyRepository.existsById(companyId)) {
            throw new ExhibitionSystemException(ErrorMessage.ID_NOT_FOUND);
        }
        companyRepository.deleteById(companyId);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getSingleCompany(int companyId) throws ExhibitionSystemException {
        return companyRepository.findById(companyId).orElseThrow(()-> new ExhibitionSystemException(ErrorMessage.ID_NOT_FOUND));
    }
}
