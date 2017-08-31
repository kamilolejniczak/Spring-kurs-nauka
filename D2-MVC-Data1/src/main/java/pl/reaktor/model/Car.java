package pl.reaktor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	//encja - tabela w db
public class Car {
	//adnotacja okreslajaca klucz glowny
	@Id
	//autoinkrementacja id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String brand;
	private Double price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Car() {}
	public Car(String name, String brand, Double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString(){
		return "Auto [id="+id+", name="+name+",brand="+brand+",price="+price+"]";
	}
	
}
