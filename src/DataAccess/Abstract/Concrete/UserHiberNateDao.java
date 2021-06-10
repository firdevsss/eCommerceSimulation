package DataAccess.Abstract.Concrete;

import DataAccess.Abstract.UserDao;
import Entities.Abstract.Concrete.User;

public class UserHiberNateDao implements UserDao {
    @Override
    public void register(User user) {
        System.out.println(user.getFirstName() +" "+ user.getLastName() + " İsimli Kullanıcı HibertNate İle Kayıt Oldu.");
    }

    @Override
    public void login(User user) {
        System.out.println(user.getFirstName()+ user.getLastName()+ " İsimli Kullanıcı Giriş Yaptı.");
    }

    @Override
    public void confirm(User user) {
        System.out.println(user.getFirstName()+ user.getLastName()+ " İsimli Kullanıcı Onaylandı.");
    }
}
