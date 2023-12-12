package ie.atu;


import java.util.Scanner;

public class StudentApp {
       private String name;
       private String address;
       private int idNum;
       private int age;
        
    public void StudentInfo(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Name: ");
        name = userInput.nextLine();
        System.out.println("Please Enter Student ID Number: ");
        idNum = Integer.parseInt(userInput.nextLine());
        System.out.println("Please Enter Age: ");
        age = Integer.parseInt(userInput.nextLine());
        System.out.println("Please Enter Address: ");
        address = userInput.nextLine();
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getIdNum(){
        return idNum;
    }
    public int getAge(){
        return age;
    }
}