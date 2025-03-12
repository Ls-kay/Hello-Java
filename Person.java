package za.co.wethinkcode;

public class Person {

    //Data Members
    private String name;
    private String surname;
    private String email;

    //Default constructor
    public Person(){
        name = "Lebo";
        surname = "Msase";
        email = "ghjhb024@student.wethinkcode.co.za";
    }

    //Parameterized Constructor
    public Person(String name, String surname, String email){
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    //mutator/setter method
    public void setName(String name){
        this.name = name;
    }

    //getter method
    public String getName(){
        return name;
    }

    public String getSurname(){
       return this.surname = surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
