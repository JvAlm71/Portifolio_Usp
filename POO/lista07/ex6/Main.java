// Client code with Factory usage
public class Main {
    public static void main(String[] args) {
        MeusVetores myVectors = new MeusVetores(new int[] { 1, 2, 3, 4 }, new int[] { 3, 4, 5, 6 });

        // Union created through the Factory
        myVectors.setOperation(SetOperationFactory.getOperation("union"));
        System.out.println("Union:");
        myVectors.executeOperation();

        // Intersection created through the Factory
        myVectors.setOperation(SetOperationFactory.getOperation("intersection"));
        System.out.println("\nIntersection:");
        myVectors.executeOperation();

        // Difference created through the Factory
        myVectors.setOperation(SetOperationFactory.getOperation("difference"));
        System.out.println("\nDifference:");
        myVectors.executeOperation();
    }
}