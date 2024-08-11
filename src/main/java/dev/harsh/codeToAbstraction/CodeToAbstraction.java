package dev.harsh.codeToAbstraction;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CodeToAbstraction {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(0);//[2,3]
        list.remove(1);//[2]
        System.out.println(list);


    }
}
