package udemy.composition.object;

class Laptop {

    protected float screen;
    protected String ram;
    protected String hardDrive;
    protected String opticalDrive;
    protected String keyboard;
    protected Processor processor;//Processor is a custom datatype.
    protected GraphicsCard graphicsCard;//GraphicsCard is a custom datatype.

    public Laptop() {
        this.screen = 15.6f;
        this.ram = "DDR4";
        this.hardDrive = "2TB";
        this.opticalDrive = "MLT Layer";
        this.keyboard = "Backlit";
        this.processor = new Processor();//Creating the object of Processor custom class
        this.graphicsCard = new GraphicsCard();//Creating the object of GraphicsCard custom class.
    }

    public Laptop(float screen, String ram, String hardDrive, String opticalDrive, String keyboard, Processor processor, GraphicsCard graphicsCard) {
        this.screen = screen;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
    }

    public float getScreen() {
        return screen;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }
    
    

    @Override
    public String toString() {
        return "Laptop{" + "screen=" + screen + ", ram=" + ram + ", hardDrive=" + hardDrive + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + ", processor=" + processor + ", graphicsCard=" + graphicsCard + '}';
    }

}
