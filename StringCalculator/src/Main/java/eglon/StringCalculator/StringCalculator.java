package eglon.StringCalculator;

public class StringCalculator {

    public static int add(String input) {
        int sumOfNums = 0;
        if (input.isEmpty()) {
            return 0;
        } else if (input.contains((",")) || input.contains("\n")) {
            String swapToComma = input.replaceAll("\n", ",");
            String[] justNums = swapToComma.split(",");
            for (int i = 0; i < justNums.length; i++) {
                sumOfNums += Integer.parseInt(justNums[i]);
            }
            return Integer.parseInt(String.valueOf(sumOfNums));
        }//else if (input.contains(",")) {
         //   String[] removeComma = input.split(",");
         //   return stringToInt(removeComma[0]) + stringToInt(removeComma[1]);
        //} else if (input.contains("\n")) {
        //    String[] newline = input.split("\n");
        //    return stringToInt(newline[0]) + stringToInt(newline[1]);
        //}
        //
        else {
            return stringToInt(input);
        }
    }

    public static int stringToInt(String input) {
        return Integer.parseInt(input);
    }
}