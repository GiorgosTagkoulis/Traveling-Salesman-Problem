package TSP;

import java.util.Random;

/**
 * Represents a city in the Traveling Salesman Problem.
 * Immutable.
 */
public class Gene {

    private String name;
    private double x, y;


    public Gene(){

    }
    /**
     * Constructs the Gene.
     * @param name  the name of the city
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public Gene(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName () {
        return name;
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    /**
     * Create a Gene with a random name and random location.
     * @param random    the Random object to be used for the generation
     * @return          a Randomly generated Gene
     */
    public static Gene getRandomCity (Random random) {
        String name = getRandomName(random);
        double x = random.nextDouble();
        double y = random.nextDouble();
        return new Gene(name, x, y);
    }

    /**
     * Helper method to generate a random name for the random Gene generator.
     * @param random    the Random object to be used for the generation
     * @return          random letters
     */
    private static String getRandomName (Random random) {

        // Create an array with random integers.
        int[] name = new int[random.nextInt(5)+3];
        for (int i = 0; i < name.length; i++) {
            name[i] = random.nextInt(26) + 65;
        }

        // Convert the integers in the array to chars.
        // Add each char to StringBuilder.
        StringBuilder sb = new StringBuilder();
        for (int i : name) {
            sb.append((char) i);
        }

        return new String(sb);
    }

    /**
     * Finds the Euclidean distance between two cities.
     * @param gene1     the first city
     * @param gene2     the second city
     * @return          the distance
     */
    public static double distance (Gene gene1, Gene gene2) {

        double x1 = gene1.getX();
        double y1 = gene1.getY();

        double x2 = gene2.getX();
        double y2 = gene2.getY();

        double xDiff = x2 - x1;
        double yDiff = y2 - y1;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gene gene = (Gene) o;

        if (x != gene.x) return false;
        if (y != gene.y) return false;
        return name.equals(gene.name);

    }

    @Override
    public int hashCode() {
        double result = name.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return (int) result;
    }

    @Override
    public String toString() {
        return name + " (" + x + ", " + y + ")";
    }
}