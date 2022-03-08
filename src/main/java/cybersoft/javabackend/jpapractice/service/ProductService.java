package cybersoft.javabackend.jpapractice.service;

import java.util.List;
import java.util.UUID;

import cybersoft.javabackend.jpapractice.dto.ProductDto;
import cybersoft.javabackend.jpapractice.model.Product;

public interface ProductService {
List<Product> findAll();
Product findById(UUID id);
void save(ProductDto dto);
void deleteById(UUID id);
void update (UUID id, ProductDto dto);
List<Product> findByName(String name);
}
