package main.refactor;

public class BattleService {
    private static final int ATTACK_DAMAGE = 10;
    private static final int HEAL_AMOUNT = 10;
    private static final int MAXIMUM_HP = 100;
    private static final int MINIMAL_HP = 0;

    public void attack(Fighter attacker, Fighter defender) {
        defender.takeDamage(ATTACK_DAMAGE);
        printAttackResults(attacker, defender, ATTACK_DAMAGE);

        if (defender.getHp() == MINIMAL_HP) {
            System.out.println(defender.getName() + " has been defeated");
        }
    }

    private void printAttackResults(Fighter attacker, Fighter defender, int damage) {
        System.out.println(attacker.getName() + " har attackerat " + defender.getName() +  '\n' +
                "Damage: " + damage + '\n' +
                attacker.getName() + " HP " + attacker.getHp() + '\n' +
                defender.getName() + " HP " + defender.getHp());
    }

    public void heal (Fighter fighter) {
        int newHp = fighter.getHp() + HEAL_AMOUNT;

        if (newHp > MAXIMUM_HP) {
            newHp = MAXIMUM_HP;
        }
        fighter.setHp(newHp);
        printHealResults(fighter, HEAL_AMOUNT);
    }

    private void printHealResults(Fighter fighter, int healAmount) {
        System.out.println(fighter.getName() + "healed for " + healAmount);
        System.out.println(fighter.getHp() + " HP ");
    }
}
