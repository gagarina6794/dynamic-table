
public class OwnHashTable implements HandMadeCollection {

    private int size;
    private String[] table;

    public OwnHashTable() {
        this.size = 0;
        this.table = new String[8];
    }

    @Override
    public void add(String word) {

        if (!check(word)) {
            if ((float) size >= (table.length * 0.75f)) {
                resize();
            }
            table[size] = word;
            size++;
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    @Override
    public void remove(String word) {

        String flag = "FAIL";

        for (int i = 0; i < size; i++) {

            if (table[i].equals(word)) {
                size--;
                table[i] = table[size];
                table[size] = null;
                flag = "OK";
            }
        }
        System.out.println(flag);
    }

    @Override
    public boolean check(String word) {

        for (int i = 0; i < size; i++) {
            if (table[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    private void resize() {

        String[] newTable;
        newTable = table.clone();
        table = new String[newTable.length * 2];
        System.arraycopy(newTable, 0, table, 0, size);
    }

}
