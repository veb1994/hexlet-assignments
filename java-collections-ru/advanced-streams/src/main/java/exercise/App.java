package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String data) {
        List<String> dataList = List.of(data.split("\n"));
        List<String> filteredList = dataList.stream()
                .filter(str -> str.startsWith("environment="))
                .map(str -> str.replaceAll("environment=", ""))
                .map(str -> str.replaceAll("\"", ""))
                .collect(Collectors.toList());
        List<String> variablesList = new ArrayList<>();
        for (String str: filteredList) {
            List<String> variables = List.of(str.split(","));
            List<String> filteredVariables = variables.stream()
                    .filter(x -> x.startsWith("X_FORWARDED_"))
                    .map(x -> x.replaceAll("X_FORWARDED_", ""))
                    .collect(Collectors.toList());
            for (String variable: filteredVariables) {
                variablesList.add(variable);
            }
        }
        String result = variablesList.get(0);
        for (var i = 1; i < variablesList.size(); i++) {
            result += "," + variablesList.get(i);
        }
        return result;
    }
}
//END
