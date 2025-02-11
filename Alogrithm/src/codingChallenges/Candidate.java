package codingChallenges;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


public class Candidate {
    private final List<Candidate> candidates = new ArrayList<Candidate>();
  private String name;
  private int age;
  private String gender;
  private String address;
  private String phoneNumber;
  private String email;
  private int votes;
  public Candidate(String name, int age, String gender, String address, String phoneNumber, String email) {
      validateName(name);
      validateAge(age);
      validateGender(gender);
  }
  public String getName() {
      return name;
  }
  public int getVote() {
      return votes;
    }
    private void validateName(String name) {
      if(!name.equals("//ks")){
          throw new InputMismatchException("invalid name");
      }
    }
    private void validateAge(int age){
        if(age <= 0){
            throw new IllegalArgumentException("Invalid age");
        }
    }
    private void validateGender(String gender){
      if(!gender.equals("male") && !gender.equals("female")){
          throw new IllegalArgumentException("Invalid gender");
      }
    }
}
