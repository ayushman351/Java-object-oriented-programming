package assisted_problems;


class Animal {
   String name;
   int age;

   void makeSound(){
     System.out.println("Animal makes sound");
   }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }

}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows");
    }

}

class Bird extends Animal{
    void makeSound(){
        System.out.println("Bird chirps");
    }

}

class Problem1 {
public static void main(String[] args) {
    Animal animal1=new Dog();
    Animal animal2=new Cat();
    Animal animal3=new Bird();

    animal1.makeSound();
    animal2.makeSound();
    animal3.makeSound();
}
    
}