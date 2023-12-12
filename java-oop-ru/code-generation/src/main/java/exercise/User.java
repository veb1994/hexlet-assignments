package exercise;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

// BEGIN
@Value
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
