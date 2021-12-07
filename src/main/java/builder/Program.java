package builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        User user = new User.UserBuilder().age(18).gender("male").weight(75).occupations(Collections.singleton("student")).build();
        System.out.println(user);
    }
}
