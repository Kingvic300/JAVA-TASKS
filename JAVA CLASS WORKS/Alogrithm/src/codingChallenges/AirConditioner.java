package codingChallenges;

public class AirConditioner{
    boolean on = false;
    int level = 23;

    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public void Level(int newLevel) {
        if (on  && newLevel >= 15 && newLevel <= 23){
            level = newLevel;
        }
    }
    public boolean isOn() {
        return on;
    }
    public int Level() {
        return level;
    }

}