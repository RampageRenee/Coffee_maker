package machine;

import java.util.Scanner;

public class CoffeeMachine {


    int water = 400, milk = 540, coffee = 120, cups = 9, money = 550;

    int espressoWater = 250, espressoCoffee = 16, espressoMoney = 4;
    int latteWater = 350, latteMilk = 75, latteCoffee = 20, latteMoney = 7;
    int cappuccinoWater = 200, cappuccinoMilk = 100, cappuccinoCoffee = 12, cappuccinoMoney = 6;
    int addWater = 0, addMilk = 0, addCoffee = 0, addCups = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean on = true;
        CoffeeMachine coffeeMachine = new CoffeeMachine();



        while (on) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String option = scanner.nextLine();


            switch (option) {
                case "buy":
                    coffeeMachine.buy();
                    break;
                case "fill":
                    coffeeMachine.fill();
                    break;
                case "take":
                    coffeeMachine.take();
                    break;
                case "remaining":
                    coffeeMachine.remaining();
                    break;
                case "exit":
                    on = false;
                    break;
                default:
                    System.out.println("Wrong input, try again!");
                    break;
            }


        }


    }
    public void buy(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                if (water >= espressoWater && coffee >= espressoCoffee && cups >= 1) {
                    System.out.println("I have enough recources, making you a coffee!");
                    water -= espressoWater;
                    coffee -= espressoCoffee;
                    cups--;
                    money += espressoMoney;
                } else if (water < espressoWater) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffee < espressoCoffee) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "2":
                if (water >= latteWater && milk >= latteMilk && coffee >= latteCoffee && cups >= 1) {
                    System.out.println("I have enough recources, making you a coffee!");
                    water -= latteWater;
                    milk -= latteMilk;
                    coffee -= latteCoffee;
                    cups--;
                    money += latteMoney;
                } else if (water < espressoWater) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffee < espressoCoffee) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (milk < latteMilk) {
                    System.out.println("Sorry, not enough milk!");
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "3":
                if (water >= cappuccinoWater && milk >= cappuccinoMilk && coffee >= cappuccinoCoffee && cups >= 1) {
                    System.out.println("I have enough recources, making you a coffee!");
                    water -= cappuccinoWater;
                    milk -= cappuccinoMilk;
                    coffee -= cappuccinoCoffee;
                    cups--;
                    money += cappuccinoMoney;
                } else if (water < espressoWater) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffee < espressoCoffee) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (milk < cappuccinoMilk) {
                    System.out.println("Sorry, not enough milk!");
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "back":
                break;
            default:
                System.out.println("wrong input, try again!");
                break;
        }
    }

    public void fill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        addCoffee = scanner.nextInt();
        System.out.println("Write how many cups do you want to add:");
        addCups = scanner.nextInt();
        water += addWater;
        milk += addMilk;
        coffee += addCoffee;
        cups += addCups;
    }

    public void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

}
