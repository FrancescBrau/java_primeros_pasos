import com.javalessons.model.person;
import com.javalessons.services.IPerson;
import com.javalessons.services.PersonaService;

public class App {
    public static void main(String[] args) throws Exception {
        person pers1 = new person(1, "Pepe");
        IPerson persService = new PersonaService();
        persService.register(pers1);
    }
}
