public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Korgi","small",20);

    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if (speed=="slow")
        {
            walk();
            wagTail();
        }
        else
        {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public void makeNoise(){

    }

    public void bark(){
        System.out.println("Woof!");
    }
    public void run(){
        System.out.println("Dog running");
    }
    public void walk(){
        System.out.println("Dog walking");
    }
    public void wagTail(){
        System.out.println("Tail waging");
    }
}
