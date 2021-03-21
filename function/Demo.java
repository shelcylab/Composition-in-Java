package udemy.composition.function;

/**
 * Program showing how to add functions in composition.
 */
public class Demo {

    public static void main(String[] args) {

        Processor processor = new Processor("intel", 940, "windows", "mac");
        Laptop laptop = new Laptop("2GB", "16.5", processor);
        System.out.println(laptop);

        Laptop gamingLaptop = new Laptop("intel", "16.5", processor);
        System.out.println(gamingLaptop.gameMode());
        System.out.println(gamingLaptop);

    }

}
