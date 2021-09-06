package br.com.gustavoakira.ms.core.events;

import java.util.UUID;

public class OrderResponseMessage {
    private UUID orderId;
    private boolean success;

    public OrderResponseMessage(){

    }

    public OrderResponseMessage(UUID orderId, boolean success) {
        this.orderId = orderId;
        this.success = success;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "OrderMessageResponse{" +
                "orderId=" + orderId +
                ", success=" + success +
                '}';
    }
}
