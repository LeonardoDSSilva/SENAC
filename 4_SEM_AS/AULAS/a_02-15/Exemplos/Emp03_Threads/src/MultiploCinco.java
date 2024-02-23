public class MultiploCinco extends Thread{

	@Override
	public void run(){
		for(int i = 0; i < 2001; i += 5){
			System.out.println(i);
		}
	}

}
