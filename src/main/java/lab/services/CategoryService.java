package lab.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import lab.entities.Category;


public interface CategoryService {
	 <S extends Category> S save(S entity);

	    List<Category> findAll();

	    void deleteById(Integer integer);
	    
	    List<Category> searchByKeyword(String keyword);

	    Page<Category> findByCategoryNameContaining(String keyword, Pageable pageable);
	    
	    void delete(Category entity);
	    
	    long count();
	    
	    boolean existsById(Integer integer);
	    
	    Optional<Category> findById(Integer integer);
}
