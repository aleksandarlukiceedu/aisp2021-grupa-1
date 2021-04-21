import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(7);

        map.put("abc", "123");
        map.put("123", "abc");
        map.put("user1", "123");

        System.out.println(map.get("abc"));

    }
}
