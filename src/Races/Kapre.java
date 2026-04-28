package Races;

import Core.Race;
import Core.Enemy;
import java.util.Random;

public class Kapre extends Race {
    private int heatPowerBonus = 0; // Migrated from specialBonusDamage
    private final Random random = new Random();

    @Override
    public int getBaseHp() {
        // 100 (Base) + 80 (Gunman) = 180
        return 180;
    }

    @Override
    public int getBaseMana() {
        // 70 (Base) + 70 (Gunman) = 140
        return 140;
    }

    @Override
    public String getRaceName() { return "Kapre"; }

    public int attack() {
        return random.nextInt(11) + 5;
    }

    public String getAttackDesc() {
        return " engulfs the enemy with thick cigar smoke!";
    }

    // --- MIGRATED GUNMAN SKILLS (Re-flavored for Kapre) ---

    public void useSkill(String playerName, Enemy target) {
        System.out.println(playerName + " exhales a massive Smoke Cloud!");
        int dmg = random.nextInt(11) + 15;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " suffocation damage to " + target.name + "!");
    }

    public void useSpecial(String playerName, Enemy target) {
        System.out.println(playerName + " unleashes the Cinder Blast!");
        int dmg = random.nextInt(31) + 25 + heatPowerBonus;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " thermal damage to " + target.name + "!");
    }

    public int getSkillManaCost() { return 20; }
    public int getSpecialManaCost() { return 40; }

    public void increaseSpecialDamage(int amount) {
        this.heatPowerBonus += amount;
    }
}