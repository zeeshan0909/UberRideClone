package com.ansari.project.uber.uber.services;

import com.ansari.project.uber.uber.dto.DriverDto;
import com.ansari.project.uber.uber.dto.SignupDto;
import com.ansari.project.uber.uber.dto.UserDto;

public interface AuthServiec {

    //it will return token in the format for string
    String login(String userName, String Password);

    UserDto signup(SignupDto signupDto);

    DriverDto onBordNewDriver(Long userId);

}
