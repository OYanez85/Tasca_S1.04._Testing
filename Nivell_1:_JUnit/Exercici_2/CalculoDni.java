public class CalculoDni {
    private static final char[] dniLetters = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
        'C', 'K', 'E'
    };

    public static String calcularLetraDni(String dniNumber) {
        // Validate the input
        if (dniNumber == null || !dniNumber.matches("\\d{8}")) {
            throw new IllegalArgumentException("Invalid DNI number. Must be 8 digits.");
        }

        int number = Integer.parseInt(dniNumber); // Parse the DNI number

        // Correctly calculate the letter using modulo 23
        char letter = dniLetters[number % 23];
        return dniNumber + letter; // Return the complete DNI with letter
    }
}
