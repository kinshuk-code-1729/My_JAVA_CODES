package kinshuk.com.Access_Modifiers.AccMod02;

import kinshuk.com.Access_Modifiers.AccMod01.Animal;

public class Lion extends Animal {
    public void display()
    {
        /*Animal animal = new Animal();
        System.out.println(animal.canFly); test*/
        System.out.println(canFly);//protected members can be accessed outside the package in the child classes
    }
}