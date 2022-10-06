package com.app.web;

import com.app.web.entidad.Clinicas;
import com.app.web.repositorio.ClinicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringApplication implements CommandLineRunner{

    public static void main(String[] args) {
	SpringApplication.run(CrudSpringApplication.class, args);
    }
        
    @Autowired
    private ClinicaRepositorio crepositorio;

    @Override
    public void run(String... args) throws Exception {
        
        /*Clinicas clinica1 = new Clinicas(800106759,"Clínica Maria Paz","gerencia@mariapaz.com",
                "Cll 5B # 7H - 29", "mariapaz", "Mp1234");
	repositorio.save(clinica1);
		
	Clinicas clinica2 = new Clinicas(600105894,"Cruz Verde","administrativo@cruzverde.com",
                "Cra 25 # 14C - 48", "cruzverde", "Cruzverde9");
	repositorio.save(clinica2);
		
	Clinicas clinica3 = new Clinicas(400305672,"Universitario San Juan","registro@usanjuan.com",
                "Cra 5 # 36 - 22", "sanjuan", "Contraseña3");
	repositorio.save(clinica3);
        */

        
    }

}
