package com.partyapp.query.user.company.dataAccess;

import com.partyapp.commons.dataAccess.query.user.company.CompanyUserDAO;
import com.partyapp.commons.entities.user.LoginDTO;

import java.util.List;

public interface ICompanyUserQueryDA {
    public CompanyUserDAO getCompanyUser(Long id);
    public List<CompanyUserDAO> getAllCompanyUsers();

}
