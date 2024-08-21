package in.deepak.SpringBoot_jpa_crudRepository.Repo;

import in.deepak.SpringBoot_jpa_crudRepository.Entity.book_Entity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksRepositiory extends CrudRepository<book_Entity, Integer> {

    List<book_Entity> findByBookPriceGreaterThan(Integer price);

    List<book_Entity> findByBookAvailabilityStatus(String status);


}
