package sems.sem3;

import java.util.Collections;

import javax.sound.sampled.SourceDataLine;

public class sem3 {
    public static void main(String[] args) {
        User newUser = new User("Petya", "Petrov", 30);
        newUser.addOneUser(new User("John", "Bon", 35));
        Personal personal = new Personal();
        personal.addUser(new User("John", "Smith", 35));
        personal.addUser(newUser);
        personal.addUser(new User("Bruce", "Willice", 44));
        personal.addUser(new User("Jenifer", "Loupes", 18));
        personal.addUser(new User("Jenifer", "Loupes", 19));

        for (User user : personal) {
            System.out.println("Personal " + user);
        }
        System.out.println("_____________");

        Collections.sort(personal.getUsers());
        for (User user : personal) {

            System.out.println("Personal " + user);
        }

        User bigboss = new User("Bill", "Klinton", 50);
        bigboss.addSubordination(personal);

        System.out.println(bigboss);
    }
}
