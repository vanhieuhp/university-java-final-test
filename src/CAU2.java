import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.time.Instant;

public class CAU2 {
    public static void main(String[] args) {
        try {
//            CAU 2. b
            FileWriter fileWriter = new FileWriter("data.txt");
            Random random = new Random();

            for (int i = 0; i < 1000000; i++) {
                int randomNumber = random.nextInt();
                fileWriter.write(Integer.toString(randomNumber));
                fileWriter.write(System.lineSeparator());
            }

            fileWriter.close();
            System.out.println("File đã tạo thành công.");

//            CAU 2 a
            File sourceFile = new File("data.txt");
            File destinationFile = new File("new_data.txt");

            Instant start = Instant.now();
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            Instant end = Instant.now();

            Duration duration = Duration.between(start, end);
            System.out.println("File đã sao chép thành công.");
            System.out.println("Việc sao chép file thành công với thời gian " + (duration.toMillis() / 1000.0) + " giây.");
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi tạo và sao chép file");
            e.printStackTrace();
        }
    }
}