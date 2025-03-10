package com.blz.onlineclaimregistartion.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class UserDTO {

	// UserName is 6-20 characters long,Should not start and end with _ or . and in
	// between __ or _. or ._ or .. also not allowed.
	@NotEmpty(message = "UserName can't be null ")
	@Pattern(regexp = "^(?=[a-zA-Z0-9.@_]{6,20}$)(?!.*[_.]{2})[^_.].*[^_.]$", message = "Invalid UserName")
	public String userName;

	// Password is 8 characters long and must be the combination of least one
	// uppercase, lowercase, special character and number.
	@Pattern(regexp = "^(?=.*[@#$%^&+=])(?=.*[0-9])(?=.*[A-Z]).{8,}$", message = "Invalid Pattern")
	@NotEmpty(message = "Password can't be null ")
	public String password;
}
