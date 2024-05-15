public class Encapsulation {
    public static void main(String[] args) {
       //Examples of class usages
      // 1) Person class
//        Person mike = new Person("Mike", 25, "UK21S");
//        //updating address (Use setters)
//        mike.setAddress("US2901P");
//        System.out.println(mike.displayInfo());

     //2) HealthTracker class
          //HealthTracker person = new HealthTracker(1.8, 70, 85);
          //updating (use setters)
          //person.setHeartRate(95);
          //displaying
         // System.out.println(person.displayInfo());

    //3) BankAccount class
            BankAccount account = new BankAccount(1200, "APO293923012");

            //Getters
            System.out.println(account.getBalance());
            System.out.println(account.getAccount_number());

            //Methods
            account.deposit(1520);
            System.out.println(account.getBalance());

            account.withdraw(120);




    }
}


//Problems
//1) Personal Info
class Person{
    //Fields / Instances
    private String name;
    private int age;
    private String address;

    //Getters & setters (Methods)



    //For name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //For age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //Ensure that age cannot be negative
        if(age < 0){
            System.out.println("Age cannot be negative, sir!");
        }else{
            this.age = age;
        }
    }

    //For address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Method for displaying
    public String displayInfo(){
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
    }

    //Constructor with Encapsulation
    Person(String name, int age, String address){
        //Encapsulate & initialize
        setName(name);
        setAge(age);
        setAddress(address);
    }
}

//2) HealthTracker
class HealthTracker{
    //fields
    private double height;
    private double weight;
    private int heartRate;

    //Getters
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public int getHeartRate() {
        return heartRate;
    }

    //setters
    public void setHeight(double height) {
        if(height > 0 && height < 3){
            this.height = height;
        }else{
            System.out.println("Unrealistic height!");
        }
    }

    public void setWeight(double weight) {
        if(weight > 0){
            this.weight = weight;
        }else {
            System.out.println("Weight must be positive");
        }
    }
    public void setHeartRate(int heartRate) {
        if(heartRate >= 40 && heartRate <= 200){
            this.heartRate = heartRate;
        }else {
            System.out.println("Unrealistic!, heart rate must be between 40-200 per minute");
        }
    }

    //Method for displaying all
    public String displayInfo(){
        return "Height: " + height + "\nWeight: " + weight + "\nHeartRate: " + heartRate;

    }


    //Constructor
    HealthTracker(double height, double weight, int heartRate){
        setHeight(height);
        setWeight(weight);
        setHeartRate(heartRate);
    }
}

class BankAccount{
    //fields
    private double balance;
    private String account_number;

    //Getters

    public String getBalance() {
        return  "$" + balance;
    }

    public String getAccount_number() {
        return account_number.substring(0, 5) + "*******";
    }


    //Setters

    public void setBalance(double balance) {
        //some validations b/f setting the balance
        if(balance < 0) {
            System.out.println("Balance cannot be less than 0");
        }else{
            this.balance = balance;
        }

    }

    public void setAccount_number(String account_number) {
        //some validations b/f setting the account number
        if(!account_number.startsWith("APO")){
            System.out.println("The first three characters must be APO");
        } else if (account_number.length() != 12) {
            System.out.println("Account number must be 12 characters");
        }else{
            this.account_number = account_number;
        }

    }


    //Constructor
    BankAccount(double balance, String account_number){
        //Even for initialization (initialize only if they match setters)
        setBalance(balance);
        setAccount_number(account_number);
    }

    //Other Methods
    public void deposit(double dpMoney){
        if(dpMoney <= 0){
            System.out.println("Deposit money cannot be 0 or <0");
        }else{
            balance += dpMoney;
            System.out.println("You have successfully deposited $" + dpMoney);
        }
    }

    public void withdraw(double amount){
        if(amount < 100){
            System.out.println("You cannot withdraw under $100!");
        }else if(amount > balance) {
            System.out.println("You don't have sufficient funds!");
        }else{
            balance -= amount;
            System.out.println("Withdrawal is successfully done!");
        }

    }


}
