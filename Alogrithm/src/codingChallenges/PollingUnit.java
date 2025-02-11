package codingChallenges;

import java.util.ArrayList;

public class PollingUnit {
    ArrayList<Candidate> candidates = new ArrayList<Candidate>();
    ArrayList<User> users = new ArrayList<>();
    private int numberOfCandidates;

    public Candidate addCandidate(String name, int age, String gender, String address, String phoneNumber, String email) {
        Candidate candidate = new Candidate(name,age,gender,address,phoneNumber,email);
        candidates.add(candidate);
        numberOfCandidates++;
        return candidate;
    }
    public  int getNumberOfCandidates() {
        return numberOfCandidates;
    }
    public Candidate searchCandidate(String name) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
               return candidate;
            }
        }
        throw new IllegalArgumentException("Candidate not found");
    }
    public User addUser(String name, int age, String gender, String iD, String email,String jobTitle) {
        User user = new User(name,age,gender,iD,email,jobTitle);
        users.add(user);
        return user;
    }
    public User searchUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        throw new IllegalArgumentException("User not found");
    }
    public boolean castVotes(String name, String candidateName){
        User voter = searchUser(name);
        if(!voter.hasVoted()){
            throw new IllegalArgumentException("Voter has voted");
        }
        Candidate candidate = searchCandidate(candidateName);
        candidate.getVote();
        voter.voted(false);
        return true;
    }
    public String results(String name, int votes) {
        String result = "";
        for (Candidate candidates : candidates) {
            result = candidates.getName() + " "+ candidates.getVote();
        }
        return result;
    }
}
