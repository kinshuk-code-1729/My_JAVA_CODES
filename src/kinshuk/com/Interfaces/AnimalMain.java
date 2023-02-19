package kinshuk.com.Interfaces;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal aml = new Animal(); abstract can't be instantiated
        Bird bird = new Bird();
        bird.speak();
        Tiger tgr = new Tiger();
        tgr.speak();
        Animal Ab = new Bird();
        Animal At = new Tiger();
        Ab.speak();
        At.speak();
    }
}
