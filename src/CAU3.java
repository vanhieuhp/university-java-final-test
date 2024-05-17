import java.text.SimpleDateFormat;
import java.util.Date;

public class CAU3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Date currentDate = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String formattedDate = sdf.format(currentDate);
                System.out.println("Thread1 : " + formattedDate);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread thread2 = new Thread(() -> {
            int randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Thread2: Số ngẫu nhiên: " + randomNumber);
        });

        thread1.start();
        thread2.start();

    }
}
