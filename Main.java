public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getBrand()); // Output: Toyota

        Car defaultCar = new Car();
        System.out.println(defaultCar.getModel()); // Output: Unknown

        BankAccount people1 = new BankAccount("12345678", "Pénzes János", 50000);
        System.out.println(people1.getAccountHolder());
        System.out.println(people1.getAccountNumber());
        System.out.println(people1.getbalance());

        BankAccount people2 = new BankAccount("23456789", "Pénzes Jánosné", 50000);
        System.out.println(people1.getAccountHolder());
        System.out.println(people2.getAccountNumber());
        System.out.println(people1.getbalance());


    }
}
