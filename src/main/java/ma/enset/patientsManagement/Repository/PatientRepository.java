package ma.enset.patientsManagement.Repository;

import ma.enset.patientsManagement.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    List<Patient> findByNomContains(String Keyword);

    List<Patient> findByMalade(boolean malade);

}
