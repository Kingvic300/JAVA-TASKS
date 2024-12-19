package codingChallenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CandidateTest {
    @BeforeEach
    public void setUp() {
        Candidate candidate = new Candidate();
    }

    @Test
    public void testThatAddCandidateMethodWorks() {
        Candidate candidate = new Candidate();
        String candidate1 = candidate.addCandidate("Victor");
        String candidate2 = candidate.addCandidate("Victor");
        assertEquals(2, candidate.getNumberOfCandidates());
    }

    @Test
    public void testThatSearchCandidateMethodWorks() {
        Candidate candidate = new Candidate();
        String candidate1 = candidate.addCandidate("Victor");
        assertEquals("Victor", candidate.searchCandidate("Victor"));
    }
}