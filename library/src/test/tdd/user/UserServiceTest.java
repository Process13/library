package test.tdd.user;

import main.tdd.user.User;
import main.tdd.user.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    private UserService userService;
    private User user;

    @BeforeEach
    void setup(){
        userService = new UserService();
        user = new User("Yahya", "Yahya@gmail.com");
    }
    @Test
    void addUserShouldSaveAUser(){
        userService.addUser(user);
        assertEquals(1, userService.getUserCount());
    }
    @Test
    void deleteUserShouldDeleteAUser(){
        userService.addUser(user);
        boolean deleted = userService.deleteUser("Yahya@gmail.com");
        assertTrue(deleted);
        assertEquals(0, userService.getUserCount());
    }
    @Test
    void deleteUserShouldReturnFalseWhenUserDoesNotExist(){
        //boolean deleted
    }
    /*
    @Test
    void getUserByEmailShouldReturnTheUserWithTheMatchingEmail(){
        userService.getUserByEmail(user);
    }

     */
    @Test
    void getUserByEmailShouldReturnUserWhenEmailExists(){
        userService.addUser(user);
        User foundUser = userService.getUserByEmail("Yahya@gmail.com");
        assertSame(user, foundUser);
    }
    @Test
    void getUserByEmailShouldReturnNullWhenEmailDoesNotExist(){
        assertNull(userService.getUserByEmail("Yahya@gmail.com"));
    }
    @Test
    void updateUserShouldChangeNameWhenEmailExists() {
        userService.addUser(user);

        boolean updated = userService.updateUser("Yahya@gmail.com", "Anna");

        assertTrue(updated);
        assertEquals("Anna", user.getName());
        assertEquals("Yahya@gmail.com", user.getEmail());
    }
    @Test
    void updateUserShouldReturnFalseWhenNoEmailExists(){
        boolean updated = userService.updateUser("missing@gmail.com", "Anna");

        assertFalse(updated);
        assertEquals(0, userService.getUserCount());
    }

    /*

    TODO Skapa tester för getUserByEmail() och metoden efter
        Skapa tester för updateUser() och metoden efter

        FÖLJ TDD PRINCIPER RED GREEN REFACTOR
     */

}
