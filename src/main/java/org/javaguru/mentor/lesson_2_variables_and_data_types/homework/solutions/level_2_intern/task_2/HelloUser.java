package org.javaguru.mentor.lesson_2_variables_and_data_types.homework.solutions.level_2_intern.task_2;

import java.util.Scanner;

class HelloUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
    }

}
