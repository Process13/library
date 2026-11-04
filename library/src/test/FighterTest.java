package test;

import main.unittest.fighter.Fighter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FighterTest {


    @Test
    void attackShouldDoBetween5And15Damage(){
        // A Arrange
        Fighter fighter = new Fighter();

        int hpBeforeAttack =  fighter.getHp();


        // A Act
        fighter.attack();
        // Assert

        int hpAfterAttack = fighter.getHp();

        int damage = hpBeforeAttack - hpAfterAttack;

        assertTrue(damage >= 5);
        assertEquals(5, fighter.getLowerRange());
        assertTrue(damage <= 15);
        assertEquals(15, fighter.getUpperRange());


    }
}