package com.revature;

import com.revature.models.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);

		//We need to create an ApplicationContext to operate as our IoC container
		//recall that an IoC container manages beans and performs dependency injection
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		//what's happening above?
		//we are creating a new IoC container using the xml configuration that WE made

		//Get a movie bean using getBean()
		Movie m = ac.getBean(Movie.class);

		System.out.println(m);
		//we got a Director object baked in to this Movie object... where did it come from?
		//THIS IS AN EXAMPLE OF DEPENDENCY INJECTION!!! Director was INJECTED into Movie
			//this is thanks to our BEAN WIRING in the applicationContext.xml

		//let's give this bean some values
		m.setMovieId(1);
		m.setMovieTitle("Inception");
		m.getDirector().setDirectorId(1);
		m.getDirector().setDirectorName("Christoper Nolan");

		System.out.println(m);


	}

}
