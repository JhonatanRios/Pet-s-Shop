import java.util.Comparator;

public class Alrevez implements Comparator<Compa> {
	@Override
	public int compare(Compa arg0, Compa arg1) {
		return arg1.getAni() - arg0.getAni();
	}
}
