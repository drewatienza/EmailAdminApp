package com.drewatienza;

public class Main {

    public static void main(String[] args) {
	    Email em1 = new Email("Drew", "Atienza");

	    em1.setAlternateEmail("atienza.drew@gmail.com");
        System.out.println("Alternate email is: " + em1.getAlternateEmail());
    }
}
