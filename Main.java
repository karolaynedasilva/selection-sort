public class Main {
    public static void main(String[] args) {
        SelectionSort algoritmo = new SelectionSort();

        int[] numeros = {64, 25, 12, 22, 11};

        System.out.println("Array original:");
        algoritmo.imprimirArray(numeros);

        algoritmo.sort(numeros);

        System.out.println("Array ordenado:");
        algoritmo.imprimirArray(numeros);
    }
}
