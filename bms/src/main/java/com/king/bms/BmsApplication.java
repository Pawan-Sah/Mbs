package com.king.bms;

import com.king.bms.dao.CityDao;
import com.king.bms.dao.MovieDao;
import com.king.bms.dao.TheaterDao;
import com.king.bms.entity.City;
import com.king.bms.entity.Movie;
import com.king.bms.entity.Theater;
import com.king.bms.services.impl.MovieServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class BmsApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(BmsApplication.class, args);

		//MovieDao movieDao= (MovieDao) ctx.getBean("movieDao");
		/*MovieServiceImpl movieService= ctx.getBean(MovieServiceImpl.class);

		LocalDateTime releaseDate = LocalDateTime.of(2022, 4, 1, 10, 30);
		Movie movie=new Movie("Iron Man ","It is a science fiction movie",releaseDate,"kefgaertekuf","akufygalesfgufy",3.5f);
		Movie movie1=new Movie("Iron Man 1 ","It is a science fiction movie",releaseDate,"kaertefgaekuf","akufysrfggaleufy",3.0f);
		Movie movie2=new Movie("Iron Man 2","It is a science fiction movie",releaseDate,"keaetafgaekuf","akufygalrsgffsgeufy",3.5f);
		Movie movie3=new Movie("Iron Man 3","It is a science fiction movie",releaseDate,"etkaeawetefgaekuf","aergarekufygaleufy",4.0f);
		Movie movie4=new Movie("Iron Man  4","It is a science fiction movie",releaseDate,"eta4kefgaekuf","aertaakufygaleufy",3.25f);
		movieService.acceptMovieDetails(movie);
		movieService.acceptMovieDetails(movie1);
		movieService.acceptMovieDetails(movie2);
		movieService.acceptMovieDetails(movie3);
		movieService.acceptMovieDetails(movie4);

		*/


		City city1=new City();
		city1.setCityName("Noida");
		City city2=new City();
		city2.setCityName("Delhi");

		CityDao cityDao=ctx.getBean(CityDao.class);
		cityDao.save(city1);
		cityDao.save(city2);

		TheaterDao theaterDao=ctx.getBean(TheaterDao.class);

		Theater theater1=new Theater();
		theater1.setTheatername("alpa");
		theater1.setCity(city1);
		theaterDao.save(theater1);

		Theater theater2=new Theater();
		theater2.setTheatername("beta");
		theater2.setCity(city1);
		theaterDao.save(theater2);

		Theater theater3=new Theater();
		theater3.setTheatername("gama");
		theater3.setCity(city1);
		theaterDao.save(theater3);

		Theater theater4=new Theater();
		theater4.setTheatername("delta");
		theater4.setCity(city2);
		theaterDao.save(theater4);

		System.out.println(cityDao.findAllTheaterByCityId(city1.getCityId()));






	}

}
