package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        List<String> result = new ArrayList<>();
        List<Home> sortedApartments = new ArrayList<>();
        if (apartments.isEmpty()) {
            return result;
        }

        sortedApartments.add(apartments.get(0));
        for (Home apartment : apartments) {
            if (!sortedApartments.contains(apartment)) {
                boolean isAdded = false;
                for (int i = 0; i < sortedApartments.size(); i++) {

                    if (apartment.getArea() < sortedApartments.get(i).getArea()) {
                        sortedApartments.add(i, apartment);
                        isAdded = true;
                        break;
                    }
                }
                if (!isAdded) {
                    sortedApartments.add(apartment);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            result.add(sortedApartments.get(i).toString());
        }

        return result;
    }
}
// END
