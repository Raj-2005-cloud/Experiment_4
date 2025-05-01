class Customer {
    private double balance;

    public void addBalance(double amount) {
        balance += amount;
        System.out.println("Added double amount: " + amount);
    }

    public void addBalance(int amount) {
        balance += amount;
        System.out.println("Added int amount: " + amount);
    }

    protected void deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Deducted: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.addBalance(100.75);  // double version
        cust.addBalance(50);      // int version
        cust.deductBalance(30.50);
        cust.showBalance();
    }
}
