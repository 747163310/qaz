
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class testLatch {
    public static void main(String[] args) {
    	
    	
    	Map<Integer,String> map =new HashMap<>();
    	map.put(1, "test");
    	String a =map.remove(1);
    	System.out.println("....."+a);
//    	Socket socket;
//		try {
//			socket = new Socket("172.16.97.142", 17661);
//			if (socket.isConnected() && !socket.isClosed()) {
//			System.out.println("连接上");	
//			}
//			else
//			{
//				System.out.println("连接不上");	
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//        ExecutorService service = Executors.newCachedThreadPool();
//        final CountDownLatch cdOrder = new CountDownLatch(1);
//        final CountDownLatch cdAnswer = new CountDownLatch(4);
//        for (int i = 0; i < 4; i++) {
//            Runnable runnable = new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        System.out.println("选手" + Thread.currentThread().getName() + "正在等待裁判发布口令");
//                        cdOrder.await();
//                        System.out.println("选手" + Thread.currentThread().getName() + "已接受裁判口令");
//                        Thread.sleep((long) (Math.random() * 10000));
//                        System.out.println("选手" + Thread.currentThread().getName() + "到达终点");
//                        cdAnswer.countDown();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            };
//            service.execute(runnable);
//        }
//        try {
////        	long startTime = System.currentTimeMillis();// 获取当前时间
//        	Thread.sleep((long) (Math.random() * 10000));
////            long endTime = System.currentTimeMillis();// 获取当前时间
////            System.out.println("睡眠时间："+(endTime-startTime)+"毫秒");
//            System.out.println("裁判"+Thread.currentThread().getName()+"即将发布口令");
//            cdOrder.countDown();
//            System.out.println("裁判"+Thread.currentThread().getName()+"已发送口令，正在等待所有选手到达终点");
//            cdAnswer.await();
//            System.out.println("所有选手都到达终点");
//            System.out.println("裁判"+Thread.currentThread().getName()+"汇总成绩排名");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        service.shutdown();
   }
}