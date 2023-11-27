import java.util.ArrayList;
import java.util.HashSet;

public class App {

    public static void studList() {
        ArrayList<String> stud = new ArrayList<>();
        ArrayList<Double> uspe = new ArrayList<>();
        stud.add("Peter");
        stud.add("Sophia");
        stud.add("Jacob");
        stud.add("Matt");
        stud.add("Hannah");
        uspe.add(4.5);
        uspe.add(6.3);
        uspe.add(3.8);
        uspe.add(5.5);
        uspe.add(4.7);


        ArrayList<String> list = sortA(stud,uspe);
        for (String s:list) {
            System.out.println(s);
            // View.printer(s);
        }
        System.out.println("-");
        // View.printer("-");
        for (int i = list.size()-1; i >= 0; i--) {
            String s = list.get(i);
            System.out.println(s);
            // View.printer(s);
        }

    }

    private static ArrayList<String> sortA(ArrayList<String> st, ArrayList<Double> us) {
        ArrayList<String> list = new ArrayList<>();
        String s;
        for (int i = 0; i < st.size(); i++) {
            s = st.get(i) + ": " + us.get(i);
            list.add(s);
        }
        HashSet<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        return list;
    }

}
