
public class Vector3D {
    float x, y, z;
    private Vector3DOperations operations;

    public Vector3D(float x, float y, float z, Vector3DOperations operations) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.operations = operations;
    }

    public Vector3D add(Vector3D other) {
        return operations.add(this, other);
    }

    public float scalarProduct(Vector3D other) {
        return operations.scalarProduct(this, other);
    }

    public Vector3D crossProduct(Vector3D other) {
        return operations.crossProduct(this, other);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}


