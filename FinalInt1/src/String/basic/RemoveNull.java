package String.basic;

import java.util.Arrays;

public class RemoveNull {
public static void main(String[] args) {
	
	String[]sr= {"Marish",null,"krishna","vaibhav"};
	
	String[] filteredArr = Arrays.stream(sr)
            .filter(s -> (s != null && s.trim().length() > 0))
            .toArray(String[]::new);

System.out.println(Arrays.toString(filteredArr));
}
}
