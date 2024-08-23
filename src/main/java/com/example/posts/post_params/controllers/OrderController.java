package com.example.posts.post_params.controllers;

import com.example.posts.post_params.models.PurchaseOrder;
import com.example.posts.post_params.respositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public List<PurchaseOrder> getOrders(
            @RequestParam Optional<String> orderNumber,
            @RequestParam Optional<String> customerName,
            @RequestParam Optional<String> status,
            @RequestParam Optional<BigDecimal> minAmount,
            @RequestParam Optional<BigDecimal> maxAmount,
            @RequestParam Optional<LocalDate> startDate,
            @RequestParam Optional<LocalDate> endDate) {

        // Lógica de filtragem pode ser adicionada aqui

        return orderRepository.findAll();  // Por enquanto, retornando todos os pedidos
    }
}