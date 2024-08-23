package com.example.posts.post_params.services;

import com.example.posts.post_params.models.PurchaseOrder;
import com.example.posts.post_params.respositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<PurchaseOrder> getFilteredOrders() {
        // Adicione aqui a lógica de negócios para filtrar pedidos
        return orderRepository.findAll();
    }
}