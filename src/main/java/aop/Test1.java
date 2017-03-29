package aop;

public class Test1 {
	public static void main(String[] args){
		for (int i = 0;i < 10; i++){
			Thread a = new Thread(){
				public void run(){
					System.out.println("111");
				}
			};
			a.start();
		}
	}
	public static void a(){
		
	}
}
