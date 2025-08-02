public class PetStatus {
    protected String name;
    protected int hunger = 50;
    protected int energy = 50;
    protected int happiness = 50;

    public PetStatus(String name){
        this.name = name;
    }

    public void feed() {
        hunger = Math.max(0, hunger - 10);
        happiness += 5;
    }

    public void play() {
        energy -= 10;
        happiness += 10;
    }

    public void sleep() {
        energy = Math.min(100, energy + 20);
    }

    public String getStatus() {
        return "Hunger : " + hunger + " | Energy : " + energy + " | Happiness : " + happiness;
    }
}
