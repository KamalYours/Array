public class Main implements InterfaceA , InterfaceB {


    @Override
    public void printSomething() {
        System.out.println("I am in the main  class");

        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.printSomething();
    }
}
