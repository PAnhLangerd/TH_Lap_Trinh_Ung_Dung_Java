package Tuan3.NguyenHuuPhanAnh.repositories;

import Tuan3.NguyenHuuPhanAnh.entities.ItemInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IItemInvoiceRepository extends
        JpaRepository<ItemInvoice, Long>{
}