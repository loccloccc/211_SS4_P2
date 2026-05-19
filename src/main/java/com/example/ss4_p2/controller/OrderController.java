package com.example.ss4_p2.controller;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    static class Order {

        private String orderId;
        private String customerName;
        private String address;
        private String productId;
        private int quantity;

        public Order() {
        }

        public Order(String orderId, String customerName,
                     String address, String productId, int quantity) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.address = address;
            this.productId = productId;
            this.quantity = quantity;
        }

        // Getter
        public String getOrderId() {
            return orderId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getAddress() {
            return address;
        }

        public String getProductId() {
            return productId;
        }

        public int getQuantity() {
            return quantity;
        }

        // Setter
        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {

        // Sinh orderId tự động
        order.setOrderId(UUID.randomUUID().toString());

        // Trả về order hoàn chỉnh
        return order;
    }
}