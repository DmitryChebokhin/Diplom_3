package client;

import lombok.*;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String email;
    private String password;

    public UserRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public UserRequest(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}
