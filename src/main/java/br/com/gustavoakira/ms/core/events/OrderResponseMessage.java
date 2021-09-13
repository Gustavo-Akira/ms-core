package br.com.gustavoakira.ms.core.events;

import java.util.UUID;

public class OrderResponseMessage {
    private UUID orderId;
    private boolean success;
    private String reason;

    public OrderResponseMessage(){

    }

    public OrderResponseMessage(UUID orderId, boolean success, String reason) {
        this.orderId = orderId;
        this.success = success;
        this.reason = reason;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "OrderMessageResponse{" +
                "orderId=" + orderId +
                ", success=" + success +
                '}';
    }
}
