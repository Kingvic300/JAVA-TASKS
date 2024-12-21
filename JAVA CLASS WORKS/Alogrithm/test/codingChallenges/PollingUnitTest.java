package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PollingUnitTest {

    @Test
    public void addCandidate() {
        PollingUnit pollingUnit = new PollingUnit();
        Candidate candidtae = pollingUnit.addCandidate("Victor",18,"male","satellite","07084159495","oladimejivictor611@gmail.com");
        assertEquals("Victor",candidtae.getName());
    }

    @Test
    public void getNumberOfCandidates() {
        PollingUnit pollingUnit = new PollingUnit();
        pollingUnit.addCandidate("Victor",18,"male","satellite","07084159495","oladimejivictor611@gmail.com");
        assertEquals(1,pollingUnit.getNumberOfCandidates());
    }

    @Test
    public void searchCandidate() {
        PollingUnit pollingUnit = new PollingUnit();
        Candidate candidate = pollingUnit.addCandidate("Victor",18,"male","satellite","07084159495","oladimejivictor611@gmail.com");
        Candidate searchCandidate = pollingUnit.searchCandidate("Victor");
        assertEquals("Victor",searchCandidate.getName());
    }

    @Test
    public void addUser() {
        PollingUnit pollingUnit = new PollingUnit();
        User user = pollingUnit.addUser("Henry",19,"male","123456","oladimejivictor611@gmail.com","teacher");
        assertEquals("Henry",user.getName());
    }

    @Test
    public void searchUser() {
        PollingUnit pollingUnit = new PollingUnit();
        User user = pollingUnit.addUser("Henry",19,"male","123456","oladimejivictor611@gmail.com","teacher");
        User searchedUser = pollingUnit.searchUser("Henry");
        assertEquals("Henry",searchedUser.getName());
    }

    @Test
    public void castVotes() {
        PollingUnit pollingUnit = new PollingUnit();
        Candidate candidate = pollingUnit.addCandidate("Victor",18,"male","satellite","07084159495","oladimejivictor611@gmail.com");
        User user = pollingUnit.addUser("Henry", 19, "male", "123456","oladimejivictor611@gmail.com","teacher");

        boolean voteCasted = pollingUnit.castVotes("Henry","Victor");
        assertTrue(voteCasted);
        int updatedVotes = candidate.getVote();
        assertEquals(1000, updatedVotes);
        }

    }

//    @Test
//    public void results() {
//    }
