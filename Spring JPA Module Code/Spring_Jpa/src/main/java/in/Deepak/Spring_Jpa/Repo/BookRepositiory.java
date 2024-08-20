package in.Deepak.Spring_Jpa.Repo;


import in.Deepak.Spring_Jpa.Entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositiory extends CrudRepository<Book, Integer > {


}
