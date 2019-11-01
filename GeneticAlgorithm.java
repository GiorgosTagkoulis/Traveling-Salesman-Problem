package TSP;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import static TSP.Crossover.*;

public class GeneticAlgorithm {

  private int population;
  private int generations;
  private int prob_crossover;
  private int prob_mutation;
  private boolean isOX;

  public GeneticAlgorithm(int population, int generations, int prob_crossover, int prob_mutation) {
    this.population = population;
    this.generations = generations;
    this.prob_crossover = prob_crossover;
    this.prob_mutation = prob_mutation;
  }

  /**
   * Initializes generation 0 and runs until generation limit
   * @throws IOException
   */
  public void initialization () throws IOException {

    //Fill the arraylist with all the genes
    geneNotInChild = new ArrayList<>(Arrays.asList(Input.getGenes()));
    for (int i = 0; i < geneNotInChild.size(); i++) {
      System.out.println("From GA, gene:" + geneNotInChild.get(i));
    }
    Population pop = new Population(population);
    NextGen ng = new NextGen(pop, prob_crossover, prob_mutation);
    Matrix.populate_matrix(Input.cities);

    //Create generation zero with chromosomes
    // pop.populate(Input.getGenes(), new Random());

    // for (int i = 0; i < generations; i++) {
    //   System.out.println(pop.toString());
    //   //Choose between OX and SCX crossover operator
    //   if (isOX)
    //     ng.createGenOX();
    //   else
    //     ng.createGenSCX();
    // }
  }
}
