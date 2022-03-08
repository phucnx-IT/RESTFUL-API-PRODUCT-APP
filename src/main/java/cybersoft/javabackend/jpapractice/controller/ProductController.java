package cybersoft.javabackend.jpapractice.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.jpapractice.dto.ProductDto;
import cybersoft.javabackend.jpapractice.model.Product;
import cybersoft.javabackend.jpapractice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService service;

	@PostMapping
	public Object saveProduct(@RequestBody ProductDto dto) {
		service.save(dto);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@GetMapping
	public Object findAllProduct() {
		List<Product> products = service.findAll();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public Object findById(@PathVariable("id") UUID id) {
		Product product = service.findById(id);
		if (product != null) {
			return new ResponseEntity<>(product, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/{id}")
	public Object deleteById(@PathVariable("id") UUID id) {
		service.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping("/{id}")
	public Object updateProduct(@PathVariable("id") UUID id, @RequestBody ProductDto dto) {
		service.update(id, dto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping("/by-name/{name}")
	public Object findByName(@PathVariable("name") String name) {
		List<Product> products = service.findByName(name);
		if (products.size()>0) {
			return new ResponseEntity<>(products,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}
	
}
