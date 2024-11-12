public class MoreRecursionHelper {

    /** Converts a decimal number to binary */
    public int toBinary(int toConvert) {
        // Base case: if the number is 0, return 0
        if (toConvert == 0) {
            return 0;
        } else {
            // Recursive case: find the binary of the number, append the current bit
            return (toConvert % 2) + 10 * toBinary(toConvert / 2);
        }
    }

    /** Computes the total number of blocks in a pyramid with 'rows' rows */
    public int pyramidTotal(int rows) {
        // Base case: when rows is 0, the pyramid has 0 blocks
        if (rows == 0) {
            return 0;
        } else {
            // Recursive case: add the current row's blocks (which is 'rows') to the total blocks of smaller pyramids
            return rows + pyramidTotal(rows - 1);
        }
    }

    /** Generates and prints all combinations of characters from the input string */
    public void combinations(String str, int index, String currStr) {
        // Base case: when we've processed all characters, print the current combination
        if (index == str.length()) {
            System.out.println(currStr); // print the current combination
            return;
        }

        // Recursive case 1: include the character at the current index in the combination
        combinations(str, index + 1, currStr + str.charAt(index));

        // Recursive case 2: exclude the character at the current index from the combination
        combinations(str, index + 1, currStr);
    }
}
