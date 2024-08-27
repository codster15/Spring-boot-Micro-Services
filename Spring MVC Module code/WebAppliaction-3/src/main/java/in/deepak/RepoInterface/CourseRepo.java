package in.deepak.RepoInterface;

import in.deepak.Entity.course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<course,Integer> {

}
