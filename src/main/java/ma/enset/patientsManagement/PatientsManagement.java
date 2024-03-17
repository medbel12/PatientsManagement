package ma.enset.patientsManagement;

import ma.enset.patientsManagement.Repository.PatientRepository;
import ma.enset.patientsManagement.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PatientsManagement implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(PatientsManagement.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        patientRepository.save(new Patient(null,"karim",new Date(2002,07,26),true,50));
//        patientRepository.save(new Patient(null,"ibrahim",new Date(1992,06,12),false,50));
//        patientRepository.save(new Patient(null,"anouar",new Date(2002,05,19),true,50));
//        patientRepository.save(new Patient(null,"bilal",new Date(2007,07,28),false,50));


        System.out.println("Liste des patients");
        List<Patient> patient1 = patientRepository.findAll();
        patient1.forEach(p1 -> {
            System.out.println(p1.toString());
        });

        System.out.println("_______________________");

        System.out.println("recuperee un patient par son Id");
        Patient patient=patientRepository.findById(Long.valueOf(1)).get();
        System.out.println(patient.getNom()+" "+patient.getScore()+" "+patient.isMalade()+
                " "+patient.getDateNaissance());

        System.out.println("_____________________");

        System.out.println("La liste des personnes malades");
        List<Patient> patient2=patientRepository.findByMalade(true);
        patient2.forEach(p2 ->{
            System.out.println(p2.getNom()+" "+p2.getScore()+" "+p2.isMalade()+" "+p2.getDateNaissance());
        } );

        System.out.println("_____________________");

        System.out.println("chrcher un patient par une mot clee");
        List<Patient> patient3=patientRepository.findByNomContains("r");
        patient3.forEach(p3 -> {
            System.out.println(p3);
        });

        System.out.println("_____________________");


        System.out.println("modifier un patient");
        Patient p=patientRepository.findById(Long.valueOf(1)).get();
        p.setScore(56);
        p.setMalade(false);
        System.out.println(p.getNom()+" "+p.getScore()+" "+p.isMalade()+" "+p.getDateNaissance());
        patientRepository.save(p);

        System.out.println("_____________________");

        System.out.println("Supprimer un patient par son Id");
        patientRepository.deleteById(Long.valueOf(4));
        patient1.forEach(p1 -> {
            System.out.println(p1.toString());
        });

        System.out.println("_____________________");










    }
}
