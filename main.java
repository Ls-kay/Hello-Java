package za.co.wethinkcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Create Person object
       Person p = new Person();

        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter surname:");
        String surname =  sc.nextLine();
        System.out.println("Enter your email:");
        String email = sc.nextLine();

//        p.setName(name);
//        p.setSurname(surname);
//        p.setEmail(email);

         Person p1 = new Person(name, surname, email);

        System.out.println("Name:\t" + p1.getName());
    }
}
