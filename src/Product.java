
public class Product {
	public String name;
	/*
	 * flag�źŵ�  ���flag ------T ��ʾ���������������ߵȴ�
	 * 			  ���flag -------F ��ʾ�����ߵȴ�����������
	 * 
	 */
	private boolean flag=true;
	public Product(){
		
	}
	public  synchronized void setName(String name) throws InterruptedException {
		if(!flag){
			//�����ߵȴ�
			this.wait();
		}
		this.name = name;
		Thread.sleep(200);
		System.out.println("������"+name);
		//֪ͨ������
		this.notifyAll();
		//�����ߵȴ�
		flag = false;
	}
	
	public  synchronized String getName() throws InterruptedException {
		if(flag){  
			//�����ߵȴ�
			this.wait();
		}
		Thread.sleep(100);
		//֪ͨ������
		System.out.println("������"+name);
		this.notifyAll();
		//�����ߵȴ�
		flag = true;
		
		return name;
	}
	

	

}
