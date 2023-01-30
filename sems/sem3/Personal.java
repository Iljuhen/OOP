package sems.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User> {
    private List<User> users = new ArrayList<>();

    /**
     * @return
     */
    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public Iterator<User> iterator() {

        return new Iterator<User>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return users.size() > currentIndex;

            }

            @Override
            public User next() {

                return users.get(currentIndex++);
            }

        };
    }

}
