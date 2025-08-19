package test_20250819;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
//        Gson gson = new Gson();
//        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        Map<String, Object> customer1 = new HashMap<>();
        customer1.put("name", "홍길동");
        customer1.put("rating", "vip");
        customer1.put("age", "30");
        customers.add(customer1);

        Map<String, Object> customer2 = new HashMap<>();
        customer2.put("name", "김기영");
        customer2.put("rating", "GOLD");
        customer2.put("age", "35");
        customers.add(customer2);

        for(Map<String, Object> map : customers){
            String name = (String)map.get("name");
            String rating = (String)map.get("rating");
            String age = (String)map.get("age");
            System.out.println("name=" + name +
                    "\nrating=" + rating +
                    "\nage=" + age);
        }
    }
}
