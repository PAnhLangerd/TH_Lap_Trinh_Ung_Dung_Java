package Tuan3.NguyenHuuPhanAnh.repositories;

import Tuan3.NguyenHuuPhanAnh.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}