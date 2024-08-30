package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;

        while (choice != 3) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            if (choice != 3) {

                switch (choice) {
                    case 1:
                        pet = new Dog();
                        petFile.setPetId("D01");
                        petFile.setPetName("Bantay");
                        petFile.setPet(pet);
                        ((Dog) pet).setBreed("German Shepperd");
                        break;
                    case 2:
                        pet = new Cat();
                        petFile.setPetId("C01");
                        petFile.setPetName("Muning");
                        petFile.setPet(pet);
                        ((Cat) pet).setNoOfLives(9);
                        break;
                }

                System.out.println("Pet id is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: " + petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());

                // Unique Functions Per Animal
                if (petFile.getPet().getClass().getSimpleName().equals("Dog")) {
                    System.out.println("Breed: " + ((Dog) petFile.getPet()).getBreed());
                }
                if (petFile.getPet().getClass().getSimpleName().equals("Cat")) {
                    System.out.println("Number of Lives: " + ((Cat) petFile.getPet()).getNoOfLives());
                }

                System.out.println();
            } else {
                System.out.println("Exit");
            }
        }

    }
}
