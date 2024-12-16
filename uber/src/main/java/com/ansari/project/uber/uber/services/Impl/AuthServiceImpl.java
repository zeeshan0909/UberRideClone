package com.ansari.project.uber.uber.services.Impl;

import com.ansari.project.uber.uber.dto.DriverDto;
import com.ansari.project.uber.uber.dto.SignupDto;
import com.ansari.project.uber.uber.dto.UserDto;
import com.ansari.project.uber.uber.services.AuthServiec;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthServiec {
    @Override
    public String login(String userName, String Password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onBordNewDriver(Long userId) {
        return null;
    }
}
