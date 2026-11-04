package main;

import main.refactor.BattleService;
import main.refactor.Fighter;
import main.unittest.user.User;
import main.unittest.user.UserService;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class.getName());
    static void main(String[] args) {

        Fighter player = new Fighter("Linus");
        Fighter enemy = new Fighter("Yahya");

        BattleService battleService = new BattleService();





        /*
        LOGGER.info ("Program started");
        UserService userService = new UserService();

        User user = new User("Yahya", "Yahya@gmail.com");

        userService.addUser(user);
        userService.updateUser("Yahya.gmail.com", "yahya@gmail.com");
        userService.deleteUser("yahya@gmail.com");


        Fighter fighter = new Fighter();

        //När saker händer (Skapa en user, skapa en order, fighting started...
        LOGGER.info ("Programmet stannar");

        //När vi vill varna om saker som beter sig lite annorlunda.
        LOGGER.warning("Giving warning about something important");

        //När något går åt skogen.
        LOGGER.severe("Giving error about something important");

        LOGGER.fine("Detaljerad info");
        LOGGER.finer("Ännu mer detaljerad info");
        LOGGER.finest("Absolut mest detaljerad info");

        LOGGER.setLevel(Level.INFO);


         */
        //INFO
        //WARNING
        //ALERT
    }
}
