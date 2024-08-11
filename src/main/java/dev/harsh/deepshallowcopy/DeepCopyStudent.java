package dev.harsh.deepshallowcopy;

import java.util.ArrayList;
import java.util.List;

public class DeepCopyStudent {
    private List<String> classRooms;
    private String studentName;

    public DeepCopyStudent(List<String> classRooms, String studentName) {
        this.classRooms = new ArrayList<>(classRooms);
        this.studentName = studentName;
    }

    public List<String> getClassRooms() {
        return classRooms;
    }

    public String getStudentName() {
        return studentName;
    }

}
