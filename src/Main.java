import Business.Abstract.Concrete.UserManager;
import Business.Abstract.UserService;
import Core.GoogleRegisterAdapter;
import DataAccess.Abstract.Concrete.UserHiberNateDao;
import Entities.Abstract.Concrete.User;

public class Main {

    public static void main(String[] args) {

        User user1= new User(1,"Hamza","BAY","xxxxx@gmail.com","1111");
        User user2= new User(2,"Firdevs","İnal","xxx2@gmail.com","111");
        User user3= new User(3,"Mıncır","BYin","mncr@gmail.com","1123");


        UserService userService= new UserManager(new UserHiberNateDao(),new GoogleRegisterAdapter());
        userService.register(user1);
        userService.register(user2);
        userService.register(user3);

    }
}
