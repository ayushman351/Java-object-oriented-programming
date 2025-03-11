package Constructors;


class Person{
    String firstName;
    String lastName;
    int age;
     
    Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;

    }

    Person(Person person){
           this.firstName=person.firstName;
           this.lastName=person.lastName;
           this.age=person.age;
    }
    
}
public class PersonCloning {
    public static void main(String[] args) {
        Person person1=new Person("John","Wick",35);
        Person person2;
        person2=new Person(person1);
        
        System.out.println("Person 1:");
        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.age);
        System.out.println("Person 2:");
        System.out.println(person2.firstName);
        System.out.println(person2.lastName);
        System.out.println(person2.age);
    }
}
