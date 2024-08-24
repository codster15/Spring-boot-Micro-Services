package in.jpa_profiles.jpa;

import in.jpa_profiles.Entity.Devlopers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface devRepo extends JpaRepository<Devlopers , Integer> {

}
