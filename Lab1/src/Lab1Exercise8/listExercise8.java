package Lab1Exercise8;
import java.util.ArrayList;
import java.util.Iterator;
import Lab1Exercise7.weightInMars;

public class listExercise8 {
	public listExercise8(){
		weightInMars wMars1 = new weightInMars(40);
		weightInMars wMars2 = new weightInMars(45);
		weightInMars wMars3 = new weightInMars(50);

		ArrayList<weightInMars> weightlist = new ArrayList<weightInMars>();

		weightlist.add(wMars1);
		weightlist.add(wMars2);
		weightlist.add(wMars3);

		Iterator<weightInMars> weightIt = weightlist.iterator();
		while (weightIt.hasNext()) {
			weightIt.next().calculateWeight();
		}
	}
}