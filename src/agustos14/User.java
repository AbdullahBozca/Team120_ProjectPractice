package agustos14;

import java.time.LocalDateTime;

public class User {
    // 1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)
    String name;
    LocalDateTime registerDate;

    public User() { //p'siz cons. oluşturuldu
    }

    public User(String name, LocalDateTime registerDate) { // p'li cons. oluşturuldu
        this.name = name;
        this.registerDate = registerDate;
    }
}
