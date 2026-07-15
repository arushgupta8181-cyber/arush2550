package Collection;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Ram");
        map.put(102, "Shyam");
        map.put(103, "Mohan");

        System.out.println(map);

        System.out.println("Name: " + map.get(102));

	}

}
