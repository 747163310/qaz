
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
//			System.out.println("������");	
//			}
//			else
//			{
//				System.out.println("���Ӳ���");	
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
//                        System.out.println("ѡ��" + Thread.currentThread().getName() + "���ڵȴ����з�������");
//                        cdOrder.await();
//                        System.out.println("ѡ��" + Thread.currentThread().getName() + "�ѽ��ܲ��п���");
//                        Thread.sleep((long) (Math.random() * 10000));
//                        System.out.println("ѡ��" + Thread.currentThread().getName() + "�����յ�");
//                        cdAnswer.countDown();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            };
//            service.execute(runnable);
//        }
//        try {
////        	long startTime = System.currentTimeMillis();// ��ȡ��ǰʱ��
//        	Thread.sleep((long) (Math.random() * 10000));
////            long endTime = System.currentTimeMillis();// ��ȡ��ǰʱ��
////            System.out.println("˯��ʱ�䣺"+(endTime-startTime)+"����");
//            System.out.println("����"+Thread.currentThread().getName()+"������������");
//            cdOrder.countDown();
//            System.out.println("����"+Thread.currentThread().getName()+"�ѷ��Ϳ�����ڵȴ�����ѡ�ֵ����յ�");
//            cdAnswer.await();
//            System.out.println("����ѡ�ֶ������յ�");
//            System.out.println("����"+Thread.currentThread().getName()+"���ܳɼ�����");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        service.shutdown();
   }
}