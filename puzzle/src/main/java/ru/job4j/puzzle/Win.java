package ru.job4j.puzzle;

public class Win {
    /*Метод проверки выгрошной ситуации*/
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            //Проверяем есть ли ячейки в ряд
            if(board[i][i] == 1 ){
                //Если есть и по колонками и рядом, то вернуть выйгрыш
                if(Win.checkColumn(board,i) || Win.checkRow(board,i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    /*Метод проверки что фишки выстроились в ряд по вертикали*/
    public static boolean checkColumn(int[][] board, int column) {
        //переменная по умолчанию
        boolean rsl = true;
        //Перебираем индекцы строки ячейки в массиве, ищем 0,т.е. ряд
        for (int row = 0; row < board.length; row++) {
            //Если нашлись
            if (board[row][column] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    /*Метод проверки что фишки выстроились в ряд по горизонтали*/
    public static boolean checkRow(int[][] board, int row) {
        boolean rsl = true;
        for (int column = 0; column < board.length; column++) {
            if (board[row][column] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;

    }
}
