package Core;
import Google.GoogleManager;


public class GoogleRegisterAdapter implements GoogleService {

    @Override
    public void registerToSystem(String message) {
        GoogleManager googleManager=new GoogleManager();
        googleManager.register(message);
    }
}
