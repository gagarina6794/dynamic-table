
public class OwnHashTable implements HandMadeCollection {
    
    private int size = 8;
    private String[] table = new String[size];
    private String[] newTable;
    private boolean check = false;
    private String remove;
    private int totalLength = 0;

    private void resize() {

        newTable = new String[size];
        newTable = table.clone();
        int newSize = size * 2;
        size = newSize;

        table = new String[size];

        for (int i = 0; i < newTable.length; i++) {

            table[i] = newTable[i];
        }
    }

    @Override
    public void add(String word) {

        if (!check(word)) {
            for (int i = 0; i < size; i++) {
                if (table[i] == null) {
                    table[i] = word;
                    totalLength++;
                    System.out.println("OK");
                    if ((float) totalLength >= (size * 0.75f)) {
                        resize();
                    }
                    return;
                }
            }
        } else {
            System.out.println("FAIL");
        }

    }

    @Override
    public void remove(String word) {
        remove = "FAIL";
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                if (table[i].equals(word)) {
                    table[i] = null;
                    totalLength--;
                    remove = "OK";
                }
            }
        }
        System.out.println(remove);
    }

    @Override
    public boolean check(String word) {

        for (String c : table) {
            if (c == null) {
                check = false;
            } else if (c.equals(word)) {
                check = true;
                break;
            }
        }
        return check;
    }

   

}
