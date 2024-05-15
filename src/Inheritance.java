public class Inheritance {
    public static void main(String[] args) {
//        MountainBike mountainBike = new MountainBike(20, 10, 1);
//        System.out.println("Gear: " + mountainBike.gear);
//        System.out.println("Seat Height: " + mountainBike.getSeatHeight());
//        System.out.println("Bike speed: " + mountainBike.speed);
//
//        //Applying the brake method
//        mountainBike.applyBrake(3);
//        System.out.println("Bike speed after applying a break: " + mountainBike.speed);

        //Bird subclass
        Bird bird1 = new Bird("Falcon", "Brown", 4, 0.2);
        bird1.displayBirdInfo();

        Bird bird2 = new Bird("Hawk", "Black", 4, 0.7);
        System.out.println(); bird2.displayBirdInfo();

        //Also you can access the parent classes methods
        bird2.eatFood();

    }
}


//Parent class (Base class)

class Bicycle{
    //use protected fields when you're dealing with inheritance
    protected int gear;
    protected int speed;

    public Bicycle(int startSpeed, int startGear){
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    //Other methods
    public  void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

}

//Child classes (Sub classes)
class MountainBike extends Bicycle{
    private int seatHeight;

    public MountainBike(int startHeight, int startSpeed, int startGear){
        //super calls the constructor of the parent class (it has to be the first statement in your child constructor)
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}

class Animal{
    //common attributes
    protected String specie;
    protected String color;
    protected int noOfLegs;

    Animal(String specie, String color, int noOfLegs){
        this.specie = specie;
        this.color = color;
        this.noOfLegs = noOfLegs;
    }
    //Getters


    public String getSpecie() {
        return specie;
    }

    public String getColor() {
        return color;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    //common methods
    public void makeSound(){
        System.out.println("Animal is making sound!");
    }

    public void eatFood(){
        System.out.println("Animal is eating food!");
    }

    public void walk(){
        System.out.println("Animal is walking!");
    }
}

//Subclasses of Animal class
class Bird extends Animal{

    private final double wingSpan; //the length of wings

    //constructor
    Bird(String specie, String color, int noOfLegs, double wingSpan) {
        super(specie, color, noOfLegs);
        this.wingSpan = wingSpan;

    }

    //display method
    public void displayBirdInfo(){
        System.out.println(
                "Bird Name: " + specie + "\nWingspan: " + wingSpan +
                "\nNo of legs: " + noOfLegs + "\nColor: " + super.color
        );
    }

    //Specific methods to birds
    public void fly(){
        System.out.println("Bird is flying!");
    }

}

// e.t.c //

