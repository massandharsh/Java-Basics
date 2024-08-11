package dev.harsh.abstraction;

public abstract class Bird {
    private String colour;
    private int feathers;
    private int beakSize;
    public abstract void fly();
    private void eat(){
        System.out.println("Eating like a bird!!");
    }
}
