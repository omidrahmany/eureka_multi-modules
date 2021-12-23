package or.rahmani.client.controller;

import or.rahmani.client.controller.feign.ProviderProxy;
import or.rahmani.client.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientRestController {

    @Autowired
    private ProviderProxy proxy;

    @GetMapping("/fetch-omid-student")
    public StudentDto fetchOmid() {
        return proxy.getSomeStudent();
    }

    @GetMapping("/fetch-students/{from}/{to}")
    public List<StudentDto> fetchSpecificStudents(@PathVariable int from, @PathVariable int to) {
        return proxy.getSpecificYearStudents(from, to);
    }
}
