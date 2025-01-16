package com.ansari.project.uber.uber.services;

import com.ansari.project.uber.uber.dto.DriverDto;
import com.ansari.project.uber.uber.dto.SignupDto;
import com.ansari.project.uber.uber.dto.UserDto;

public interface AuthService {

    String login(String email, String Password);

    UserDto SignUp(SignupDto signupdto);

    DriverDto onboardNewDriver(Long userId);
}
