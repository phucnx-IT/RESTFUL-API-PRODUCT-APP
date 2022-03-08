package cybersoft.javabackend.jpapractice.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity(name = "product_eshop")
public class Product {
	@Id
	@GeneratedValue
	@Type(type = "uuid-char")
	public UUID id;
	public String name;
	public String description;
	public String brief;
	public String madeIn;
	public float price;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product(UUID id, String name, String description, String brief, String madeIn, float price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.brief = brief;
		this.madeIn = madeIn;
		this.price = price;
	}

	public Product() {
		super();
	}

}
