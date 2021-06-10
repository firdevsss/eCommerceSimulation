package Business.Abstract;
import Entities.Abstract.Concrete.User;

public interface UserService {
    void register(User user);
    void login(User user);
}
