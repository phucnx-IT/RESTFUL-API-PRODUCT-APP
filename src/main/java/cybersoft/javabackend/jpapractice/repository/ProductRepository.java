package cybersoft.javabackend.jpapractice.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cybersoft.javabackend.jpapractice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
//	@Query("SELECT p FROM Product p WHERE p.name like ?1")
	List<Product> findByNameLike(String name);
}
