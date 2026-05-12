package Storyline.World1;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Mission2 {

    public static boolean helpedBeggar = false;

    public static void mission2(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("            ===================================================================================================================================");
        System.out.println(
                         "            ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀▄░░░░░░░█▀█░░░▄▀▄░░█░█░█▀▀░█▀▀░▀█▀░▀█▀░█▀█░█▀█░░░█▀█░█▀▀░░░█░█░█▀█░█▀█░█▀█░█▀▄░░░░▄▀░░▄▀\n"
                        +"            ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░▄▀░░░▀░░░░█▀█░░░█\\█░░█░█░█▀▀░▀▀█░░█░░░█░░█░█░█░█░░░█░█░█▀▀░░░█▀█░█░█░█░█░█░█░█▀▄░░░▀▄░░▀▄\n"
                        +"            ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░▀░▀░░░░▀\\░░▀▀▀░▀▀▀░▀▀▀░░▀░░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░▀░░░░░▀░▀░▀▀▀░▀░▀░▀▀▀░▀░▀░░░░░▀░░░▀"
        );
        System.out.println("            ===================================================================================================================================");

        scan.nextLine();

        System.out.println("As you round the corner, you see a man sprawled in a heap on the floor, seemingly down on his luck.");
        System.out.println("His head whips toward you the moment you walk by, and he holds out an open palm.");
        DialogueUtils.pause();

        System.out.println("Beggar: Please, kind stranger, do you have any barya to spare? I have been sick for days, but I do not have the twenty barya needed to pay for medicine.");
        scan.nextLine();

        System.out.println("The man starts coughing halfway through his last sentence, and you fight the urge to say yes to him immediately, for you only have " + player.getBarya() + "barya");
        System.out.println("to your name.");
        scan.nextLine();

        while(true) {

            System.out.println(">> Do you give away your only money to help a begging stranger?");
            System.out.println("[1] Yes");
            System.out.println("[2] No");
            System.out.println();
            System.out.print("Enter your choice: ");

            try {
                int choice = scan.nextInt();
                if (choice == 2) {
                    System.out.println();
                    System.out.println("You have chosen not to help the beggar.");
                    System.out.println();
                    scan.nextLine();
                    System.out.println(player.name + ": I’m sorry, friend, but I do not have the money to spare. Best of luck to you.");
                    scan.nextLine();
                    System.out.println("With those parting words, you walk away.");
                    break;
                } else if (choice == 1){
                    helpedBeggar = true;
                    System.out.println();
                    System.out.println("You have chosen to help the beggar.");
                    System.out.println();
                    scan.nextLine();
                    System.out.println(player.name + ": Here’s " + player.getBarya() + " barya. I’m sorry, it’s all I have, but I do hope you can use it to seek treatment for your illness.");
                    scan.nextLine();
                    System.out.println("To your surprise, the beggar surges upward with suprising strength and envelopes you in a hug.");
                    scan.nextLine();
                    System.out.println("Beggar: Thank you so much! I have been wasting away in this alley for a week, and you are the first to ever offer me kindness.");
                    scan.nextLine();
                    System.out.println(player.name + ": It was no problem, truly. Best of luck to you, my friend.");
                    scan.nextLine();
                    System.out.println("Beggar: And to you. May the Gods bless you.");
                    System.out.println();

                    DialogueUtils.pause();
                    System.out.println("You start walking away, then you remember that you had some suman in your pocket.");
                    System.out.println("You think of the beggar and decide that he needs it more than you do.");
                    System.out.println("But when you reach into your pocket, what greets your hand is not just the decadent suman, but the feeling of cold, hard coins as well.");
                    scan.nextLine();
                    System.out.println("Taking it out, you find coins worth " + (player.getBarya() * 2) + " barya — ");
                    System.out.println("when before you were certain all your money was given away to the beggar.");
                    System.out.println("And when you look back at the alley, it now appears completely empty.");
                    System.out.println("Did you just get played by an encanto?");
                    System.out.println("Shaking your head, you try to put the previous encounter out of your thoughts and instead focus on your mission.");
                    System.out.println();
                    DialogueUtils.pause();

                    System.out.println("💰 You received " + (player.getBarya() * 2) + " barya!");
                    player.addBarya(player.getBarya());
                    System.out.println("🏦 Total barya: " + player.getBarya());
                    break;
                } else {
                    System.out.println("❌ Invalid choice. Please enter 1 or 2.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter 1 or 2.\n");
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
                scan.nextLine();
            }
        }



        System.out.println("\nInside the Information Guild, the air hums and shelves groan under the weight of ancient scrolls.");
        System.out.println("An elderly Tamawo scribe greets you.");
        scan.nextLine();
        System.out.println("Scribe: You must have travelled far just to find our humble guild. Tell me, what knowledge do you seek?");
        scan.nextLine();
        System.out.println(player.name + ": I am investigating the cases of Diwatas and Encantos going missing lately. My friend Sean told me that you would be able to offer ");
        System.out.println("me more information about that.");
        scan.nextLine();
        System.out.println("Scribe: Our informants speak of Bungisngis prowling the outskirts. They work with tiyanaks who drag Enkantos and Diwatas into the Dark Forest, ");
        System.out.println("where they are carted off like mere cattle and brought to the land of the Aswangs.");
        scan.nextLine();
        System.out.println("He presses a worn map into your hand, the edges trembling faintly as though the parchment itself feared what it depicted.");
        scan.nextLine();
        System.out.println("Scribe: If you truly wish to stand against them, then steel yourself. The forest is alive. And it does not forgive trespassers easily.");
        scan.nextLine();
        System.out.println("You nod with grim determination, for your next step is clear. The Dark Forest awaits.");
        DialogueUtils.pause();
    }
}
