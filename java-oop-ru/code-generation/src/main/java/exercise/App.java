package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws IOException {
        Files.delete(path);
        Files.createFile(path);
        Files.write(path, car.serialize().getBytes());
    }

    public static Car extract(Path path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = Files.readString(path);
        Car car = objectMapper.readValue(json, Car.class);
        return car;
    }
}
// END
