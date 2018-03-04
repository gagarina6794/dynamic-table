
import java.util.HashMap;
import java.util.Map;

public class MapTable implements HandMadeCollection {

    private Map<Integer, String> map;
    private int autoKey;

    public MapTable() {

        autoKey = 0;
        map = new HashMap<>(8);
    }

    @Override
    public void add(String word) {
        
        map.put(autoKey, word);
        System.out.println("OK");
        autoKey++;
    }

    @Override
    public void remove(String word) {

        for (Map.Entry<Integer, String> v : map.entrySet()) {
            if (v.getValue().toLowerCase().equals(word.toLowerCase())) {
                map.remove(v.getKey());
                System.out.println("OK");
                return;
            }
        }
        System.out.println("FAIL");
    }

    @Override
    public boolean check(String word) {
        
        int count = 0;

        for (Map.Entry<Integer, String> v : map.entrySet()) {
            if (v.getValue().toLowerCase().equals(word.toLowerCase())) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("OK " + count);
            return true;
        }
        System.out.println("FAIL");
        return false;
    }

}
