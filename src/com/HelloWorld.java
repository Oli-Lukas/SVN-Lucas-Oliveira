package com;

public class HelloWorld {
	public static void main(String[] args) {
		int idade = 8;
	
		if (idade > 65) {
			System.out.println("Voc� j� pode se aposentar!");
		} else if (idade > 18) {
			System.out.println("Voc� � maior de idade!");
		} else if (idade < 10) {
			System.out.println("Voc� tem menos de 10 anos de idade!");
		} else {
			System.out.println("Voc� � menor de idade!");
		}
		
		System.out.println("Hello World!");
	}
}
