package com.partyapp.commons.login.service;

import com.partyapp.commons.entities.user.LoginDTO;

public interface ILoginService {
    public LoginDTO login(LoginDTO request);
    public LoginDTO saveLogin(LoginDTO request);
}
