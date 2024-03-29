
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        
        int row = 0;
        int column = size / 2;
        square.placeValue(row, column, 1);
        
        for (int number = 2; number <= size * size; number++) {
            int currentRow = row;
            int currentColumn = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = size - 1;
            }
            
            if (column == size) {
                column = 0;
            }
            
            if (square.readValue(row, column) != 0) {
                row = currentRow + 1;
                column = currentColumn;
            }
            
            square.placeValue(row, column, number);
        }

        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }

}
