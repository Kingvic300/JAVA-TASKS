package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testThatUserCanSetName() {
        User user = new User("Victor",13,"male","oladimejivictor611@gmail.com");
        user.setName("Vic");
        assertEquals("Vic",user.getName());
    }

    @Test
    public void testThatUserCanSetAge() {
        User user = new User("Victor",13,"male","oladimejivictor611@gmail.com");
        user.setAge(10);
        assertEquals(10,user.getAge());
    }

    @Test
    public void testThatUserCanSetGender() {
        User user = new User("Victor",13,"male","oladimejivictor611@gmail.com");
        user.setGender("Female");
        assertEquals("Female",user.getGender());
    }

    @Test
    public void testThatUserCanSetEmail() {
        User user = new User("Victor",13,"male","oladimejivictor611@gmail.com");
        user.setEmail("Victor@gmail.com");
        assertEquals("Victor@gmail.com",user.getEmail());
    }
}