package enorm.design;

/**
 * Main class to run the EnormProjectionGenerator
 *
 * Simply calls the static methods that use hardcoded XMI input path
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting ENORM Projection Generator...");
        System.out.println();

        try {
            // Generate structure diagram (PlantUML class diagram)
            System.out.println("1. Generating structure diagram...");
            EnormProjectionGenerator.generateStructureDiagram();
            System.out.println();

            // Generate behavior diagrams (process flows)
            System.out.println("2. Generating behavior diagrams...");
            EnormProjectionGenerator.generateBehaviorDiagrams();
            System.out.println();

            // Generate textual projection (documentation)
            System.out.println("3. Generating textual projection...");
            EnormProjectionGenerator.generateTextualProjection();
            System.out.println();

            System.out.println("All projections generated successfully!");

        } catch (Exception e) {
            System.err.println("Error during projection generation:");
            e.printStackTrace();
        }
    }
}

