public class NumerosPares extends Thread{

	@Override
	public void run(){
		for(int i = 0; i < 2001; i += 2){
			System.out.println(i);
		}
	}
	
}
