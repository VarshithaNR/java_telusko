public class TwoDtelephone {
    public static void main(String[] args) {
        
        char[][] phonePad = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

        for (char[] row : phonePad) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
