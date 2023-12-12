package ie.atu;

import java.util.Scanner;
public class StudentInfo {
    @Override
    public String toString() {

        userInput userInput = new userInput();
        userInput.getuserInput();

        System.out.println("Name: " + userInput.getName());
        System.out.println("Address: " + userInput.getAddress());
        System.out.println("ID Number: " + userInput.getIdNum());
        System.out.println("Age: " + userInput.getAge());
        return null;
    }
}
