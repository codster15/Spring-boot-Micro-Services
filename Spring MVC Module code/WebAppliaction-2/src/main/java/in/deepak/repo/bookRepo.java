package in.deepak.repo;

import in.deepak.Entity.book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepo extends JpaRepository<book,Integer> {

}
