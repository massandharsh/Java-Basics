package dev.harsh.deepshallowcopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainShallowCopy {
    public static void main(String[] args) {
        List<String> classrooms = new ArrayList<>(Arrays.asList("ABC","DEF"));
        ShallowCopyStudent student1 = new ShallowCopyStudent(classrooms,"abc");
        ShallowCopyStudent student2 = new ShallowCopyStudent(classrooms,"def");
        student1.getClassRooms().add("GHI");
        System.out.println(student2.getClassRooms());
    }
}
