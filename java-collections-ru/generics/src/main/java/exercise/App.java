package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books,
                                                      Map<String, String> searchCriteria) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book: books) {
            int matchingCriteria = 0;
            int criteriaAmount = searchCriteria.size();
            for (Map.Entry<String, String> criterion: searchCriteria.entrySet()) {
                String key = criterion.getKey();
                String value = searchCriteria.get(key);
                if (book.containsKey(key) && book.get(key) == value) {
                    matchingCriteria += 1;
                }
            }
            if (matchingCriteria == criteriaAmount) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
