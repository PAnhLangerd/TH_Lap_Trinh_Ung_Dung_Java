package Tuan3.NguyenHuuPhanAnh.validators;

import Tuan3.NguyenHuuPhanAnh.services.UserService;
import Tuan3.NguyenHuuPhanAnh.validators.annotations.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ValidUsernameValidator implements
        ConstraintValidator<ValidUsername, String> {
    private final UserService userService;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext
            context) {
        return userService.findByUsername(username).isEmpty();
    }
}