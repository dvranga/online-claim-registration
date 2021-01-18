package com.blz.onlineclaimregistartion.dto;

import lombok.Data;

@Data
public class LogInResponseDTO {

	private String message;
	private Object data;
	private int statusCode;
	private String roleCode;
	private String userName;
	
	public LogInResponseDTO(int statusCode, String message) {
		this.message = message;
		this.statusCode = statusCode;
	}

	public LogInResponseDTO(int statusCode, String message, Object data, String roleCode, String userName) {
		this.message = message;
		this.data = data;
		this.statusCode = statusCode;
		this.roleCode = roleCode;
		this.userName = userName;
		
	}
}
