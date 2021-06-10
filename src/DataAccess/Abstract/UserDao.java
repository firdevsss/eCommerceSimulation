package DataAccess.Abstract;
import Entities.Abstract.Concrete.User;

public interface UserDao {
    void register(User user);
    void login(User user);
    void confirm(User user);

}
