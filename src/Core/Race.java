package Core;

public abstract class Race {
    public abstract String getRaceName();
    public abstract int getBaseHp();
    public abstract int getBaseMana();
    public abstract String getAttackDesc();
    public abstract int attack();

    // Skill Logic (Moved from ClassArchetype)
    public abstract void useSkill(String playerName, Enemy target);
    public abstract void useSpecial(String playerName, Enemy target);

    // Skill Mana Costs (The fix for your red text)
    public abstract int getSkillManaCost();
    public abstract int getSpecialManaCost();

    // Skill Cooldowns (The fix for your red text)
    // We can provide default values here so you don't have to
    // write them in every single race file unless you want to change them.
    public int getSkillCooldown() {
        return 2;
    }

    public int getSpecialCooldown() {
        return 3;
    }

    public abstract void increaseSpecialDamage(int amount);

}
