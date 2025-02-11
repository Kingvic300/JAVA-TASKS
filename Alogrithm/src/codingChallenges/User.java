package codingChallenges;

public class User {
    private String name;
    private int age;
    private String gender;
    private String iD;
    private String email;
    private String jobTitle;
    private Boolean votes;
    private PollingUnit pollingUnit;

    public User(String name, int age, String gender, String iD,String email,String jobTitle) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.iD = iD;
        this.email = email;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getID() {
        return iD;
    }
    public boolean hasVoted() {
        return this.votes = true;
    }
    public void voted(Boolean votes){
        this.votes = votes;
    }
    public void castVote(String name,String candidateName){
        pollingUnit.castVotes(name,candidateName);
    }
}