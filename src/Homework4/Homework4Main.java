package Homework4;
import java.util.Scanner;

public class Homework4Main {
    static int row;
    static int col;
    static String[][] gameBoardArray = new String[6][6];
    static byte boundary=6;
    static String donkey = "D";
    static String king = "K";
    static String machinegun = "M";
    static String queen = "Q";
    static String dwarf = "dW";


    static boolean gameIsStillRunning = true; //indicates if a tile on the game board is free
    static int otherGamePiecesMovementCounter = 0;



    public static void main(String[] args) {
        while (gameIsStillRunning) {
            printGameBoard();
            chooseFigureToMove();
        }
    }

    //prints out the rough boundaries of the game board
    public static void printGameBoard (){
        int counter =0;
        for (counter=0; row<6; row++){
            for (counter=0; col<6; col++){
                System.out.println("==========================");
                System.out.println("+" + "   " + "+" + "   " + "+" + "   " + "+" + "   " + "+" + "   " + "+" + "   " + "+");
            }
        }
    }

    //choice of game piece to operate on every turn
    public static void chooseFigureToMove () {
        System.out.println("Choose a letter corresponding to the game piece you want to move: ");
        Scanner chooseGamePieceLetter = new Scanner(System.in);
        String chooseLetter = chooseGamePieceLetter.nextLine();
        switch (chooseLetter) {
            case "K":
                kingMovementBehaviour();
                break;
            case "Q":
                queenMovementBehaviour();
                break;
            case "M":
                machinegunMovementBehaviour();
                break;
            case "dW":
                dwarfMovementBehaviour();
                break;
            case "D":
                donkeyMovementBehaviour();
                break;
            default:
                System.out.println("Invalid letter chosen, please try again! ");
                break;
        }
    }

    //dwarf game piece movement
    public static void dwarfMovementBehaviour() {
        Scanner enterRowOrCol = new Scanner(System.in);
        System.out.println("Enter row number: ");
        row = enterRowOrCol.nextInt();
        System.out.println("Enter col number: ");
        col = enterRowOrCol.nextInt();
        if (row < boundary && col < boundary) {
            dwarf = gameBoardArray[row][col];
            otherGamePiecesMovementCounter++;
        } else if (row > boundary | col > boundary) {
            System.out.println("Position is out of game board bounds, try again! ");
        }
    }

    //donkey game piece movement
    public static void donkeyMovementBehaviour() {
        if (otherGamePiecesMovementCounter%3==0){
            Scanner enterRowOrCol = new Scanner(System.in);
            System.out.println("Enter row number: ");
            row = enterRowOrCol.nextInt();
            System.out.println("Enter col number: ");
            col = enterRowOrCol.nextInt();
            if (row < boundary && col < boundary ){
                donkey = gameBoardArray[row][col];
                otherGamePiecesMovementCounter++;
            } else if (row > boundary | col > boundary){
                System.out.println("Position is out of game board bounds, try again!");
            }
        } else {
            System.out.println("It's not the donkey's turn yet! ");
        }

    }

    //king game piece movement
    public static void kingMovementBehaviour (){
        Scanner enterRowOrCol = new Scanner(System.in);
        System.out.println("Enter row number: ");
        row = enterRowOrCol.nextInt();
        System.out.println("Enter col number: ");
        col = enterRowOrCol.nextInt();
        if (row < boundary && col < boundary) {
            king = gameBoardArray[row][col];
            otherGamePiecesMovementCounter++;
        } else if (row > boundary | col > boundary) {
            System.out.println("Position is out of game board bounds, try again! ");
        }
    }

    //queen game piece movement
    public static void queenMovementBehaviour (){
        Scanner enterRowOrCol = new Scanner(System.in);
        System.out.println("Enter row number: ");
        row = enterRowOrCol.nextInt();
        System.out.println("Enter col number: ");
        col = enterRowOrCol.nextInt();
        if (row < boundary && col < boundary) {
            queen = gameBoardArray[row][col];
            otherGamePiecesMovementCounter++;
        } else if (row > boundary | col > boundary) {
            System.out.println("Position is out of game board bounds, try again! ");
        }
    }

    //machinegun game piece movement
    public static void machinegunMovementBehaviour (){
        Scanner enterRowOrCol = new Scanner(System.in);
        System.out.println("Enter row number: ");
        row = enterRowOrCol.nextInt();
        System.out.println("Enter col number: ");
        col = enterRowOrCol.nextInt();
        if (row < boundary && col < boundary) {
            machinegun = gameBoardArray[row][col];
            otherGamePiecesMovementCounter++;
        } else if (row > boundary | col > boundary) {
            System.out.println("Position is out of game board bounds, try again! ");
        }
    }





}









