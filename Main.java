package TSP;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    // int population = 10;
    // int generations = 10;
    // int prob_crossover = 90;
    // int prob_mutation = 1;
    // boolean isOX = true;
    // Input.getGenes();
    GeneticAlgorithm ga = new GeneticAlgorithm(1, 1, 1, 1);
    ga.initialization();

    // GeneticAlgorithm ga = new GeneticAlgorithm(file, population, generations, prob_crossover, prob_mutation, isOX);
    // ga.initialization();
  }
}
