package com.example.demo;

import java.util.HashSet;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.MyRepositary;
import com.entity.Restaurant;
import com.entity.onetomany.Book;
import com.entity.onetomany.BookRepositary;
import com.entity.onetomany.Page;
import com.entity.onetomany.PageRepositary;



@SpringBootApplication
//@EnableAdminServer
@EntityScan(basePackages = {"com.entity"})
@EnableJpaRepositories(basePackages = {"com.entity"})
@EnableAutoConfiguration
public class Uno7Application {

	public static void main(String[] args) {
		SpringApplication.run(Uno7Application.class, args);
	}

}//end of class

@RestController
class MyRestController
{
	  @Autowired
	  MyRepositary repo;
	  
	  @PostMapping("/insert")
	  public String insert()
	  {
		  Restaurant obj = new Restaurant(2,"kinara","paud road","A+","udupi");
		  repo.save(obj);
		  return "inserted successfully";
	  }
	  
	  private static final Logger logger = LoggerFactory.getLogger(MyRestController.class);
	  @GetMapping("/getInfo/{id}")
	  public String getData(@PathVariable int id)
	  {
		  Restaurant r =repo.findById(id).get();
		  logger.trace("trace level message");
		  logger.error("error level message");
		  logger.warn("warn level message");
		  return r.toString();
	  }
	  
	  @PutMapping("/changereview/{id}/{newreview}")
	  public ResponseEntity<Restaurant> changeReview(@PathVariable int id,@PathVariable String newreview)
	  {
		 try {
		  Restaurant r =repo.findById(id).get();
		  r.setReviews(newreview);
		  repo.save(r);
		  return ResponseEntity.status(200).body(r);
		 }catch(Exception e)
		 {
			 return ResponseEntity.status(404).build();
		 }
		  
	  }
	  
	  @DeleteMapping("/del/{id}")
	  public String deleteRec(@PathVariable int id)
	  {
		  repo.deleteById(id);
		  return "deleted successfully";
	  }
	  
	  @GetMapping("/all")
	  public List<Restaurant> getAll()
	  {
		  repo.findAll();
		  return repo.findAll();
	  }
	  
	  @GetMapping("/locality/{loc}")
	  public List<Restaurant> getLoc(@PathVariable String loc)
	  {
		  
		  return repo.findByLocality(loc);
	  }
	  
	  @Autowired
	  private BookRepositary bookrepo;

	  @Autowired
	  private PageRepositary pagerepo;
	  
	  
	  @PostMapping("/addbook")
	  public String insertBook()
	  {
		  Book b = new Book("Learning CPP","pradnya","111123435");
		  
		  Page p1 = new Page(1,"ww","1",b);
		  Page p2 = new Page(2,"qqq","1",b);
		  Page p3 = new Page(3,"fgfg","1",b);
		  
		  HashSet<Page>  hs = new HashSet<>();
		  hs.add(p1); hs.add(p2);hs.add(p3);
		  
		  b.setPages(hs);
		  
		  Book savedbook =  bookrepo.save(b);
		  
		  return "book inserted with id ="+savedbook.getId();
	  }
}