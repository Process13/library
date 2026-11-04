package main.refactor;

public class Fighter {
    private String name;
    private int hp;
    private static final int MAXIMUM_HP = 100;
    private static final int MINIMAL_HP = 0;

    public Fighter(String name) {
        this.name = name;
        this.hp = MAXIMUM_HP;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void takeDamage(int damage) {
        hp = hp-damage;
        if (hp<MINIMAL_HP){
            hp = MINIMAL_HP;
        }
    }


}
