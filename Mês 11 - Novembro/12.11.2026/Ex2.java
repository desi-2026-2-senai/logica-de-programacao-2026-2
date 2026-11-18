import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		
		a.getLast();

		int vetor[] = { 5, 7, 21, 64, 15, 21 };

		for (int i = 0; i < vetor.length; i++) {
			// System.out.println(vetor[i]);
		}

		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.println(vetor[i]);
		}

	}

}
