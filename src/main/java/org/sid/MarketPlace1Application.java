package org.sid;


import org.sid.dao.UtilisateursRepository;
import org.sid.entities.Utilisateurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketPlace1Application implements CommandLineRunner{

	@Autowired
	private UtilisateursRepository utilisateursRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MarketPlace1Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		//utilisateursRepository.save(new Utilisateurs("aaa", "aaa", "aaa", "aaa"));
		
		utilisateursRepository.findAll().forEach(u->{
			System.out.println(u.getNom());
		});
	}
}
