package in.deepak.Spring_jpa_Repositiory_Assignnment.repo;

import in.deepak.Spring_jpa_Repositiory_Assignnment.Entity.electronics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface Jpa_Repositiory extends JpaRepository<electronics,Integer> {

    @Modifying
    @Transactional
   @Query(value = "INSERT INTO electronics (id, name, price) VALUES (:id, :name, :price)", nativeQuery = true)
  void insert  (  @Param("id") Integer id,      @Param("name") String name,         @Param("price") Integer price   );



    @Modifying
    @Transactional
    @Query(value = "UPDATE electronics SET name = :name, price = :price WHERE id = :id", nativeQuery = true)
    void update (  @Param("id") Integer id,      @Param("name") String name,         @Param("price") Integer price   );

    @Modifying
    @Transactional
    @Query(value = "delete from electronics WHERE id = :id", nativeQuery = true)
    void delete  (  @Param("id") Integer id);


}
