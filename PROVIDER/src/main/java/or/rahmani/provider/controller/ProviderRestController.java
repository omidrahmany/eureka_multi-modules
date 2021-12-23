package or.rahmani.provider.controller;

import or.rahmani.provider.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/provider")
public class ProviderRestController {

    @GetMapping("/get-student")
    public Student getSomeStudent() {
        return new Student(1L, "omid", "rahmani", 933881504L, 93);
    }

    @GetMapping("/get-students/entrance-year/from/{from}/to/{to}")
    public List<Student> getSpecificYearStudents(@PathVariable Integer from, @PathVariable Integer to){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L , "omid" , "rahmani" , 9338854L , 93));
        students.add(new Student(1L , "omid" , "rahmani" , 9338854L , 93));
        students.add(new Student(1L , "omid" , "rahmani" , 9338854L , 93));
        students.add(new Student(1L , "omid" , "rahmani" , 9338854L , 93));
        return students;
    }

}
