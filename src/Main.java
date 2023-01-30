import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] aliceToDos = new String[]{"coding","reading","learning"};
		String[] bobToDos = new String[]{"reading","coding","learning"};
		String[] timToDos = new String[]{"reading","learning","coding"};

		System.out.println("Is Alice's array equal to Bob array? "+(Arrays.equals(aliceToDos, bobToDos)));
		System.out.println("Is Alice's array equal to Tim array? "+(Arrays.equals(aliceToDos, timToDos)));

		System.out.println("Is Alice's array having the same length of Bob's array? "+(aliceToDos.length==bobToDos.length));
		System.out.println("Is Alice's array having the same length of Tim's array? "+(aliceToDos.length==timToDos.length));
		//got helped from intellij again, need to understand more about streams
		System.out.println("Is Alice having the same tasks of Bob? "+(Arrays.equals(Arrays.stream(aliceToDos).sorted().toArray(), Arrays.stream(bobToDos).sorted().toArray())));
		System.out.println("Is Alice having the same tasks of Tim? "+(Arrays.equals(Arrays.stream(aliceToDos).sorted().toArray(), Arrays.stream(timToDos).sorted().toArray())));
	}
}