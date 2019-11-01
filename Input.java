package TSP;

import java.io.*;
import java.util.Scanner;

/* Class that reads the tsp files, extract the coordinates and saves them into an array
 *
 */

public class Input {

  static Gene [] cities;  

  public static Gene[] getGenes() {
    Scanner in = new Scanner(System.in);
    int numOfCities = Integer.parseInt(in.nextLine());
    cities = new Gene[numOfCities];
    int k = 0;
    double x, y;
    String[] readLine;
    while(in.hasNext()){
      readLine = in.nextLine().trim().split(" ");
      x = Double.parseDouble(readLine[1].trim());
      y = Double.parseDouble(readLine[2].trim());
      Gene gene = new Gene(readLine[0], x, y);
      cities[k++] = gene;
      System.out.println("From input, gene: " +  gene);
    }
    in.close();
    System.out.println("---------------");
    return cities;
  }
}