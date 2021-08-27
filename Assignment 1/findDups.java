import java.util.*;

public class findDups {

    static Comparator<String> caseCompare = new Comparator<String>(){
        public int compare(String a, String b) {
            return a.compareToIgnoreCase(b);
        }
    };
    public static void main(String[] args) {

        SortedSet<String> s = new TreeSet<String>(caseCompare);
        for (String a : args)
               s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}