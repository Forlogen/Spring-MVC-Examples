package dyliang.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private List<Pet> list;

    @Getter
    @Setter
    private Map<String, Pet> map;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pets0=" + list +
                ", pets1=" + map +
                '}';
    }

    public static void main(String[] args) {
        User user = new User();

        List<Pet> list = new ArrayList<Pet>(){};
        list.add(new Pet("Coco", 1));
        Map<String, Pet> petMap = new LinkedHashMap<>();
        petMap.put("onr", new Pet("Nata", 2));

        System.out.println(list);
        System.out.println(petMap);
    }
}
