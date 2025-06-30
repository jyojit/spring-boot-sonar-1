package com.example.springbootdocker.controller;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

	FileController fileController = null;

	@GetMapping("/readfile")
	public void readFile() throws IOException {
		FileInputStream fis = new FileInputStream("C:/Users/jiten/.gitconfig");

		int data = fis.read();
		while (data != -1) {
			System.out.print((char) data);
			data = fis.read();
		}
	}

	@GetMapping("/doublelocking")
	public FileController doubleLocking() throws IOException {
		if (fileController == null) {
			synchronized (FileController.class) {
				if (fileController == null) {
					fileController = new FileController();
				}
			}
		}

		return fileController;
	}

}
