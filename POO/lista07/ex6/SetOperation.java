import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Implementor interface
interface SetOperation {
    Set<Integer> execute(Set<Integer> set1, Set<Integer> set2);
}
