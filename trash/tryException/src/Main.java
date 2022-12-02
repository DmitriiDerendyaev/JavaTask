public class Main {
    public static void main(String[] args) {
//        Frog frog = new Frog();
//
//        System.out.println(frog.getName());

//        Frog frog = new Frog();
        IAnimal animal = new Frog();
        Mammal mammal = (Mammal) animal;
    }
}