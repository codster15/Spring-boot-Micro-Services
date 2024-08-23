package in.deepak.Spring_jpa_Repositiory.JpaRepositiory;

import in.deepak.Spring_jpa_Repositiory.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaRepositiory extends JpaRepository<Employee , Integer> {

    List<Employee> findByGender(String gender);
}
