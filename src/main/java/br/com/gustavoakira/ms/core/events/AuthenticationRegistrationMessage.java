package br.com.gustavoakira.ms.core.events;

import java.util.UUID;

public class AuthenticationRegistrationMessage {
    private String username;
    private String password;
    private UUID userId;

    public AuthenticationRegistrationMessage() {

    }

    public AuthenticationRegistrationMessage(String username, String password, UUID userId) {
        this.username = username;
        this.password = password;
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthenticationRegistrationMessage{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
