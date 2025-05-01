class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Make: " + this.make + ", Model: " + this.model + ", Year: " + this.year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "Model 3", 2025);
        myCar.displayDetails();
    }
}
