package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

        VirtualPet theDangDog = new VirtualPet("The Dang Dog", 25, 30, 0, 0);

        System.out.println("Welcome to The Dang Dog!");
        System.out.println("Here you will need to feed, water, exercise and rest your Dang Dog.");
        System.out.println("Unlike with a real dog, there is no reward!");
        System.out.println("But if you let any of his needs get too high, he might die!");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        String userSelection;

        while (theDangDog.hungerLevel < 100 && theDangDog.thirstLevel < 100 && theDangDog.needToGoOutsideLevel < 100 && theDangDog.fatigue < 100) {


            System.out.println(" ");
            System.out.println("Name: " + theDangDog.name);
            System.out.println("Hunger: " + theDangDog.hungerLevel);
            System.out.println("Thirst: " + theDangDog.thirstLevel);
            System.out.println("Need to Go Outside: " + theDangDog.needToGoOutsideLevel);
            System.out.println("Fatigue: " + theDangDog.fatigue);
            System.out.println(" ");
            System.out.println("If you want to feed The Dang Dog press 1, to water The Dang Dog press 2, to let The Dang Dog Outside press 3, and to put The Dang Dog to bed press 4");
            System.out.println("If you are tired of the Dang Dog, press -1 to exit");
            userSelection = scanner.nextLine();


            if (userSelection.equals("1")) {
                theDangDog.feedTheDangDog();
                System.out.println("You gave the Dang Dog some food");
            } else if (userSelection.equals("2")) {
                theDangDog.waterTheDangDog();
                System.out.println("You gave the Dang Dog some water");
            } else if (userSelection.equals("3")) {
                theDangDog.putTheDangDogOutside();
                System.out.println("You let the Dang Dog outside");
            } else if (userSelection.equals("4")) {
                theDangDog.putTheDangDogToBed();
                System.out.println("You sent the Dang Dog to bed");
            } else {
                System.out.println("I guess you don't like the Dang Dog, Goodbye!");
                System.exit(-1);
            }
            theDangDog.tick();


        }
        if (theDangDog.hungerLevel <= 100 || theDangDog.thirstLevel <= 100 || theDangDog.needToGoOutsideLevel <= 100 || theDangDog.fatigue <= 100) {
            System.out.println(" ");
            System.out.println("You let the Dang Dog die! Goodbye now!");
        }
    }
}

