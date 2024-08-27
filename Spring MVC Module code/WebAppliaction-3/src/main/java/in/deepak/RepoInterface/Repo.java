package in.deepak.RepoInterface;

import in.deepak.Entity.StudentEnquiry;
import in.deepak.Entity.course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<StudentEnquiry,Integer> {


}
