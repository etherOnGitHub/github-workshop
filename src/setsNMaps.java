import java.util.*;

public class setsNMaps {
    void main() {
        // Instant lookup but needs to redraw on new data insert in list via indexing
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2,7);
        arrayList.add(4);
        IO.println(arrayList.get(3)); // 0(1)
        IO.println(arrayList.size());
        // can add new data without redrawing just links to new location in chain
        // more expensive to use lookups as it has to traverse whole list
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        IO.println(arrayList.get(3)); // O(n)
        IO.println(linkedList.size());
        // values have to be unique
        Set<String> set = new HashSet<>();
        set.add("67");
        set.add("six seven");
        set.add("");
        set.add("null");
        IO.println(set.contains("six seven"));
        IO.println(set);
        // key, value; always, has to be unique
        Map<String, Integer> map = new HashMap<>();
        map.put("67", 67);

        map.put("six seven", 67);
        map.put("", 67);
        map.replace("six seven", 67);
        IO.println(map);
        IO.println(map.get("six seven"));
        map.putIfAbsent("six seven", 1);
        IO.println(map.get("six seven"));
    }
}
