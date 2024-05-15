
//Interfaces -> ar going to define the specifications of how a class would act (methods), & cannot be instantiated.
//Interfaces are a good choice when you know has to be there but it can implement differently by derived classes.
public class Interface {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(20, 10, 1);

        motorcycle.applyBrake(1);
        System.out.println("Bike speed after applying break: " + motorcycle.getSpeed());

        motorcycle.speedUp(5);
        System.out.println("Bike speed after applying speed: " + motorcycle.getSpeed());

    }
}

interface Bike{
    //implementing methods is not allowed, it just gives you the design, you have to implement them in subclasses
    void applyBrake(int decrement);
    void speedUp(int increment);

    //methods by default they're -> public abstract & fields are -> final static
}


//Child class
class Motorcycle implements Bike{  //What you'll get implements are -> methods only
    private int seatHeight;
    private int gear;
    private int speed;

    Motorcycle(int seatHeight, int speed, int gear){
        //You dont need to call super class b/c all interface fields must be initialized in the parent class.
        this.seatHeight = seatHeight;
        this.speed = speed;
        this.gear = gear;
    }


    //Implementing methods
    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }


    //Getters
    public int getSeatHeight() {
        return seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
}



