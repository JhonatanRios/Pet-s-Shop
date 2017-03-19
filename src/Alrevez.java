import java.util.Comparator;

public class Alrevez implements Comparator<Compa> {

	@Override
	public int compare(Compa arg0, Compa arg1) {
		// TODO Auto-generated method stub
		return arg1.getCodigo() - arg0.getCodigo();
	}
}
