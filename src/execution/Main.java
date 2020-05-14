package execution;

import defination.MyStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        final Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("Press 1 to \"Push\" a node at the top.");
            System.out.println("Press 2 to \"Pop\" a node from the top.");
            System.out.println("Press 3 to \"Peek\" at the node at the top.");
            System.out.println("Press 4 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data(int num) of the node to push: ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    int poppedData = stack.pop();
                    break;
                case 3:
                    System.out.println("Top of the node: " + stack.peek());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice!");
            }
        }
    }
}
