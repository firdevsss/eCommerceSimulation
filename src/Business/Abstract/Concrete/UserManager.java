package Business.Abstract.Concrete;

import Business.Abstract.UserService;
import Core.GoogleRegisterAdapter;
import Core.GoogleService;
import DataAccess.Abstract.Concrete.UserHiberNateDao;
import DataAccess.Abstract.UserDao;
import Entities.Abstract.Concrete.User;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class UserManager implements UserService {
    private UserDao userDao;
    private GoogleService googleService;

    public UserManager(UserHiberNateDao userHiberNateDao, GoogleRegisterAdapter googleRegisterAdapter) {
    }


    @Override
    public void register(User user) {
        if(user.getFirstName().length()>=2 && user.getLastName().length() >= 2 && user.getPassword().length()>= 6 ) {
            System.out.println("Kullanıcı Kayıt Oldu.");

        }else {
            System.out.println(user.getFirstName()+" "+ user.getLastName() + " Kayıt Başarısız");
        }


        final String EMAIL_PATTERN="^[A-Za-z0-9+_.-]+@(.+)$";
        final Pattern pattern=Pattern.compile(EMAIL_PATTERN);
        Matcher matcher=pattern.matcher(user.getEmail());

        if(!matcher.matches()) {
            System.out.println(user.getEmail() + " Girmiş olduğunuz Email Formata Uygun Değildir.");
        }





    }

    

    @Override
    public void login(User user) {

    }
}
