import java.util.*;

public class randomArgument {

	public static void main(String[] args) {
        List<String> argumentList = Arrays.asList(args);
        Collections.shuffle(argumentList);
        
        System.out.println("Enhanced for loop : ");
       
        for (String arg: argumentList) {
            System.out.print(arg + " ");
        }
        System.out.println();
        
        Collections.shuffle(argumentList);
        System.out.println("Stream :");
        
        argumentList.stream().forEach(e->System.out.print(e +" "));

	}

}