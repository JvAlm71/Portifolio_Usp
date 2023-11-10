public class Main {
    public static void main(String[] args) {
        Vector3DOperations operations = new ConcreteVector3DOperations();
        Vector3D v1 = new Vector3D(1, 2, 3, operations);
        Vector3D v2 = new Vector3D(4, 5, 6, operations);

        Vector3D additionResult = v1.add(v2);
        float scalarProductResult = v1.scalarProduct(v2);
        Vector3D crossProductResult = v1.crossProduct(v2);

        System.out.println("Addition of v1 and v2: " + additionResult);
        System.out.println("Scalar product of v1 and v2: " + scalarProductResult);
        System.out.println("Cross product of v1 and v2: " + crossProductResult);
    }
}