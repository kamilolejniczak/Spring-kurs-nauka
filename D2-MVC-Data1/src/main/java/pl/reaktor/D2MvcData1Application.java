package pl.reaktor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.reaktor.model.Car;
import pl.reaktor.repository.CarRepo;

@SpringBootApplication
public class D2MvcData1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
		SpringApplication.run(D2MvcData1Application.class, args);
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("A6","Audi",200000.0));
		cars.add(new Car("Auris","Toyota",100000.0));
		cars.add(new Car("Panda","Fiat",40000.0));
		cars.add(new Car("Tipo","Fiat",30000.0));
		cars.add(new Car("Uno","Fiat",20000.0));
		cars.add(new Car("M1","BMW",200000.0));
		cars.add(new Car("M3","BMW",100000.0));
		cars.add(new Car("Focus","Ford",40000.0));
		cars.add(new Car("CC","VW",30000.0));
		cars.add(new Car("500","Fiat",20000.0));
		
		CarRepo cr = ctx.getBean(CarRepo.class);
		//zapisanie do bazy danych
		cars.forEach(cr::save);
		
		//Car selectedCar = cr.findOne(1L);
		//cr.delete(selectedCar);
		
		cr.findAll().forEach(System.out::println);
		cr.count();
		
		//List<Car> list1 = cr.findByBrand("Fiat");
		//System.out.println(list1);
		//List<Car> list2 = cr.findByPrice(30000.0);
		//System.out.println(list2);
		//List<Car> list3 = cr.findByName("Uno");
		//System.out.println(list3);
		//List<Car> list4 = cr.findFirst2ByBrand("Fiat");
		//System.out.println(list4);
		//List<Car> list5 = cr.findAllByBrandOrBrand("BMW", "VW");
		//System.out.println(list5);
		//List<Car> list6 = cr.findAllByNameStartingWith("B");
		//System.out.println(list6);
		//List<Car> list7 = cr.findAllByNameLike("i%");
		//System.out.println(list7);
		//List<Car> list8 = cr.findAllByNameLike("A%A");
		//System.out.println(list8);
		//List<Car> list9 = cr.findAllByNameContaining("st");
		//System.out.println(list9);
		//List<Car> list10 = cr.findAllByNameEndingWith("a");
		//list10.forEach(System.out::println);
		//List<Car> list11 = cr.findAllByNameContainingAndStartingWith("st", "A%A");
		//System.out.println(list11);
		List<Car> list12 = cr.findAllByBrandAndPriceLessThanEqual("Fiat", 20000.0);
		System.out.println(list12);
		List<Car> list13 = cr.findAllByBrandLikeAndPriceBetween("%ia%", 30000.0, 100000.0);
		System.out.println(list13);
		
		
		
		
		ctx.close();
	}
}
