import java.util.*;

class trimList {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<String>();
        cities.add("Chennai   ");
        cities.add(" Kolkata  ");
        cities.add("Delhi");
        cities.add("  Bombay");
        cities.add("    Banglore    ");
        // System.out.println(cities);

        for(int i = 0; i < cities.size(); i++) {
            cities.set(i, cities.get(i).trim());
        }

        System.out.println(cities);
    }   
}