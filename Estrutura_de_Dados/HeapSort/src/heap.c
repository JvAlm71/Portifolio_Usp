#include <stdio.h>
#include <stdlib.h>
#include "heap.h"

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



void rearranja_heap(lista *l, long i, long tam_heap){
  //custo total: f(n) = (log n) - 1 -> O(o log n), com n do mesmo tamanho da heap
  long fe,fd,mf;
  elem aux;
  //identifica filhos, esquerda e direita
  fe = (2*i + 1 < tam_heap) ? 2 * i + 1 : -1;
  fd = (2 * i + 2 < tam_heap) ? 2 * i + 2 : -1;

  //se i for folha, termina.
  if(fe == -1)
    return;
  //verifica o filho maior
  mf = (fd == -1 || l->dados[fe] > l->dados[fd]) ? fe : fd;
//se o valor do nó i for maior do que o valor do maior filho, termina.
  if(l->dados[i] >= l->dados[mf])
    return;

  //troca elemento da posicao i pelo maior filho.
  aux = l->dados[i];
  l->dados[i] = l->dados[mf];
  l->dados[mf] = aux;
  rearranja_heap(l, mf, tam_heap); //arruma para o proximo nivel
}

void constroi_heap(lista *l){
  for(long i = l->tamanho / 2 -1; i >= 0; i--)
    rearranja_heap(l, i, l->tamanho);
}

void heap_sort(lista *l){
  long tam_heap;
  elem aux;
  constroi_heap(l);

  tam_heap = l->tamanho;
  while(tam_heap > 1){
    // trocar raiz pela ultima folha
    aux = l->dados[tam_heap - 1];
    l->dados[tam_heap - 1] = l->dados[0];
    l->dados[0] = aux;

    //diminuir a heap
    tam_heap--;
    //rearranjando a heap
    rearranja_heap(l, 0 , tam_heap);

  }
}