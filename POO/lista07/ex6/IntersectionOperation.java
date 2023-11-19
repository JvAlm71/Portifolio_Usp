import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Concrete Implementor for Intersection operation
class IntersectionOperation implements SetOperation {
    public Set<Integer> execute(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}