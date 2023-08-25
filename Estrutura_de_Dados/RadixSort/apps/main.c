//Declarando bibliotecas
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
#include "radix.h"

#define REP 10   

int main(void) {
    clock_t ini_clocks, soma_clocks;
    lista l;

    for (int i = 3; pow(10, i) <= TAM_MAX; i++) {
        soma_clocks = 0; // inicializa soma de tempos

        // faz repeticoes
        for (int j = 0; j < REP; j++) {
            cria_lista(&l);

            // insere elementos aleatorios
            for (long k = 0; k < pow(10, i); k++)
                insere(&l, rand() % TAM_MAX);


            //ordenar(&l);

            // guarda numero de ciclos antes de ordenar
            ini_clocks = clock();


            ordena_radix_sort(&l);

            // calcula o numero de ciclos total, e soma-o em soma_clocks
            soma_clocks += (clock() - ini_clocks);

            //imprime(&l);

            destroi_lista(&l);
        }

        //imprime a media de tempo das repetições
        printf("Entrada: %.0lf\t%10.5lf\n", pow(10, i), ( (((double) soma_clocks) / REP) / CLOCKS_PER_SEC) );

    }

}

