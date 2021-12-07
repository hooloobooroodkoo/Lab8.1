package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    @BeforeEach
    void setUp() {
        user = new User.UserBuilder().name("Arman").age(18).gender("male").weight(75).occupations(Collections.singleton("student")).build();
    }

    @Test
    void testToString() {
        assertEquals("User(name=Arman, age=18, gender=male, weight=75, height=0, race=null, occupations=[student])", user.toString());
    }

    @Test
    void builder() {
        assertEquals("Arman", user.getName());
        assertEquals("male", user.getGender());
        assertEquals(18, user.getAge());
        assertEquals(75, user.getWeight());
        assertEquals("[student]", user.getOccupations().toString());
    }
}