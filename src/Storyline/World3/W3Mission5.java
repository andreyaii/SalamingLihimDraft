package Storyline.World3;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class W3Mission5 {
    public static void w3mission5(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("             ==================================================================================================================================");
        System.out.println("             ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀█░░░░░░░▀█▀░█░█░█▀▀░░░█▄█░█▀█░▀▀█░█▀▀░░░█▀█░█▀▀░░░█▀▀░█▀▀░█░░░▀█▀░█▀█░█▀▀░█▀▀░░░░▄▀░░▄▀");
        System.out.println("             ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀▄░░▀░░░░░█░░█▀█░█▀▀░░░█░█░█▀█░▄▀░░█▀▀░░░█░█░█▀▀░░░█▀▀░█░░░█░░░░█░░█▀▀░▀▀█░█▀▀░░░▀▄░░▀▄░");
        System.out.println("             ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀░░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀░▀░▀▀▀░▀▀▀░░░▀▀▀░▀░░░░░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░░░▀▀▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("             ==================================================================================================================================");
        System.out.println();
        sc.nextLine();
        System.out.println("Slowly, you descend the stairs, and as you step through the threshold, the world falls silent.\n" +
                        "The air grows cold, thick with the scent of damp soil and iron. The walls are made of the twisting roots of the Balete Tree,\n" +
                         "pulsing faintly like veins running through a living entity.");
        System.out.println("You press forward. Every corridor bends in strange, impossible ways. Paths you’ve taken seem to vanish \n" +
                           "behind you and bulging ancient eyes open from their slumber as you pass.");
        sc.nextLine();
        System.out.println("At the heart of the maze stands a massive stone door carved with lunar sigils.\n" +
                           "A ghostly figure materializes before you. The White Lady of Balete Drive, her form both sorrowful and radiant.");
        sc.nextLine();
        System.out.println("White Lady: So you have come for the Blade’s final purpose, but every light demands a shadow.");
        sc.nextLine();
        System.out.println(player.name + ": We’ve come this far. Tell us what must be done.");
        sc.nextLine();
        System.out.println("White Lady: The door only opens to one who understands sacrifice, you must surrender half of what sustains you. Either your life-force or the moon-forged mana that fuels your power.");
        sc.nextLine();
        System.out.println("Kheila: Half? That’s– that’s irreversible.");
        sc.nextLine();
        System.out.println("White Lady: Strength and magic shape every path you have walked. Choose which burden you will lighten, and which wound you will carry forward.");
        sc.nextLine();

        System.out.println("[1] Sacrifice half of your current hp. Your vitality withers.");
        System.out.println("[2] Sacrifice half of your current mana. Your magical core dims.");
        System.out.println();

        while (true){
            try {
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                if (choice == 1) {
                    player.setHp(player.getHp() / 2);
                    player.boostSpecialPower(20);
                    System.out.println("White Lady: Your life-force narrows to a fragile thread… yet the moon often favors the desperate.");
                    break;
                } else if (choice == 2) {
                    player.setMana(player.getMana() / 2);
                    player.boostSpecialPower(20);
                    System.out.println("White Lady: Power wanes, but resolve sharpens. The moon tests those who rely not on spells, but on will.");
                    break;
                } else {
                    System.out.println("❌ Invalid choice. Please enter 1 or 2.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter 1 or 2.\n");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
                sc.nextLine();
            }
        }

        System.out.println();
        System.out.println("The Blade of Bulan glows, absorbing the essence of what was sacrificed and locking it into its lunar steel.");
        sc.nextLine();
        System.out.println("White Lady: You have chosen well. The Blade now mirrors your truth. Go, bearer of the moon’s will.");
        sc.nextLine();
        System.out.println("With those parting words, the White Lady disappears, taking every ounce of light with her.");

        DialogueUtils.pause();
    }
}
