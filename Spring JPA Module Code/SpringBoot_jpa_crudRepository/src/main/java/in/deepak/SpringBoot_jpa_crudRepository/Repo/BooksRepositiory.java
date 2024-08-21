package in.deepak.SpringBoot_jpa_crudRepository.Repo;

import in.deepak.SpringBoot_jpa_crudRepository.Entity.book_Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksRepositiory extends CrudRepository<book_Entity, Integer> {


    //find by Method
    List<book_Entity> findByBookPriceGreaterThan(Integer price);

    List<book_Entity> findByBookAvailabilityStatus(String status);




//----------------------------------------------------------

        // Custom Query

    @Query("from book_Entity")
    public List<book_Entity> getbooks();

    @Query("from book_Entity where bookPrice = 2400")
    public List<book_Entity> getbookPrice();


    @Query("from book_Entity where bookPrice = 8300")
    public List<book_Entity> getbookPriceList();


    @Query("select bookName from book_Entity")
    public List<book_Entity> allNames();
}
