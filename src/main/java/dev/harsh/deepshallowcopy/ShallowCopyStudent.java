package dev.harsh.deepshallowcopy;

import java.util.List;

public class ShallowCopyStudent {
    private List<String> classRooms;
    private String studentName;

    public ShallowCopyStudent(List<String> classRooms, String studentName) {
        this.classRooms = classRooms;
        this.studentName = studentName;
    }

    public List<String> getClassRooms() {
        return classRooms;
    }

    public String getStudentName() {
        return studentName;
    }
}
