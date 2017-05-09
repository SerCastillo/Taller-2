public class Main {

public static void main(String[] args) {
    int[] A = {3,7,8,25};
    int i, j;
    int n = 4;
    int Maximo = Math.abs(A[0] - A[2]);
    for (i = 0; i < n; i++) {
        for (j = 0; j < i; j++) {
            if (i != j) {
                int distancia = Math.abs(A[i] - A[j]);
                if (distancia > Maximo) {
                    Maximo = distancia;
                }
            }
        }
    }
    System.out.println(Maximo);
}

}
