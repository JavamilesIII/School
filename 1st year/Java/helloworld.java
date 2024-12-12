public class helloworld {

    public static void main(String[] args) {
        int A[] = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};
        
        int Z[] = A.clone();
        
        int[] R = new int[A.length];

        // Umgekehrtes Kopieren
        for (int i = 0; i < A.length; i++) {
            R[i] = A[A.length - 1 - i];
        }
    }
}
