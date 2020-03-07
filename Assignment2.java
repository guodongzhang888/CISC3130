/*My name is Guo Dong Zhang. The program below is assignment 2.
 * This program will complete the following:
 * 1)Read in the number of files into an ConcurrentLinkedList to which
 *   it serves the functions of a queue and a LinkedList.
 *   1.1)Reading from the file is only user interactive due 
 *       to the uncertainty of how the user wants to manipulate data. (limitation)
 * 2)Merge the two arrays.
 *   2.1)Since I don't know which playlist the users want to merge,
 *       this section will also be user interactive.(limitation)
 *   2.2)Since all the files that are read ito the ConcurrentLinkedList 
 *       are of the same name, I find the indices of the file names and 
 *       use them as counters. Then, I iterated through multiFile the same 
 *       number of times as the counter to match with the position of their
 *       respective data in multiFile.This works because i read in the file
 *       data and file name simultaneously, and therefore,helps me to
 *       retrieve data.(This problem will be repeated below)
 * 3)Track the most recent song listened.
 *   3.1)The stack collection will do the job of displaying the last song
 *       listened with its first-in-last-out function.
 */
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.io.*;
public class Assignment2{
  public static void main(String[]args)throws Exception{
    Scanner sc = new Scanner(System.in);
    
    //Part one of the assignment: read from multiple files.
    ConcurrentLinkedQueue<String> multiFiles = new ConcurrentLinkedQueue<String>();
    LinkedList<String> multiFileNames = new LinkedList<String>();
    System.out.println("Please enter your file.Enter quit to end");
    String fileName = sc.next();
    while(fileName.equals("quit") == false){
      Scanner open = new Scanner(new File(fileName));//Opens file
      multiFileNames.add(fileName);//stores names of the file
      LinkedList<String>file = new LinkedList<String>();
      
      while(open.hasNext()){//reads in the data from the file into the LinkedList
        file.add(open.next());
      }
      
      multiFiles.addAll(file);//stores LinkedLists in multiFiles
      open.close();
      System.out.println("Please enter your file. Enter quit to end");
      fileName = sc.next();
    }
    /*Part 2 of the assignment: Merging
     * 1)Problem: I name all files with the name "file" in my multiFiles collection. 
     *   Solution: I used indexes from multiFileNames to track their respective files
     *             because the fileNames and files have the same indices.
     * 2) Prompts the user to merge if the user wishes.
     */
    int firstFileIndex = 0;
    int secondFileIndex = 0;
    System.out.println("Please select the first file you would like to merge");
    String sortFile1 =  sc.next();
    System.out.println("Please select the second file you would like to merge");
    String sortFile2 =  sc.next();
    
    while(sortFile1.equals("quit") == false){
      firstFileIndex = multiFileNames.indexOf(sortFile1);
      secondFileIndex = multiFileNames.indexOf(sortFile2);
      Iterator iterator = file.iterator();
      //Finds the file for the first requested file and covert into an array
      for(int i = 1; i <= firstFileIndex; i++){
        iterator.next();
        if(i == firstFileIndex)
        String [] file1 = multiFiles.file.toArray();
      }
      //Finds the file for the second requested file and covert into an array
      for(int x = 1; x <= secondFileIndex; x++){
        iterator.next();
        if( x == secondFileIndex)
          String [] file2 = multiFiles.file.toArray();
      }
      //merge both files
      int current1 = 0; // Current index in file1
      int current2 = 0; // Current index in file2
      int current3 = 0; // Current index in temp
      String [] temp = new String[file1.length + file2.length];
      while (current1 < file1.length && file2 < list2.length) {
        if (file1[current1].compareTo(file2[current2]) < 0)
          temp[current3++] = file1[current1++];
        else
          temp[current3++] = file2[current2++];
      }

      while (current1 < file1.length)
        temp[current3++] = file1[current1++];

      while (current2 < file2.length)
        temp[current3++] = file2[current2++];
      
      for(int y =0; y < temp.length; y++)
        System.out.println(temp[y]);
      
      System.out.println("Please select the first file you would like to merge");
      sortFile1 =  sc.next();
      System.out.println("Please select the second file you would like to merge");
      sortFile2 =  sc.next();
    }
    //part 3:tracking the most recently listened songs
    Stack<Strings> recent = new Stack<Strings>(temp);
    System.out.println("Please enter the songs you prefer to listen. "+
                       "Enter pop to see last song played. "+
                       "Enter end to stop the loop.");
    String song = sc.next();
    while(song.equals("check last") == false){
      recent.push(song);//push when the user enters the songs plays
      if(song.equals("pop"))
        System.out.print(recent.pop());// show last song played.
      
      System.out.println("Please enter the songs you prefer to listen. "+
                       "Enter pop to see last song played. "+
                       "Enter end to stop the loop.");
      String song = sc.next();
    }
    sc.close();
  }//end of main
}//end of assignment 2
  
  

  
    
      
