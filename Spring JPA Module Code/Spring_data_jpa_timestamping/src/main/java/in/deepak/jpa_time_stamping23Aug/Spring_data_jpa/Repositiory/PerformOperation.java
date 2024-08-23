package in.deepak.jpa_time_stamping23Aug.Spring_data_jpa.Repositiory;

import in.deepak.jpa_time_stamping23Aug.Spring_data_jpa.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PerformOperation extends JpaRepository<Products , Integer> {


}
