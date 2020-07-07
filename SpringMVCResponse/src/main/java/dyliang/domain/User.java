package dyliang.domain;

import lombok.*;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
