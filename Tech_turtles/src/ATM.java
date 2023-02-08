import java.util.Scanner;

class ATM {
    static int balance = 1000000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    int amount = input.nextInt();
                    if (balance >= amount) {
                        balance -= amount;
                        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: $");
                    amount = input.nextInt();
                    balance += amount;
                    System.out.println("Deposit successful. New balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
