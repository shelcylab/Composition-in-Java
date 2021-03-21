package udemy.composition.function;

public class Laptop {

    Processor pr = new Processor();
    private String ram;
    private String screen;
    private Processor processor;

    public Laptop() {
        this.ram = "2GB";
        this.screen = "16.5";
        this.processor = new Processor();
    }

    public Laptop(String ram, String screen, Processor processor) {
        this.ram = ram;
        this.screen = screen;
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public String getScreen() {
        return screen;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String gameMode() {
        processor.setNewBrand(processor.getoldBrand());

        return processor.getNewBrand();
    }

    @Override
    public String toString() {
        return "Laptop{" + "ram=" + ram + ", screen=" + screen + ", processor=" + processor + '}';
    }

}
