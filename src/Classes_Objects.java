import java.util.Objects;

public class Classes_Objects {
    public static void main(String[] args) {
        //Example usages:
        //1) Fields are private in this class (cannot be accessed outside of that class)
        //Car car1 = new Car("Toyota", "Camry", 2021);
        //car1.displayInfo();

        //2)
        Transaction trans2 = new Transaction(90, "Withdrawal");
        System.out.println(trans2.getAmount());


    }
}

//Problems

//1) Class creation
class Car{
    //properties / attributes
    private final String manufacturer;
    private final String model;
    private final int year;

    //Method
    public void displayInfo(){
        System.out.println("Car model: " + model + "\nManufacturer: " + manufacturer + "\nYear: " + year);
    }

    //Constructor
    Car(String manufacturer, String model, int year){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }
}

//2) Bank Account system
class Transaction{
    //Attributes
    private int amount = 5000;
    private String transType;

    //Methods
    public String getAmount(){
        return "Current amount: $" + amount;
    }

    public String getTransType(){
        return transType;
    }

    //Constructor
    Transaction(int amount, String transactionType){
        if(amount < 0 && (transactionType.equals("Withdrawal") || transactionType.equals("withdraw") || transactionType.equals("Withdraw"))){
            this.amount -= amount;
        }else if(amount > 0 && (transactionType.equals("Deposit") || transactionType.equals("deposit"))){
            this.amount += amount;
        }else{
            System.out.println("Cannot be instantiated, Invalid type or amount!");
        }
    }






}
