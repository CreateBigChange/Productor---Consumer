
public class Producter implements Runnable{
	private Product p;
	public Producter(Product p){
		this.p = p;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<100;i++){
			if(0==(i%2)){
				try {
					p.setName("������");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else{
				try {
					p.setName("�Ұ׻�");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
