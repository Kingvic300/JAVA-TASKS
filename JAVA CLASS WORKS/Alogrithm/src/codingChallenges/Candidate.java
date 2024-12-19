package codingChallenges;

import java.util.ArrayList;

public class Candidate {
    private final ArrayList<String> candidates = new ArrayList<>();
    private  int numberOfCandidates;

    public  String addCandidate(String name) {
        candidates.add(name);
        numberOfCandidates++;
        return name;
    }
    public  int getNumberOfCandidates() {
        return numberOfCandidates;
    }
    public String searchCandidate(String name) {
        for (String candidate : candidates) {
            if (candidate.equals(name)) {
                return candidate;
            }
        }
        throw new IllegalArgumentException("Candidate not found");
    }
}
