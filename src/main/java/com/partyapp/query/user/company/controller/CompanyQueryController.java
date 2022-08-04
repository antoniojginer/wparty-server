package com.partyapp.query.user.company.controller;

import com.partyapp.commons.entities.user.base.BaseUserDTO;
import com.partyapp.commons.entities.user.company.CompanyUserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user/company")
public class CompanyQueryController implements ICompanyUserQueryController {

    @Override
    @GetMapping("/{id}")
    public CompanyUserDTO getUser(@PathVariable("id") Long id) {
        // TODO
        return null;
    }
    public List<CompanyUserDTO> getAllUsers() {
        // TODO
        return null;
    }
}
