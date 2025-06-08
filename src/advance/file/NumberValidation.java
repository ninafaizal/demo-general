package advance.file;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.function.Predicate; // ✅ Missing import added here

public class NumberValidation {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String income = promptUntilValid(
                br,
                "Key in annual income: ",
                NumberValidation::isNumeric,
                "Invalid input. Please enter a valid number."
            );

            double incomeValue = Double.parseDouble(income);
            System.out.println("Validated income: " + incomeValue);

        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }
    }


    private static String promptUntilValid(BufferedReader br, String prompt,
                                           Predicate<String> validator, String errorMessage) throws IOException {
        String input;
        while (true) {
            System.out.print(prompt);
            input = br.readLine();
            if (validator.test(input)) {
                return input;
            }
            System.out.println(errorMessage);
        }
    }

    private static boolean isNumeric(String input) {
        return input != null && input.matches("[-+]?\\d+(\\.\\d+)?");
    }
}
