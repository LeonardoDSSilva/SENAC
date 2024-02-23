public class NumerosImpares implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i < 2001; i += 2){
			System.out.println(i);
		}
	}

}
