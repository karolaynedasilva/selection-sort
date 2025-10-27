class SelectionSort {

        // tenho que fazer uma lista - ok
        // tenho que ter 2 fors - ok
        // um percorrer o indice do 0 até o penultimo indice -ok 
        // outro procurando o menor numero = indice +1 ok 
        // tenho que guardar o indice ok 
        // depois ir substituindo ok

        void sort(int array[]) {
            int tamanho = array.length;

            //primeiro percorre a lista 
            for (int i = 0; i < tamanho - 1; i++) {
                int indiceMenorElemento = i;

                //encontra o menor elemento 
                for (int j = i + 1; j < tamanho; j++) {
                    if (array[j] < array[indiceMenorElemento]) {
                        indiceMenorElemento = j;
                    }
                }

                //
                int temporario = array[indiceMenorElemento];
                array[indiceMenorElemento] = array[i];
                array[i] = temporario;
            }
        }

        void imprimirArray(int array[]) {
            int tamanho = array.length;
            for (int i = 0; i < tamanho; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
            
 
        


