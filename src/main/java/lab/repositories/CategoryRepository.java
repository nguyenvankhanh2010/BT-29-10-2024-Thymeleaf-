package lab.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lab.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	List<Category> findByCategoryName(String name);
	
	@Query("SELECT c FROM Category c Where c.categoryName LIKE %:keyword%")
	List<Category> searchByKeyword(@Param("keyword") String keyword);
	
	Page<Category> findByCategoryNameContaining(String keyword, Pageable pageable); 
}
