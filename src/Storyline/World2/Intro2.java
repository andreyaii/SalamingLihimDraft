package Storyline.World2;

import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class Intro2 {
    public static void intro2(PlayerCharacter player){
        System.out.println();
        System.out.println("   ╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗ ");
        System.out.println("   ║                                                                                                                                                       ║ ");
        System.out.println("   ║                                                     ▄▀▀▄ ▄▀▄  ▄▀▀▀▀▄   ▄▀▀▀▀▄   ▄▀▀▄ ▄▀▀▄  ▄▀▀▀▀▄                                                     ║");
        System.out.println("   ║                  (  .      )                       █  █ ▀  █ █      █ █        █   █    █ █    █                  (  .      )                         ║");
        System.out.println("   ║            )           (         ,                 ▐  █    █ █      █ █    ▀▄▄ ▐  █    █  ▐    █                           )           (              ║");
        System.out.println("   ║             .  '   .   '  .  '  .                     █    █  ▀▄    ▄▀ █     █ █  █    █       █                 .  '   .   '  .  '  .                ║");
        System.out.println("   ║         (    , )       (.   )  (                    ▄▀   ▄▀     ▀▀▀▀   ▐▀▄▄▄▄▀ ▐   ▀▄▄▄▄▀    ▄▀▄▄▄▄▄▄▀       (    , )       (.   )  (                 ║");
        System.out.println("   ║       .' ) ( . )    ,') '. )  , ( .                █    █             ▐                     █                   .' ) ( . )    ,') '. )  , ( .         ║");
        System.out.println("   ║    ). , ( .   (  ) ( , ')  .' (  ,    )           ▐    ▐                                   ▐                  ). , ( .   (  ) ( , ')  .' (  ,    )    ║");
        System.out.println("   ║  (_,) . ), ) _) _,')  (, ) '. )  ,. (' )                  >> The land of death and decay. <<                 (_,) . ), ) _) _,')  (, ) '. )  ,. (' )  ║ ");
        System.out.println("   ╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝ ");

        DialogueUtils.pause();
        System.out.println("The moment you cross the threshold to Mogul, a suffocating weight settles into your chest. The air itself is different here.");
        System.out.println("Each breath tastes of rust and rot.");
        System.out.println("\nThe sky is an eternal shroud, alive with twisting shapes that churn behind clouds as black as coal.");
        System.out.println("Now and then, the heavens tear open with a dull red glow, exposing the outlines of crow-shaped Abwak in the distance and even some ");
        System.out.println("Manananggal prowling about with their entrails hanging below them like a perverted bridal train. No warmth reaches you here. ");
        System.out.println("Only the feeling of being watched. \nYour eyes search your immediate surroundings for a trace of the Bungisngis and Andrea.");
        System.out.println("You sense a gust of wind and move to follow the direction from which it came.");
        DialogueUtils.pause();

    }
}
