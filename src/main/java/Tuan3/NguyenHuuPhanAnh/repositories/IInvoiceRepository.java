package Tuan3.NguyenHuuPhanAnh.repositories;

import Tuan3.NguyenHuuPhanAnh.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IInvoiceRepository extends JpaRepository<Invoice,
        Long>{
}