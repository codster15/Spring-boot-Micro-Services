package in.deepak.ServiceClass;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<String> getCourse(){
        return Arrays.asList("java","DSA","Python","SpringBoot","Cloud");
    }




}
