package anonymusthread;

public class AnonymusClassThreads {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Runnable runnable=new Runnable()
					{
					@Override
					public void run()
					{
						System.out.println("running thread"+(100+200));
					}
					};
					Thread thread =new Thread(runnable);
					thread.start();
				//anonymous class for thread class 	
					Thread subThread = new Thread()
							{
								@Override
								public void run()
								{
									System.out.println("sub"+ (4567-90));
								}
							};
							subThread.start();
				//without ref variable
							new Thread()
							{
								@Override
								public void run()
								{
									System.out.println("mult"+ (4*90));
								}	
							}.start();
							
		}

	}

