#include <stdio.h>
#include <stdlib.h>
#include "radix.h"

//inicializa a lista
void cria_lista(lista *l){
  // alocando dinamicamente os elementos da fila
  l-> copia = malloc(TAM_MAX * sizeof(elem));
  l-> dados = malloc(TAM_MAX * sizeof(elem));
  l ->tamanho = 0;
}


//sera liberado a memoria alocada dinamicamente
void destroi_lista(lista *l){
  free(l->dados);
  free(l->copia);
  l->tamanho = 0;
}
//inserindo cada elemento
int insere(lista *l, elem x){
  if(l->tamanho== TAM_MAX)
    return 1;

  l->dados[l->tamanho] = x;
  l->tamanho++; // incrementa a capoia com o ++


return 0; //retornar que deu certo
}


void imprime(lista *l){
  for(long i = 0; i < l->tamanho; i++){
    printf("%d ", l->dados[i]);
  }
puts("");
}

//ordenacao simples, podendo ser usada para ordenar primeiramente
//fazendo com que o vetor fique ordenado de forma crescente
void ordenar(lista *l) {
    elem menor;
    long idMenor;
    
    for (long i = 0; i < l->tamanho - 1; i++) {
        menor = l->dados[i]; // o menor elemento conhecido ate entao eh o primeiro
        idMenor = i;
        for (long j = i + 1; j < l->tamanho; j++)
            if (l->dados[j] < menor) {
                menor = l->dados[j];
                idMenor = j;
            }
        // coloca o menor elemento no comeco
        l->dados[idMenor] = l->dados[i];
        l->dados[i] = menor;
    }
}

int retorna_digito(elem valor, int posicao){
    for (int i = 0; i < posicao; i++)
        valor /= 10;
    return valor % 10;    
}

void ordena_radix_sort(lista *l){
    elem *filas[10], maior;
    long tam_filas[10] ={0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    long i, j, k;
    int m, fila;
 
    //aloca as filas
    for(i = 0; i < 10; i++)
        filas[i] = malloc(sizeof(elem) * TAM_MAX);

    //descobre o maior
    maior = l->dados[0];
    for(i = 1; i < l->tamanho; i++)
        if(l->dados[i] > maior)
            maior = l->dados[i];

    //qts digitos o maior tem
    m = 1;
    while(maior >= 10){
        maior /= 10;
        m++;
    }

    //m iterações:
    for (int i = 0; i < m; i++)
    {
        //insere nas filas
        for (int j = 0; j < l->tamanho; j++) {
            fila = retorna_digito(l->dados[j], i);
            filas[fila][tam_filas[fila]++] = l->dados[j];
        }

        //libera das filas
        j = 0;
        for ( fila = 0; fila < 10; fila++)
        {
            for (k = 0; k < tam_filas[fila]; k++)
                l->dados[j++] = filas[fila][k];
            tam_filas[fila] = 0;
        }
    }
    
    //desaloca filas
    for(i = 0; i < 10; i++)
        free(filas[i]);            
}







