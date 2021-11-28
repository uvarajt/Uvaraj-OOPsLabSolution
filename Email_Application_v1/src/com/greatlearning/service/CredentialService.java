package com.greatlearning.service;

import java.util.Random;

public class CredentialService {
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public String generatePassword() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String specialChars = "<>,.?/}]{[+_-)(*&^%$#@!=";
		String combination = upper + lower + specialChars + num;
		
		Random r = new Random();
		char[] password = new char[8];
		for(int i=0; i<8; i++) {
			password[i] = combination.charAt(r.nextInt(combination.length()));
		}
		return password.toString();	
	}
	
	public void showCredentials(String email, String password) {
		System.out.println("Your Generated Credentials are");
		System.out.println("Email    --> "+email);
		System.out.println("Password --> "+password);
	}

}
