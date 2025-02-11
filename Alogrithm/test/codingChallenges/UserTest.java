package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class UserTest {

    @Test
    public void getName() {
        User user = new User("Victor",18,"male","12345","oladimejivictor611@gmail.com","teacher");
        assertEquals("Victor",user.getName());
    }

    @Test
    public void getAge() {
        User user = new User("Victor",18,"male","12345","oladimejivictor611@gmail.com","teacher");
        assertEquals(18,user.getAge());
    }

    @Test
    public void getGender() {
        User user = new User("Victor",18,"male","12345","oladimejivictor611@gmail.com","teacher");
        assertEquals("male",user.getGender());
    }

    @Test
    public void getID() {
        User user = new User("Victor",18,"male","12345","oladimejivictor611@gmail.com","teacher");
        assertEquals("12345",user.getID());
    }

    @Test
    public void hasVoted() {
        User user = new User("Victor",18,"male","12345","oladimejivictor611@gmail.com","teacher");
        assertTrue(user.hasVoted());
    }
    @Test
    public void voted() {
        User user = new User("Victor",18,"male","12345","oladimejivictor611@gmail.com","teacher");
        user.voted(false);
        assertTrue(user.hasVoted());
    }

//    @Test
//    public void castVoted() {
//        User user = new User("Victor",18,"male","12345");
//        PollingUnit pollingUnit = new PollingUnit();
//        pollingUnit.addCandidate("Victor",12,);
//        assertEquals("Victor", user.);
//    }
}