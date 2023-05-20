package kz.bitlab.springboot.JavaSpringTask31.db;

import kz.bitlab.springboot.JavaSpringTask31.models.Student;

import java.util.ArrayList;

public class DBManager {
    public  static final ArrayList<Student> students = new ArrayList<>();
    private static Long id = 6L;
    static {
        students.add(new Student(1L,"Ali", "Aliev", 90, "A"));
        students.add(new Student(2L,"Alibek", "Kaliev", 87, "B"));
        students.add(new Student(3L,"Zhanali", "Saliev", 70, "C"));
        students.add(new Student(4L,"Asan", "Asanov", 55, "D"));
        students.add(new Student(5L,"Usen", "Aliev", 45, "F"));

    }

    public static ArrayList<Student> getStudents(){
        return students;
    }
    public static void addStudent(Student student){
        student.setMark(getExamMark(student.getExam()));
        student.setId(id);
        students.add(student);
        id++;
    }

    public static String getExamMark(int exam){
        String mark = "";
        if(exam>=90) mark = "A";
        else if (exam<90 && exam>=75) mark = "B";
        else if(exam<75 && exam>=60) mark = "C";
        else if(exam<60 && exam>=50) mark = "D";
        else if(exam<50) mark = "F";

        return mark;
    }

}

