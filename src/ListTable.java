
import java.util.ArrayList;
import java.util.List;

public class ListTable implements HandMadeCollection {

    private List<String> list;

    public ListTable() {
        list = new ArrayList<>(8);
    }

    @Override
    public void add(String word) {
        list.add(word);
        System.out.println("OK");
    }

    @Override
    public void remove(String word) {

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).toLowerCase().equals(word.toLowerCase())) {
                list.remove(i);
                System.out.println("OK");
                return;
            }
        }
        System.out.println("FAIL");
    }

    @Override
    public boolean check(String word) {

        int count = 0;

        for (String s : list) {
            if (s.toLowerCase().equals(word.toLowerCase())) {
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
