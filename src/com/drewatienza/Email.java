package com.drewatienza;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODE:\n" +
                "1 for Sales\n" +
                "2 for Development\n" +
                "3 for Accounting\n" +
                "0 for none\n" +
                "Enter department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        switch (deptChoice) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "acct";
            default:
                return "none";
        }
    }


    // Generate a random password

    // Set the mailbox capacity

    // Set the alternative email

    // Change the password
}
