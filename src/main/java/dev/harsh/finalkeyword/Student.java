package dev.harsh.finalkeyword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    public static class InitializeDirectly{
        //Direct assignment
        private final int val = 10;
    }

    public static class InitializeInstanceBlock{
        private final int val;
        //Instance block
        {
            val = 10;
        }
    }

    public static class InitializeUsingConstructor{
        private final int val;
        //Constructor
        public InitializeUsingConstructor(int val) {
            this.val = val;
        }
    }

    public static class FinalList{
        public static final List<Integer> list = new ArrayList<>();

        public static void main(String[] args) {
            list.add(1);
            list.add(2);
            System.out.println(list);
        }
    }

    public static class FinalListStaticBlock{
        public static final List<Integer> list;
        private String name;
        static {
            list = new ArrayList<>();
            System.out.println("Static Block!!!");
        }

        public static void main(String[] args) {
            list.add(1);
            list.add(2);
            FinalListStaticBlock finalListStaticBlock = new FinalListStaticBlock();
            System.out.println(finalListStaticBlock.name);
            System.out.println(list);
            System.out.println(FinalListStaticBlock.list);
            System.out.println(list);
            System.out.println("Main method!!");
        }
    }
}
