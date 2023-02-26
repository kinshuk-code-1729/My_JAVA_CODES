package kinshuk.com.Access_Modifiers.AccMod02;
import kinshuk.com.Access_Modifiers.AccMod01.Animal;
public class Tiger {
    public void display()
    {
        Animal animal = new Animal();
        //System.out.println(animal.animalName);//animalName private variable cannot be accessed outside the class
        //System.out.println(animal.animalType);//animalType default variable cannot be accessed outside the package
        System.out.println(animal.getAnimalName());//getAnimalName() public method can be accessed from anywhere
        //System.out.println(animal.canFly);//protected variable canFly cannot be accessed outside the same package
    }
}
