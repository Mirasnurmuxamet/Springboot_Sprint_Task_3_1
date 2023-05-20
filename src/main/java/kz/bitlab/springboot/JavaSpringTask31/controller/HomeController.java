package kz.bitlab.springboot.JavaSpringTask31.controller;

import kz.bitlab.springboot.JavaSpringTask31.db.DBManager;
import kz.bitlab.springboot.JavaSpringTask31.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController  {

    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("allStudents", students);
        return "index";
    }

    @GetMapping(value = "/add_student")
    public String addStudentPage(Model model) {
        return "addStudent";
    }

    @PostMapping(value = "add_student")
    public String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }



}
