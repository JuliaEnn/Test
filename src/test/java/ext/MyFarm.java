package ext;

public class MyFarm {

    public static void main(String[] args) {
        Cat oli = new Cat("Oli");

        Dog dog1 = new Dog("Timur");

        oli.eat();
        oli.say();

        dog1.eat();
        dog1.say();

        System.out.println(dog1.getName());
        dog1.setName("Gerald");
        System.out.println(dog1.getName());
        dog1.setName("Gerald");
    }
}
