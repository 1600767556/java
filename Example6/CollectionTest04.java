package Example6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.SplittableRandom;

public class CollectionTest04 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        User u1  = new User("jack");
        User u2  = new User("jack");
        collection.add(u1);
        System.out.println(collection.contains(u2));


        
        Collection cc = new ArrayList();
        String s1 = new String("hello");
        cc.add(s1);
        String s2 = new String("hello");
        cc.remove(s2);
        System.out.println(cc.size());

    }
}
class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}