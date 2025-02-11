package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CandidateTest {

    @Test
    public void getName() {
        Candidate candidate = new Candidate("Victor",18,"male","satellite","07084159495","oladimejivictor611@gmail.com");
        assertEquals("Victor",candidate.getName());
    }

    @Test
    public void getVote() {
        Candidate candidate = new Candidate("Victor",18,"male","satellite","07084159495","oladimejivictor611@gmail.com");
        assertEquals(10000,candidate.getVote());
    }
}