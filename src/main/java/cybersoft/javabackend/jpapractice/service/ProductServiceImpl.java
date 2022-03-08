package cybersoft.javabackend.jpapractice.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.jpapractice.dto.ProductDto;
import cybersoft.javabackend.jpapractice.mapper.ProductMapper;
import cybersoft.javabackend.jpapractice.model.Product;
import cybersoft.javabackend.jpapractice.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(ProductDto dto) {
		repository.save(ProductMapper.mapDtoToProduct(dto));
	}

	@Override
	public void deleteById(UUID id) {
		repository.deleteById(id);
	}

	@Override
	public void update(UUID id, ProductDto dto) {
		Product product = repository.findById(id).orElse(null);
		if (product!=null) {
			repository.save(ProductMapper.mapDtoToProduct(dto));
		}
	}

	@Override
	public Product findById(UUID id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Product> findByName(String name) {
			return repository.findByNameLike(name);
	}

}
