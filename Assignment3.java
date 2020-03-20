/* My name is Guo Dong Zhang and this is Assignment 3.
 */
import java.util.Scanner;
import java.io.File;
public class Assignment3{
  public static void main( String[]args ){
    int cols = 3;  // number of columns 
    int rows = 9743; // number of rows 
    String[][] movieInfo = new String[rows][cols];
    try{
      Scanner sc = new Scanner(new File("movies.csv"));
      //The following nested for loops reads the csv file into 2D String array
      for(int i = 0; i < rows; i++){
          String [] line = sc.nextLine().split(",");
          for(int e = 0; e < cols; e++){
            movieInfo[i][e] = line[e];
            //System.out.println(movieInfo[i][e]);
          }//end of inner for loop
          
      }//end of outer for loop
      
      sc.close();
    }//end of try
    
    catch(Exception e){
      
      e.getMessage();
      
    }//end of catch
    
    //break the titles and year into two strings
    String[] moviesAndYear = new String[rows];
    for(int i = 0; i < rows; i++){
      moviesAndYear[i] = movieInfo[i][1];
    }
    int num = 0;
    String[]movie = new String[rows];
    String[]year = new String[rows];
    for(int i = 1; i < 5; i++){
      num = moviesAndYear[i].indexOf("(");
      if(num != -1){
        movie[i] = moviesAndYear[i].substring(0, num);
        year[i] = moviesAndYear[i].substring(num);
      }
    }
    //node class
    class MoviesNode{
      protected String title;
      protected MoviesNode left;
      protected MoviesNode right;
      
      public MoviesNode(String title){
        
        this.title = title;
        
      }
      
    }//end of class movies
    
   //Sort movieLists
   class MovieBST{
     private MoviesNode root;
     
     public MovieBST(String[] movies){
       
       for( int i = 1; i < movies.length; i++)
         insert(movies[i]);
       
       root = new MoviesNode(movies[1]);
     }
     
     public boolean search(String title){
       MoviesNode current = root;
       while(current != null){
         if(title.compareTo(current.title) < 0){
           
           current = current.left;
           
         }else if(title.compareTo(current.title) > 0){
           
           current = current.right;
           
         }else{
           
           return true;
         }//end of else
        }//end of while
       
       return false;
     }//end of Search method
     
     public boolean insert(String title){
       MoviesNode parent = null;
       MoviesNode current = root;
       
       while(current != null){
         if(title.compareTo(current.title) < 0){
           
           parent = current;
           current = current.left;
           
         }else if(title.compareTo(current.title) > 0){
           System.out.println(title);
           parent = current;
           current = current.right;
           
         }else
           return false;
         
         if(title.compareTo(current.title) < 0){
           parent.left = new MoviesNode(title);
         }
         else{
           parent.right = new MoviesNode(title);
         }
         
       }//end of while loop
       return true;
       
     }//end of insert
     
     public void getAll(MoviesNode mov){
       if(mov == null)
         return;
       
       getAll(mov.left);
       
       if(mov.left == null && mov.right == null)
         System.out.println(mov.title + " ");
       
       getAll(mov.right);
       
     }//end of getAll
         
       
   }//end of MovieBST
     
     MovieBST tree = new MovieBST(movie);
     System.out.println(tree.search("你好"));
     tree.getAll(new MoviesNode("The Great Raid"));
          
   
  }//end of main
}//end of program
    
