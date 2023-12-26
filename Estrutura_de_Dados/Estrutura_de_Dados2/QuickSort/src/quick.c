#include <stdio.h>
#include <stdlib.h>
#include "quick.h"

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

void quick_sort_recursivo(lista *l, long ini, long fim){
  
  long i, j;
  elem aux;

  //fazendo as reparticoes
  i = ini;
  for(j = ini; j < fim; j++){
    //comparando com o pivo;
    if(l->dados[j] < l->dados[fim]){
      //troca elementos das posicoes i e j
      aux = l->dados[j];
      l->dados[j] = l->dados[i];
      l->dados[i] = aux;
      i++;
    }
  }
  
   aux = l->dados[fim];
   l->dados[fim] = l->dados[i];
   l->dados[i] = aux;

   if(ini < i - 1)
     quick_sort_recursivo(l, ini, i - 1);
   if(i + 1 < fim)
     quick_sort_recursivo(l, i + 1, fim);


}

void quick_sort(lista *l){
  return quick_sort_recursivo(l, 0, l-> tamanho - 1);
}





