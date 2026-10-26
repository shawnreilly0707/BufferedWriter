import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("rentals.txt", true));

        writer.write("Flying Tesla");
        writer.newLine();
        writer.close();

        Car[] Cars = {
                new Car("Mustang GT"),
                new Car("Mustang EcoBoost")
        };

        BufferedWriter writer2 = new BufferedWriter(new FileWriter("cars.txt"));

        for (Car car : Cars) {
            writer2.write(car.name);
            writer2.newLine();
        }

        writer2.close();
    }

}
