package ext;

import Task2.Pig;

public class MyFarm {

    public static void main(String[] args) {
        Cat oli = new Cat("Oli");

        Dog dog1 = new Dog("Timur");

        Pig pig1 = new Pig("Ira");

        oli.eat();
        oli.say();

        dog1.eat();
        dog1.say();

        pig1.run();
        pig1.sleep();
        pig1.eat();

        System.out.println(dog1.getName());
        dog1.setName("Gerald");
        System.out.println(dog1.getName());
        dog1.setName("Gerald");
    }
}
