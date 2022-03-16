import java.util.ArrayList;

public class Pile {
    private ArrayList<String> array1 = new ArrayList<String>(26);
    private ArrayList<String> array2 = new ArrayList<String>(26);
    private ArrayList<String> arrayM = new ArrayList<String>(52);

    public Pile(ArrayList<String> arr) {
        this.arrayM = arr;
    }

    public ArrayList<String> firstPile() {
        String item = "";
        for(int i = 0; i < (this.arrayM.size())/2; i++) {
            item = this.arrayM.get(i);
            this.array1.add(i, item);
        }

        return this.array1;
    }

    public ArrayList<String> secPile() {
        String item = "";
        for(int i = 26; i < this.arrayM.size(); i++) {
            item = this.arrayM.get(i);
            this.array2.add(i, item);
        }

        return this.array2;
    }
}
