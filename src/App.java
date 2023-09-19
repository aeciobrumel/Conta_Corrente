import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Client> clientsList = new ArrayList<Client>();

        Client firstClient = new Client("Common User", "12312312300", "12312312300", LocalDate.of(2000, 10, 30));
        clientsList.add(firstClient);

        System.out.println(clientsList.get(0));
    }
}
