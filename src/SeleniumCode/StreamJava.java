package SeleniumCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamJava {

	public static void main(String[] args)

	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Gajanan");
		names.add("Shweta");
		names.add("wedding for");
		names.add("15-thDecember");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String ActualValue = names.get(i);
			if (ActualValue.startsWith("G")) {
				count++;
				// System.out.println(count);

				System.out.println(ActualValue);
			}

		}
		System.out.println(count);
		// By Using Streams
		long c = names.stream().filter(s -> s.startsWith("G")).count();
		names.stream().filter(s -> s.startsWith("G")).forEach(s -> System.out.println(s));

		System.out.println(c);

		List<String> names1 = Arrays.asList("Gajanan", "Shweta", "Gudiya", "Sany");

		System.out.println("//print All the names which has more than 4 letters");
		names1.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

		System.out.println("//Print All the names which has more than 4 letters & with 2nd one");
		names1.stream().filter(s -> s.length() > 4).limit(2).forEach(s -> System.out.println(s));
		System.out.println("//Print names which has last letter 'a' & UpperCase");

		names1.stream().filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
names1.stream().map(s->s.toUpperCase()).forEach(s -> System.out.println(s));
		
		System.out.println("Merging tow Srting");
		//sorting means alphabetical
		 Stream<String> concatTwoString = Stream.concat(names.stream(), names1.stream()).sorted();
		 concatTwoString.forEach(s -> System.out.println(s));
		 System.out.println("//Print Unique Number from the ARrray"); 
		 List<Integer> UniqNumber = Arrays.asList(1,2,2,3,5,5);
		 UniqNumber.stream().distinct().forEach(s->System.out.println(s));
		
		 
	}
}
