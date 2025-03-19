package hybrid_inheritance;

class Person {
    String name;
    int id;

    Person(String name, int id){
        this.name=name;
        this.id=id;
    }
}

interface Worker {
    void performDuties();

}

class Chef extends Person implements Worker{
    
    Chef(String name,int id){
        super(name, id);
    }
    
    public void performDuties(){
        System.out.println(name+"(Chef) prepares food");
    }
}

class Waiter extends Person implements Worker{
     
    Waiter(String name, int id){
        super(name, id);
    }

    public void performDuties(){
        System.out.println(name+"(Watier) takes order");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Worker chef=new Chef("Bob", 103);
        Worker waiter=new Waiter("Martin", 105);

        chef.performDuties();
        waiter.performDuties();
    }
}
