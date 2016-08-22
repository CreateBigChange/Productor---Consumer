
public class Product {
	public String name;
	/*
	 * flag信号灯  如果flag ------T 表示生产者生产消费者等待
	 * 			  如果flag -------F 表示生产者等待消费者消费
	 * 
	 */
	private boolean flag=true;
	public Product(){
		
	}
	public  synchronized void setName(String name) throws InterruptedException {
		if(!flag){
			//生产者等待
			this.wait();
		}
		this.name = name;
		Thread.sleep(200);
		System.out.println("生产了"+name);
		//通知消费者
		this.notifyAll();
		//生产者等待
		flag = false;
	}
	
	public  synchronized String getName() throws InterruptedException {
		if(flag){  
			//消费者等待
			this.wait();
		}
		Thread.sleep(100);
		//通知生产者
		System.out.println("消费了"+name);
		this.notifyAll();
		//消费者等待
		flag = true;
		
		return name;
	}
	

	

}
