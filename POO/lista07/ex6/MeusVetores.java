import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Abstraction
class MeusVetores {
    private Set<Integer> set1;
    private Set<Integer> set2;
    private SetOperation operation;

    public MeusVetores(int[] array1, int[] array2) {
        this.set1 = new HashSet<>();
        for (int i : array1) {
            this.set1.add(i);
        }
        this.set2 = new HashSet<>();
        for (int i : array2) {
            this.set2.add(i);
        }
    }

    public void setOperation(SetOperation operation) {
        this.operation = operation;
    }

    public void executeOperation() {
        Set<Integer> result = operation.execute(set1, set2);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Result: " + result);
    }
}