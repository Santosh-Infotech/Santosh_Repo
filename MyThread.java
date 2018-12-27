class MyThread extends Thread 
{


	}

		

	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}

		
		MyThread mt=new MyThread();
		mt.run();
		
	
	}

