package Tuan3.NguyenHuuPhanAnh.validators;

import Tuan3.NguyenHuuPhanAnh.entities.Category;
import Tuan3.NguyenHuuPhanAnh.validators.annotations.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class ValidCategoryIdValidator implements
        ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category,
                           ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}
