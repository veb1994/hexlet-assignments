package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        if (emails != null) {
            return (int) emails.stream()
                    .filter(email -> email.endsWith("gmail.com")
                            || email.endsWith("yandex.ru") || email.endsWith("hotmail.com"))
                    .count();
        } else {
            return 0;
        }
    }
}
// END
