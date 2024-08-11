package dev.harsh.polymorphism;

public class D extends C{
    public void Do(){
        System.out.println("Do called for D");
    }
    public void Do(int a){
        System.out.println("Do called for D with int : " + a);
    }
    public void Do(long a){
        System.out.println("Do called for D with long : " + a);
    }

}
