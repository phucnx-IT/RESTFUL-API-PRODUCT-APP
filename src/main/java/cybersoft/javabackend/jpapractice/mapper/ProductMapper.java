package cybersoft.javabackend.jpapractice.mapper;

import cybersoft.javabackend.jpapractice.dto.ProductDto;
import cybersoft.javabackend.jpapractice.model.Product;

public class ProductMapper {
public static Product mapDtoToProduct(ProductDto dto) {
	Product product = new Product();
	product.setBrief(dto.getBrief());
	product.setDescription(dto.getDescription());
	product.setId(dto.getId());
	product.setMadeIn(dto.getMadeIn());
	product.setName(dto.getName());
	product.setPrice(dto.getPrice());
	return product;
}
}
