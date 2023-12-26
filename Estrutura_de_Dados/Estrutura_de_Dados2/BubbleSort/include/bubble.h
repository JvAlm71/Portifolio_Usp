#define  TAM_MAX 10000001

typedef int  elem;

//Criando a estrutura para os dados
typedef struct {
  elem *dados;
  elem *copia;
  long tamanho;
}lista;


//Declarando as funcoes
void cria_lista(lista *l);
void destroi_lista(lista *l);
int insere(lista *l, elem x);
void imprime(lista *l);
void ordenar(lista *l);
void ordena_bubble_sort_aprimorado(lista *l);