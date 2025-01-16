package com.ansari.project.uber.uber.services.impl;

import com.ansari.project.uber.uber.dto.DriverDto;
import com.ansari.project.uber.uber.dto.SignupDto;
import com.ansari.project.uber.uber.dto.UserDto;
import com.ansari.project.uber.uber.services.AuthService;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String Password) {
        return "";
    }

    @Override
    public UserDto SignUp(SignupDto signupdto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
