package com;

public class HelloWorld {
	public static void main(String[] args) {
		int idade = 8;
	
		if (idade > 65) {
			System.out.println("Você já pode se aposentar!");
		} else if (idade > 18) {
			System.out.println("Você é maior de idade!");
		} else if (idade < 10) {
			System.out.println("Você tem menos de 10 anos de idade!");
		} else {
			System.out.println("Você é menor de idade!");
		}
		
		System.out.println("Hello World!");
	}
}
