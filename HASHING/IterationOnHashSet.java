package HASHING;
import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("London");
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("Delhi");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // Enhanced for loop
        for(String city : cities){
            System.out.println(city); 
        }
    }
}
