package dev.harsh.constructorchaining;

public class Doctor {
    private String name;
    public Doctor(String name) {
        this.name = name;
        System.out.println("Doctor constructor invoked");
    }

    public String getName() {
        return name;
    }
}
