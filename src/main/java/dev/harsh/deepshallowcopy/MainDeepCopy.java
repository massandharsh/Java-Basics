package dev.harsh.deepshallowcopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDeepCopy {
    public static void main(String[] args) {
        List<String> classrooms = new ArrayList<>(Arrays.asList("ABC","DEF"));
        DeepCopyStudent student1 = new DeepCopyStudent(classrooms,"abc");
        DeepCopyStudent student2 = new DeepCopyStudent(classrooms,"def");
        student1.getClassRooms().add("GHI");
        System.out.println(student2.getClassRooms());
    }
}
