package or.rahmani.client.controller.feign;

import or.rahmani.client.dto.StudentDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//enabling feign client
//@FeignClient(name = "provider-service" , url = "localhost:8002")
@FeignClient(name = "provider-service")
//enabling ribbon (client side load balancer)
@RibbonClient(name = "provider-service")
public interface ProviderProxy {

    @GetMapping("/get-student")
    StudentDto getSomeStudent();

    @GetMapping("/get-students/entrance-year/from/{from}/to/{to}")
    List<StudentDto> getSpecificYearStudents(@PathVariable int from, @PathVariable int to);
}
