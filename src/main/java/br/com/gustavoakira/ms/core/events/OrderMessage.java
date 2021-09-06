package br.com.gustavoakira.ms.core.events;

import java.util.Map;
import java.util.UUID;

public class OrderMessage {
    private Map<UUID, Integer> products;
    private UUID orderId;

    public OrderMessage(){

    }

    public OrderMessage(Map<UUID, Integer> products, UUID orderId) {
        this.products = products;
        this.orderId = orderId;
    }

    public Map<UUID, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<UUID, Integer> products) {
        this.products = products;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderMessage{" +
                "products=" + products +
                ", orderId=" + orderId +
                '}';
    }
}
