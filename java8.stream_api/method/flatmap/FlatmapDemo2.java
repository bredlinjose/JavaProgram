package method.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo2 {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Scott", "David", "John");
		List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
		List<String> teamC = Arrays.asList("Ken", "Jonny", "Kitty");
		
		List<List<String>> players = Arrays.asList(teamA, teamB, teamC);
		
		List<String> names = players.stream().flatMap(m -> m.stream()).collect(Collectors.toList());
		System.out.println(names);
	}

}
