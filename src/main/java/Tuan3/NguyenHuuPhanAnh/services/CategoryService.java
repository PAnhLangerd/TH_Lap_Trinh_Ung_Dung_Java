package Tuan3.NguyenHuuPhanAnh.services;

import Tuan3.NguyenHuuPhanAnh.entities.Category;
import Tuan3.NguyenHuuPhanAnh.services.CategoryService;
import Tuan3.NguyenHuuPhanAnh.repositories.ICategoryRepository;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Transactional(isolation = Isolation.SERIALIZABLE, rollbackFor = {Exception.class, Throwable.class})
public class CategoryService {
    private final BookService bookService;
    private final ICategoryRepository categoryRepository;
    private final CartService cartService;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }
    public void updateCategory(@NotNull Category category) {
        Category existingCategory = categoryRepository
                .findById(category.getId())
                .orElse(null);
        Objects.requireNonNull(existingCategory)
                .setName(category.getName());
        categoryRepository.save(existingCategory);
    }
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }
}
