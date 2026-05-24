package ATMInterface;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class TransactionManager {

    // Save Transaction
    public void saveTransaction(String type, double amount) {

        try {

            FileWriter writer =
                    new FileWriter("transactions.txt", true);

            writer.write("\n========================\n");

            writer.write("Transaction Type : " + type + "\n");

            writer.write("Amount : ₹" + amount + "\n");

            writer.write("Time : "
                    + LocalDateTime.now()
                    + "\n");

            writer.write("========================\n");

            writer.close();
        }

        catch (IOException e) {

            System.out.println("Error Saving Transaction!");
        }
    }
}
