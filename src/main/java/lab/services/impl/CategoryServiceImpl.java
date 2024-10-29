package lab.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lab.entities.Category;
import lab.repositories.CategoryRepository;
import lab.services.CategoryService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
	
	private CategoryRepository categoryRepository;

	@Override
	public <S extends Category> S save(S entity) {
		return categoryRepository.save(entity);

	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();

	}

	@Override
	public void deleteById(Integer integer) {
		categoryRepository.deleteById(integer);
	}

	@Override
	public List<Category> searchByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Category> findByCategoryNameContaining(String keyword, Pageable pageable) {
		return categoryRepository.findByCategoryNameContaining(keyword, pageable);
	}

	@Override
	public void delete(Category entity) {
		categoryRepository.delete(entity);
		
	}

	@Override
	public long count() {
        return categoryRepository.count();

	}

	@Override
	public boolean existsById(Integer integer) {
        return categoryRepository.existsById(integer);

	}

	@Override
	public Optional<Category> findById(Integer integer) {
        return categoryRepository.findById(integer);
	}

}
