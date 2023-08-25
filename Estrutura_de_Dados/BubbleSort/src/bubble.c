#include <stdio.h>
#include <stdlib.h>
#include "bubble.h"

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

void ordena_bubble_sort_aprimorado(lista *l){
  long continua = 1,iteracao = 1;
  elem aux;
  while(continua == 1){
    continua = 0;
    for(long i = 0; i < l->tamanho-iteracao; i++)
      if(l->dados[i]> l->dados[i+1]){
        //faz a troca
        aux = l->dados[i];
        l->dados[i] = l->dados[i+1];
        l->dados[i+1] = aux;
        continua = 1;
      }
    iteracao++;
    }
}

