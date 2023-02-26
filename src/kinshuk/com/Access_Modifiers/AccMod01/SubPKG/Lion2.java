package kinshuk.com.Access_Modifiers.AccMod01.SubPKG;
import kinshuk.com.Access_Modifiers.AccMod01.Animal;
public class Lion2 extends Animal{
    public void display()
    {
        /*Animal animal = new Animal();
        System.out.println(animal.canFly);*/
        System.out.println(canFly);//protected members can be accessed outside the package in the child classes
    }
}
