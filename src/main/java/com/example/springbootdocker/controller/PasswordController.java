package com.example.springbootdocker.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

	@GetMapping("/password")
	public void readFile() throws IOException, SQLException {
		String username = "steve";
		String password = "blue";
		Connection conn = DriverManager
				.getConnection("jdbc:mysql://localhost/test?" + "user=" + username + "&password=" + password); // Sensitive
	}

}
