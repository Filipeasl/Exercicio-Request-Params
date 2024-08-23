package com.example.posts.post_params.respositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.posts.post_params.models.PurchaseOrder;


public interface OrderRepository extends JpaRepository<PurchaseOrder, Long> {
}