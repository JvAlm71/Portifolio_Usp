// Factory for creating set operations
class SetOperationFactory {
    public static SetOperation getOperation(String operationType) {
        switch (operationType) {
            case "union":
                return new UnionOperation();
            case "intersection":
                return new IntersectionOperation();
            case "difference":
                return new DifferenceOperation();
            default:
                throw new IllegalArgumentException("Unknown operation type: " + operationType);
        }
    }
}