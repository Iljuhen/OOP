package sems.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User>{
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public Iterator<User> iterator() {
        
        return new Iterator<User>() {

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public User next() {
                // TODO Auto-generated method stub
                return null;
            }
            
        };
    }  

}
