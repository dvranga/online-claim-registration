package com.blz.onlineclaimregistartion.service;

import java.util.List;

import javax.validation.Valid;
import com.blz.onlineclaimregistartion.dto.ForgotPasswordDTO;
import com.blz.onlineclaimregistartion.dto.RegistrationDTO;
import com.blz.onlineclaimregistartion.dto.ResetPasswordDTO;
import com.blz.onlineclaimregistartion.dto.UserDTO;
import com.blz.onlineclaimregistartion.model.User;

public interface IUserService {

	List<String> login(@Valid UserDTO userDTO);
	
	User register(@Valid RegistrationDTO registrationDTO,String token);

	User forgotPassword(@Valid ForgotPasswordDTO forgotPasswordDTO);

	User resetPassword(@Valid ResetPasswordDTO resetPasswordDTO, String token);	
}
