package com.company;

public class Main {

    public static void main(String[] args) {
	String name;
	final int num = 7;
	
	String word = "Azila";
	name = num + word;

        System.out.println(name);
        if (num < 0) {
			System.out.println("Вы сохранили отрицательное число");
		}
        else  if (num > 0) {
			System.out.println("Вы сохранили положительное число");
		}else {
			System.out.println("Вы сохранили нол");
		}
    }
}
