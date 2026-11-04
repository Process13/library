package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.unittest.user.*;

import static org.junit.jupiter.api.Assertions.*;


public class UserServiceTest {
    private UserService userService;
    private User user;
    @BeforeEach
    public void setUp() {
        System.out.println("Before each test");
        userService = new UserService();
        user = new User("Yahya", "Yahya@gmail.com");
        userService.addUser(user);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each test");
        userService.getUsers().clear();
    }

    @Test
    public void addUserShouldAddANewUser() {

        assertEquals(1, userService.getUsers().size());
    }

    @Test
    public void getUserByEmailShouldReturnCorrectUser() {
        //Arrange

        //Act
        User foundUser = userService.getUserByEmail("Yahya@gmail.com");

        //Assertions
        assertNotNull(foundUser);
        assertEquals("Yahya", foundUser.getName());
        assertEquals("Yahya@gmail.com", foundUser.getEmail());
    }

    @Test
    public void updateUserShouldUpdateCorrectUser(){
        // Arrange = Lägga till användare för att uppdatera

        //Act
        boolean updated = userService.updateUser("Yahya@gmail.com", "Yahya Teacher");
        assertTrue(updated);
        User updatedUser = userService.getUserByEmail("Yahya@gmail.com");
        assertEquals("Yahya Teacher", updatedUser.getName());
    }

    @Test
    public void deleteUserShouldDeleteCorrectUser() {
        boolean deleted = userService.deleteUser("Yahya@gmail.com");
        assertTrue(deleted);
        assertEquals(0, userService.getUsers().size());
        User foundUser = userService.getUserByEmail("Yahya@gmail.com");
        assertNull(foundUser);
    }

}
