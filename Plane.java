package plane;

import java.io.*;

public class Plane {
    
    public static void printRow(char[][] seats, int row, int col) {
        //prints seat array
        System.out.print("\n");
	
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(seats[r][c] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
	
        System.out.println();
    }
    
    public static void seats(char seats[][], int rows, int cols) {
        //fill array with char
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                seats[i][j] = '*';
            } 
        }
        printRow(seats, rows, cols);
    }
    
    public static void reserve(char seats[][], int row, int col) throws IOException {
        //updates array with 'X'
        int rows = 0;
        int cols = 0;
        String repeats;
        
        boolean check = true; //condition to print or not/continue loop
                
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        do { 
        System.out.println("ENTER TICKET TYPE:\n"
                + "[1] First Class\n"
                + "[2] Business Class\n"
                + "[3] Economy Class\n");
            System.out.print("CHOICE: ");
        short tix = Short.parseShort(br.readLine());
        
        switch (tix) {
            case 1:
                System.out.print("Enter Row [1-3]: ");
                rows = Integer.parseInt(br.readLine());
                
                if (rows > 3 || rows < 1) {
                    System.out.println(">>>First Class: Rows 1-3 only!<<<");
                    check = false;
                }
                else {
                    System.out.print("Enter Column[1-6]: ");
                    cols = Integer.parseInt(br.readLine());
                    if (cols > 6 || cols < 1) {
                        System.out.println(">>>All Classes: Columns 1-6 only!<<<");
                        check = false;
                    }
                }
                
                for (int i = 0; i < row; i++) {
                    for (int k = 0; k < col; k++) {
                        if (i == rows - 1 && k == cols - 1) {//adjusts user input to match array index
                            if (seats[i][k] == 'X') {//checks char of the given location
                                 System.out.print(">>>>Seat Taken. Please choose another seat number!<<<<");
                            }
                            else {
                                seats[i][k] = 'X';
                            }     
                        }
                    }
                }
                
                break;
            case 2:
                System.out.print("Enter Row [4-8]: ");
                rows = Integer.parseInt(br.readLine());
                if (rows > 8 || rows < 4) {
                    System.out.println(">>>Business Class: Rows 4-8 only!<<<");
                    check = false;
                }
                else {
                    System.out.print("Enter Column[1-6]: ");
                    cols = Integer.parseInt(br.readLine());
                    if (cols > 6 || cols < 1) {
                        System.out.print(">>>All Classes: Columns 1-6 only!<<<");
                        check = false;
                    }
                }
                 
                 for (int i = 0; i < row; i++) {
                    for (int k = 0; k < col; k++) {
                        if (i == rows - 1 && k == cols - 1) {//adjusts user input to match array index
                            if (seats[i][k] == 'X') {//checks char of the given location
                                 System.out.print(">>>>Seat Taken. Please choose another seat number!<<<<");
                            }
                            else {
                                seats[i][k] = 'X';
                            }     
                        }
                    }
                }

                break;
            case 3:
                System.out.print("Enter Row [9-13]: ");
                rows = Integer.parseInt(br.readLine());
               if (rows > 13 || rows < 9) {
                    System.out.println(">>>Economic Class: Rows 9-13 only!<<<");
                    check = false;
                }
                else {
                    System.out.print("Enter Column [1-6]: ");
                    cols = Integer.parseInt(br.readLine());
                    if (cols > 6 || cols < 1) {
                        System.out.println(">>>All Classes: Columns 1-6 only!<<<");
                        check = false;
                    }
                }
                 
                 for (int i = 0; i < row; i++) {
                    for (int k = 0; k < col; k++) {
                        if (i == rows - 1 && k == cols - 1) {//adjusts user input to match array index
                            if (seats[i][k] == 'X') {//checks char of the given location
                                 System.out.print(">>>>Seat Taken. Please choose another seat number!<<<<");
                            }
                            else {
                                seats[i][k] = 'X';
                            }     
                        }
                    }
                }
                
                break;
        }
            if (check == true) {
                printRow(seats, row, col);//prints the 'X' array
            }
            System.out.println("\n");
            System.out.print("Do you want to try again? [Y/N]: ");
            repeats = br.readLine();
        }
        while (repeats.equalsIgnoreCase("Y") || check == true); //conditional for try-again loop
    }
    
    public static void main(String[] args) throws IOException {
        //main method
        int row = 13;
        int col = 6;
        char seats [][] = new char[row][col];
        
        //variables to use for the following methods' paramaeters:
        
        seats(seats, row, col);
        //array is populated first, and only once
        reserve(seats, row, col);
        /*'reserve' method references the array populated by
         *the 'seats' method and replaces the user 'location' with 
         X**/
    }
    
}
