import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList<String> store = new ArrayList<String>();
        store.add("First");
        store.add("Second");
        store.add("Third");
        store.remove(2);
        System.out.println(store);
    }
}