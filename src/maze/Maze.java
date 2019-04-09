package maze;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Jonathan Louis
 */

public class Maze {
    
    //method for creating an array to hold maze boundries
    public static String[][] buildMaze(int r, int c){
        
        String[][] Array = new String[r+1][2*c+1];
        
        for(int j=0;j<=r;j++){
            
            //creating mazes first row
            if(j == 0){
                
                for(int i=0;i<=c*2;i++){
                    
                    if(i%2 == 0){
                        Array[j][i] = (" ");
                    }   
                    
                    if(i%2 == 1){
                        Array[j][i] = ("_");
                    }
                }
            }
            
            //creating maze rows after first row
            if(j != 0){
                for(int i=0;i<=c*2;i++){
                
                    if(i%2 == 0){
                        Array[j][i] = ("|");
                    }
                
                    if(i%2 == 1){
                        Array[j][i] = ("_");
                    }
                }
            }

        }
                    
        Array[0][1] = " ";  // creating the opening to the maze
        Array[r][2*c -1] = " ";  // creating the exit to the maze
            
        return Array;
    }
    
    //displays maze
    public void printMaze(int r, int c, String[][] Array){
        
        for(int i=0;i<=r;i++){
            
            for(int j=0; j<=2*c;j++){
                
                System.out.print(Array[i][j]);
            }
            
            System.out.println();
        }
    }
    
    //method to check if maze has been solved
    public boolean mazeSolver(int r, int c, String[][] Array){
        
        boolean mazeSolved = false;
        int i = 1, k=0;
        int j = 1, l=0;
        String a = " ";
        
        //checks if the maze was solved
        while(!mazeSolved){
            
            //checks if moving right is open 
            if(Array[i][j].equals(a) && k == 0){
                i++;
                l=i;
                //System.out.println(i + " " + j);  (Remove // to see checks)
            }
            
            //checking if moving down is open
            else if(Array[i][j+1].equals(a) && j < 2*c-1){
                j=j+2;
                k=0;
                //System.out.println(i + " " + j);  (Remove // to see checks)
            }
            
            //checking prior spaces if reach blocked space
            else if(i>1){
                i=i-1;
                k=k+1;
            }
            
            //break if maze was not solved
            else{
                break;
            }
            
            if(i == r && j == 2*c-1){
                mazeSolved = true;
            }
        }

        return mazeSolved;
    }
    
    //removes random pieces of the maze to get to solution
    public String[][] mazeRemover(int i, int j, String[][] maze){
        
        Random rand = new Random();

        int x,y;
        boolean removed = false;
        
        //removes random piece
        while(!removed){
            //random location to remove a peice of the maze
            x = rand.nextInt(i)+1;
            y = rand.nextInt(j*2);
            
            //checking to remove peice, if piece is already removed will get new location to remove
            if(y != 0){
                if(x == i){
                    if(y % 2 == 0){
                        maze[x][y] = " ";
                        removed = true;
                    }
                }
            }
            
            if(y !=0){
                if(x != i){
                    maze[x][y] = " ";
                    removed = true;
                }
            }
            
        }
        return maze;
    }
            
            
    public static void main(String[] args) {
        
        
        Scanner scnr = new Scanner(System.in);
        
        int rows, columns,iterations=0;
        boolean solved = false;
        
        //create an array to hold maze
        String mazeArray[][];
        
        //get number of rows for the maze
        System.out.println("Enter number of rows for maze: ");
        rows = scnr.nextInt();
        
        //get number of columns for the maze
        System.out.println("Enter number of columns for maze: ");
        columns = scnr.nextInt();
        
        //initialize maze printer
        Maze printer = new Maze();
        
        //build initial maze
        mazeArray = printer.buildMaze(rows,columns);
        
        //print initial maze
        printer.printMaze(rows, rows, mazeArray);
        
        System.out.println();
        
        //continues to remove pieces from the maze until solved
        while(!solved){
            
            //removes piece
            mazeArray = printer.mazeRemover(rows,columns,mazeArray);
        
            //prints maze
            printer.printMaze(rows,columns,mazeArray);
            
            //checks if solved
            solved = printer.mazeSolver(rows, columns, mazeArray);
            
            //counts iterations to find solution
            iterations++;
            
            //fail safe, if iterations becomes larger than total maze pieces without finding solve path, exits program
            if(iterations > rows*columns*10){
                break;
            }
        }
        
        //outputs maze info
        System.out.println("Maze of " + rows + " rows and " + columns + " columns took " + iterations + " iterations to solve.");    
  
    }
}