package exercise;

import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.writeValue(new File(path), this);
        return objectMapper.writeValueAsString(this);
    }

    public Car unserialize(String jsonRepresentation) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(jsonRepresentation, Car.class);
        return car;
    }
    // END
}
