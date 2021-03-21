package udemy.composition.object;

/**
 * Program showing how to call an object within an object. We need getter
 * methods within classes having that object.
 */
public class Demo {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        System.out.println(laptop);

        System.out.println("The processor brand is : " + laptop.getProcessor().getBrand());

        System.out.println("The graphicscard series is :" + laptop.getGraphicsCard().getSeries());
    }

}
