package pl.reaktor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.reaktor.model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {

	List<Car> findByBrand(String brand);
	List<Car> findByPrice(Double price);
	List<Car> findByName(String name);
	List<Car> findFirstByBrand(String brand);
	List<Car> findFirst2ByBrand(String brand);
	//select * from car where brand = b1 or brand = b2
	List<Car> findAllByBrandOrBrand(String brand1, String brand2);
	//List<Car> findAllByNameStartingWith(String name);
	//1,4
	//List<Car> findAllByNameLike(String pattern);
	//2
	//List<Car> findAllByNameContaining(String pattern);
	//3
	//List<Car> findAllByNameEndingWith(String pattern);
	//5
	List<Car> findAllByNameContainingAndStartingWith(String pattern1, String pattern2);
	
	List<Car> findAllByBrandAndPriceLessThanEqual(String brand, Double price);
	List<Car> findAllByBrandLikeAndPriceBetween(String pattern, Double low, Double high);
}