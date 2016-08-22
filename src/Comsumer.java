
public class Comsumer implements Runnable{
	private Product p;
	public Comsumer(Product p) {
		this.p=p;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ;i<100;i++){
			try {
				p.getName();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}