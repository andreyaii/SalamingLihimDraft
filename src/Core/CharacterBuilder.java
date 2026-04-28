package Core;

import Races.*;

public class CharacterBuilder {
    public static PlayerCharacter build(String name, int raceChoice) {
        Race race = null;

        // Simplified selection logic
        if (raceChoice == 1) {
            race = new Tikbalang();
        } else if (raceChoice == 2) {
            race = new Kapre();
        }

        // Return the player with just the name and the race object
        return new PlayerCharacter(name, race);
    }
}