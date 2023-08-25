#include <iostream>
#include <iomanip>
#include <cstdlib>
#include <ctime>
#include <cstring>
#include <string>
#include <fstream>
#include <cstdio>
using namespace std;

//DEF. MATRIZ DE CONEXOES, VETOR DE CURSOS E VARAVEIS GLOBAIS
int mapa[23][23] = {{0,	1,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{0,	1,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{0,	0,	0,	0,	1,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{1,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{0,	0,	1,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{0,	0,	0,	0,	0,	1,	0,	1,	0,	1,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	1,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0},
{0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{0,	0,	0,	1,	0,	0,	1,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	1,	1,	0,	1,	1,	1,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	1,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	1,	0,	0,	1,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	1,	0,	1,	1,	0,	1,	0,	0,	0},
{0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	1,	1,	0,	0,	0,	1,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	1,	0,	0,	1,	0,	0,	1,	1,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	1,	1,	0},
{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	1,	1,	1,	1,	1,	0,	0,	0,	0},
{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	1,	1},
{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	0},
{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0}};

int *dominios, territorios1, territorios2;
int *soldados;
string *nomesJogadores;
string nomesCursos[23] = {"BMat (curso 0)", "LMAT (curso 1)", "BMACC (curso 2)", "BSI (curso 3)", "BCC (curso 4)", "LCE (curso 5)", "Fis (curso 6)", "BioMol (curso 7)", "FisComp (curso 8)", "Arq (curso 9)", "BCD (curso 10)", "Estat (curso 11)", "Quim (curso 12)", "Amb (curso 13)", "Civil (curso 14)", "Materiais (curso 15)", "Prod (curso 16)", "Mecanica (curso 17)", "MK (curso 18)", "Comp (curso 19)", "Aero (curso 20)", "Eletrica Eletronica (curso 21)", "Eletrica Automacao (curso 22)"};
fstream jogosSalvos, nomesArquivos;


void printMapa (int matriz[23][23]);
void printDominios ();
void printDominiosSoldados ();
int verificarDominio(int curso, int jogador);
void colocarSoldados(int jogador);
int verificarVitoria ();
void verificaManterAtaque (int *manterAtaque);
void ataque ();
void dado (int *d);
void dadosJogados (int jogador, int soldadosJogador, int *resultadoJogador);
int maxSoldadosJogada (int numeroSoldados);
int verificaAtaquesPossiveis (int atacante);
int ponto_extra (int jogador);
void encerrarJogo ();
void quantidadeTerritorios ();
void mapaJogo ();


void printMapa (int matriz[23][23]) {
  cout << "  | 00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22\n--+----------------------------------------------------------------------" << endl;

  for (int i = 0; i < 23; i ++) {
    cout << setw(2) << i << "| ";
    for (int j = 0; j < 23; j++) {
      cout << " " << matriz[i][j] << " ";
    }
    cout << endl;
  }
  cout << endl;
}

void printDominios () {
  for (int i = 0; i < 23; i++){
    cout << nomesCursos[i] << " - " << nomesJogadores[dominios[i] - 1] << endl;
  }
  cout << "\n" << endl;
}

void printDominiosSoldados () {
  for(int i = 0; i < 23; i++){ 
    cout << nomesCursos[i] << " - pertence a " << nomesJogadores[dominios[i] - 1] << " e tem " << soldados[i] << " soldados" << endl;
  }
  cout << "\n" << endl;

  mapaJogo ();
}

int verificarDominio (int curso, int jogador) {
  while(curso > 22 || dominios[curso] != jogador){
      cout << "Esse curso nao te pertence, escolha outro curso: ";
      cin >> curso;
    } // ve se o numero do curso eh valido e pertence ao jogador

  return curso;
}

void colocarSoldados (int jogador) {

  //VER. QUANTIDADE DE SOLDADOS PARA COLOCAR

  int contador = 0;
  
  for(int i = 0; i < 23; i++){
    if (dominios[i] == jogador){
      contador++;
    }
  }

  if(contador%2 == 0){
    contador = contador/2;
  } 
  else {
      contador = (contador/2) + 1;
  }

  contador += ponto_extra(jogador);

  cout << nomesJogadores[jogador - 1] << ", voce tem " << contador << " soldados para distribuir\n" << endl;

  
  //COLOCANDO SOLDADOS

  int curso;
  
  for(int i = 0; i < contador; i++){
    cout << "Digite o curso para colocar o soldado " << i + 1 << " : ";
    cin >> curso;
    curso = verificarDominio(curso, jogador);
    soldados[curso]++;
  }

  cout << "\n" << endl;

  printDominiosSoldados ();
  
  cout << endl;
}

int verificarVitoria () {
  
  for (int i = 1; i < 23; i++){
    if(dominios[i] != dominios[0]){
      return 0;
    }
  }

  return 1;
} //0 continua e 1 alguem ganhou

void verificaManterAtaque (int *manterAtaque) {
  while(*manterAtaque != 0 && *manterAtaque != 1){
        cout << "Valor invalido. Digite 0 para atacar ou 1 para pular sua vez: ";
      cin >> *manterAtaque;
      }
      cout << endl;
}

int maxSoldadosJogada (int numeroSoldados) {
  if (numeroSoldados > 3) {
    numeroSoldados = 3;
  }
  return numeroSoldados;
}

void dado (int *d) {
  *d = rand() % 6 + 1;
}

void dadosJogados (int jogador, int soldadosJogador, int *resultadoJogador) {
  int d1, d2, d3;

  switch(soldadosJogador){
    case 1:
      dado(&d1);
      cout << "\nO dado do jogador " << nomesJogadores[jogador - 1] << " foi: " << d1 << endl;
      *resultadoJogador = d1;
      break;
    
    case 2:
      dado(&d1);
      dado(&d2);
      cout << "\nOs dados do jogador " << nomesJogadores[jogador - 1] << " foram: " << d1 << " , " << d2 << endl;
      *resultadoJogador = d1 + d2;
      break;

    case 3:
      dado(&d1);
      dado(&d2);
      dado(&d3);
      cout << "\nOs dados do jogador " << nomesJogadores[jogador - 1] << " foram: " << d1 << " , " << d2 << " , " << d3 << endl;
      *resultadoJogador = d1 + d2 + d3;      
      break;
  }
}

void ataque (int atacante) {

  printMapa (mapa);
  printDominiosSoldados ();
  
  int cursoAtaque, cursoDefesa, defensor = 2, temConexaoParaAtaque = 0;


  //DEF. CURSO ATAQUE
  
  cout << nomesJogadores[atacante - 1] << ", selecione o curso que fara o ataque: "; 
  cin >> cursoAtaque;
  cout << endl;

  while (cursoAtaque > 22 || dominios[cursoAtaque] != atacante || soldados[cursoAtaque] < 2 || temConexaoParaAtaque == 0) {
    
    if (cursoAtaque > 22 || dominios[cursoAtaque] != atacante) {
      cout << "Esse curso nao te pertence, escolha outro curso: ";
      cin >> cursoAtaque;
    }
    
    else if (soldados[cursoAtaque] < 2) {
      cout << "Esse curso nao tem soldados o suficiente para atacar. Escolha outro curso: ";
      cin >> cursoAtaque;
    }

    while (temConexaoParaAtaque == 0) {
      for (int i = 0; i < 23; i++) {
        if (dominios[i] != atacante && mapa[cursoAtaque][i] == 1) {
          temConexaoParaAtaque = 1;
          break;
        }
      }

      if (temConexaoParaAtaque == 0) {
        cout << "Esse curso nao tem fronteira disponivel para ataque. Jogador " << atacante << ", escolha um novo curso: ";
        cin >> cursoAtaque;
      }
              
    }
  } //verifica validade curso ataque
  
  cout << "Voce selecionou " << nomesCursos[cursoAtaque] << " para atacar\n" << endl;

  if (atacante == 2) {
    defensor = 1;
  } //def. jogador da defesa


  //DEF. CURSO DEFESA
  
  cout << nomesJogadores[atacante - 1] << ", selecione o curso que sera atacado: "; 
  cin >> cursoDefesa;
  cout << endl;


  while (cursoDefesa > 22 || dominios[cursoDefesa] != defensor || mapa[cursoAtaque][cursoDefesa] == 0) {

    if (cursoDefesa > 22 || dominios[cursoDefesa] != defensor) {
      cout << "Esse curso nao pertence ao seu adversario, escolha outro curso: ";
      cin >> cursoDefesa;
    }
    
    else{
    cout << "Voce nao pode selecionar um curso que nao possui caminhos para o ataque, selecione outro curso: ";
    cin >> cursoDefesa;
    }
  }  //ver. validade curso defesa

  cout << "Voce selecionou " << nomesCursos[cursoDefesa] << " para ser atacado\n" << endl; 


  //DEF. QUANTIDADE DE SOLDADOS PARTICIPANDO

  int resultadoAtaque, resultadoDefesa, soldadosAtaque = soldados[cursoAtaque] - 1, soldadosDefesa = soldados[cursoDefesa];

  soldadosAtaque = maxSoldadosJogada(soldadosAtaque); //def. max soldados de ataque
  soldadosDefesa = maxSoldadosJogada(soldadosDefesa); //def. max soldados de defesa

  if (soldadosAtaque > 1) {
    cout << nomesJogadores[atacante - 1] << ", escolha com quantos soldados (entre 1 e "<< soldadosAtaque << ") você ira atacar: ";
    cin >> soldadosAtaque;
    cout << endl;

    while (soldadosAtaque < 1 || soldadosAtaque > 3 || soldados[cursoAtaque] < soldadosAtaque) {
      cout << "Essa quantidade de soldados eh invalida, escolha uma nova quantidade: ";
      cin >> soldadosAtaque;
      cout << endl;
    }
  } //escolhendo quantidade de soldados de ataque


  //DADOS E RESULTADO

  dadosJogados (atacante, soldadosAtaque, &resultadoAtaque); //dados ataque
  cout << "O resultado de " << nomesJogadores[atacante - 1] << " foi "<< resultadoAtaque << endl;
  
  dadosJogados (defensor, soldadosDefesa, &resultadoDefesa); //dados defesa
  cout << "O resultado de " << nomesJogadores[defensor - 1] << " foi "<< resultadoDefesa << endl;

  int transfereSoldado;

  if (resultadoAtaque > resultadoDefesa) {
    cout << "VITORIA DE "<< nomesJogadores[atacante - 1] << "\n\n" << endl;
    soldados[cursoDefesa] -= soldadosDefesa;
    
    if (soldados[cursoDefesa] <= 0) {
    cout << nomesJogadores[atacante - 1] << " conquistou " << nomesCursos[cursoDefesa] << endl;
    dominios[cursoDefesa] = atacante;
    soldados[cursoAtaque]--;
    soldados[cursoDefesa] = 1;

      if (soldados[cursoAtaque] > 1) {
        cout << nomesJogadores[atacante - 1] << ", você tem " << soldados[cursoAtaque] << " soldados em " << nomesCursos[cursoAtaque] << " e ja tem 1 soldado em " << nomesCursos[cursoDefesa] << ". Gostaria de transferir mais soldados de " << nomesCursos[cursoAtaque] << " para " << nomesCursos[cursoDefesa] <<"? Digite 1 para SIM e 0 para NAO" << endl;
        cin >> transfereSoldado;
  
        while (transfereSoldado != 0 && transfereSoldado != 1) {
        cout << "Valor invalido. Digite 1 para transferir soldado ou 0 para manter como esta: ";
        cin >> transfereSoldado;
        }
      }
      
      
      if (transfereSoldado == 1 && soldados[cursoAtaque] > 2) {
        int soldadosParaTransferir = 1;
        cout << nomesJogadores[atacante - 1] << ", insira quantos soldados voce deseja transferir (deve ser entre 1 e " << soldados[cursoAtaque] - 1 << " soldados): ";
        cin >> soldadosParaTransferir;
  
        while (soldadosParaTransferir < 1 && soldadosParaTransferir > soldados[cursoAtaque] - 1) {
          cout << "Valor invalido. Digite um valor entre 1 e " << soldados[cursoAtaque] - 1 << " de soldados para transferir: ";
          cin >> soldadosParaTransferir;
        }
        
        soldados[cursoDefesa] += soldadosParaTransferir;
        soldados[cursoAtaque] -= soldadosParaTransferir;
      }
    }  else {
      cout << "O dominio de " << nomesCursos[cursoDefesa] << " continua com o jogador " << defensor << endl;
    }  
  } else {
    cout << "VITORIA DE "<< nomesJogadores[defensor - 1] << "\n\n" << endl;
    soldados[cursoAtaque] -= soldadosAtaque;
  }
  quantidadeTerritorios ();
}

int verificaAtaquesPossiveis (int atacante) {
  
  for (int i = 0; i < 23; i++) {
    if (dominios[i] == atacante && soldados[i] > 1) {
      for (int j = 0; j < 23; j++) { 
        if (dominios[j] != atacante && mapa[i][j] == 1) {
            return 1;
        }
      }
    }
  }

  return 0;
}

int ponto_extra (int jogador) {
  int soldados = 0;
  
  if(dominios[0] == jogador && dominios[1] == jogador     && dominios[2] == jogador && dominios[3] == jogador     && dominios[4] == jogador){
      //AMERICAS
  soldados += 5;
  }
  
  if(dominios[5] == jogador && dominios[6] == jogador     && dominios[7] == jogador && dominios[8] == jogador){
    //EUROPA
    soldados += 5;
  }
  
  if(dominios[9] == jogador && dominios[10] == jogador    && dominios[11] == jogador && dominios[12] == jogador){
    //AFRICA
    soldados += 3;
  }
  
  if(dominios[13] == jogador && dominios[14] == jogador   && dominios[15] == jogador && dominios[16] == jogador   && dominios[17] == jogador && dominios[18] == jogador   && dominios[19] == jogador){
    //ÁSIA 
    soldados += 7;
  }
  
  if(dominios[20] == jogador && dominios[21] == jogador   && dominios[22] == jogador){
    //OCEANIA
    soldados += 2;
  }
  
  return soldados;
}

void encerrarJogo () {
  int n;
  cout << "Deseja encerrar o jogo? Digite 0 para continuar ou 1 para finalizar o jogo: ";
  cin >> n;

  while (n != 0 && n != 1) {
    cout << "Valor invalido. Digite 0 para continuar ou 1 para finalizar o jogo: ";
    cin >> n;
  }

  if (n == 1) {
    int m;
    cout << "Deseja salvar o progresso do jogo? Digite 1 para salvar ou 0 para sair sem salvar: ";
    cin >> m;

    while (m != 0 && m != 1) {
      cout << "Valor invalido. Digite 1 para salvar ou 0 para sair sem salvar: ";
      cin >> m;
    }

    if (m == 1) {
      
      time_t t;
      struct tm * data;
      char dataFormatada[20];
      
      time(&t);
      data = localtime(&t);
      strftime (dataFormatada, 20, "[%d/%m/%Y %H:%M]", data);
      
      nomesArquivos.open ("nomesArquivos.txt", ios::out | ios::app);
      if (nomesArquivos.is_open()) {
        nomesArquivos << nomesJogadores[0] << " vs. " << nomesJogadores[1] << " " << dataFormatada << endl;
      } 
      else {
        cout << "Nao foi possivel abrir o arquivo" << endl;
      }
      nomesArquivos.close ();
      
      jogosSalvos.open ("jogosSalvos.txt", ios::out | ios::app);
      if (!jogosSalvos.is_open()) {
        cout << "Nao foi possivel abrir o arquivo" << endl;
      }
      jogosSalvos << nomesJogadores[0] << " vs. " << nomesJogadores[1] << " " << dataFormatada << endl;

      jogosSalvos << nomesJogadores[0] << endl;
      jogosSalvos << nomesJogadores[1] << endl;
      
      for(int i = 0; i < 23; i++){
        jogosSalvos << dominios[i] << endl;
      }
      for(int i = 0; i < 23; i++){
        jogosSalvos << soldados[i] << endl;
      }
      
        jogosSalvos << endl;
    }
    jogosSalvos.close ();
    exit (0);
  }
}

void quantidadeTerritorios () {
  int um = 0, dois = 0;
  for (int i = 0; i < 23; i++) {
    if (dominios[i] == 1) {
      um++;
    } else {
      dois++;
    }
  }
  territorios1 = um;
  territorios2 = dois;
}

void mapaJogo () {
  int mapaC[9][12];
  for(int i = 0; i < 9; i++)
  {
    for(int j = 0; j < 12; j++)
    {
      mapaC[i][j] = 0;
    }
  }
  mapaC[1][2] = 3, mapaC[3][1] = 2, mapaC[4][1] = 1, mapaC[5][2] = 5, mapaC[6][3] = 4, mapaC[5][5] = 10, mapaC[4][6] = 13, mapaC[6][5] = 11, mapaC[7][5] = 12, mapaC[3][5] = 7,   mapaC[2][4] = 6, mapaC[1][5] = 9, mapaC[2][6] = 8,  mapaC[3][7] = 18, mapaC[2][8] = 16, mapaC[2][10] = 17, mapaC[3][9] = 15, mapaC[4][8] = 20, mapaC[5][8] = 19, mapaC[6][8] = 22, mapaC[6][9] = 21, mapaC[7][9] = 23;
  
  for(int i = 0; i < 9; i++)
  {
    for(int j = 0; j < 12; j++)
    {
      if(mapaC[i][j] != 0)
      {
          cout << mapaC[i][j] - 1 << " ";
      }
      else
      {
          cout << "-----";
      }
    }
    cout << "\n" << endl;
  }
}



int main () {
  srand (time (NULL));

  //ALOCACOES DINAMICAS
  
  nomesJogadores = (string*) malloc (2 * sizeof (string)); //0 = jogador 1, 1 = jogador 2
  if (nomesJogadores == NULL){
    cout << "Erro na alocacao de memoria" << endl;
    exit(1);
  }

  dominios = (int*) malloc (23 * sizeof (int)); //1 = jogador 1, 2 = jogador 2
  if (dominios == NULL){
    cout << "Erro na alocacao de memoria" << endl;
    exit(1);
  }

  soldados = (int*) malloc (23 * sizeof (int));
  if (soldados == NULL){
    cout << "Erro na alocacao de memoria" << endl;
    exit(1);
  }

  
  //CARREGANDO UM JOGO SALVO
  int carregarArquivo;
  
  cout << "Digite 0 para iniciar um novo jogo ou digite 1 para carregar um jogo salvo: ";
  cin >> carregarArquivo;

  while (carregarArquivo != 0 && carregarArquivo != 1) {
    cout << "Valor invalido. Digite 0 para iniciar um novo jogo ou 1 para carregar um jogo salvo: ";
    cin >> carregarArquivo;
  }

  if (carregarArquivo == 1) {
    int quantArquivos = 0, jogoBuscado;
    string linhaArquivo, *nomesJogos;

    nomesJogos = (string*) malloc (1 * sizeof (string));
    if (nomesJogos == NULL) {
      cout << "Erro na alocacao de memoria" << endl;
      exit(1);
    }
    
    cout << "\nOs jogos salvos sao:" << endl;
    
    nomesArquivos.open ("nomesArquivos.txt", ios::in);
    if (!nomesArquivos.is_open ()) {
      cout << "Nao foi possivel abrir o arquivo" << endl;
      exit (1);
    }
    
    while (getline (nomesArquivos, linhaArquivo)) {
      cout << quantArquivos + 1 << " - " << linhaArquivo << endl;
      
      nomesJogos = (string*) realloc (nomesJogos, (quantArquivos + 1) * sizeof (string));
      if (nomesJogos == NULL) {
        cout << "Erro na alocacao de memoria" << endl;
        exit(1);
      }
      
      nomesJogos[quantArquivos] = linhaArquivo;
      quantArquivos++;
    }

    nomesArquivos.close ();

    cout << "\nDigite o numero do jogo que deseja carregar: ";
    cin >> jogoBuscado;    
    jogoBuscado--;

    while (jogoBuscado < 0 || jogoBuscado >= quantArquivos) {
      cout << "Numero de jogo invalido. Digite o numero do jogo que deseja carregar: ";
      cin >> jogoBuscado;
      jogoBuscado--;
    }
    
    jogosSalvos.open ("jogosSalvos.txt", ios::in);
    if (!jogosSalvos.is_open ()) {
      cout << "Nao foi possivel abrir o arquivo" << endl;
      exit (1);
    }

    fstream arqTempJogos, arqTempNomes;
    arqTempJogos.open ("arqTempJogos.txt", ios::out);
    if (!arqTempJogos.is_open ()) {
      cout << "Nao foi possivel abrir o arquivo" << endl;
      exit (1);
    }

    arqTempNomes.open ("arqTempNomes.txt", ios::out);
    if (!arqTempNomes.is_open ()) {
      cout << "Nao foi possivel abrir o arquivo" << endl;
      exit (1);
    }

    nomesArquivos.open ("nomesArquivos.txt", ios::in);
    if (!nomesArquivos.is_open()) {
      cout << "Nao foi possivel abrir o arquivo" << endl;
    }

    
    while (getline (nomesArquivos, linhaArquivo)) {
      if (linhaArquivo != nomesJogos[jogoBuscado]) {
        arqTempNomes << linhaArquivo << endl;
      }
    }
    
    while (getline (jogosSalvos, linhaArquivo)) {  
      if (linhaArquivo == nomesJogos[jogoBuscado]) {
        for (int i = 0; i < 2; i++){
          getline (jogosSalvos, linhaArquivo);
          nomesJogadores[i] = linhaArquivo;
        }
        
        for (int i = 0; i < 23; i++){
          getline (jogosSalvos, linhaArquivo);
          dominios[i] = stoi(linhaArquivo);
        }
        
        for (int i = 0; i < 23; i++) {
          getline (jogosSalvos, linhaArquivo);
          soldados[i] = stoi(linhaArquivo);
        }
        getline (jogosSalvos, linhaArquivo);
        getline (jogosSalvos, linhaArquivo);
      }
      arqTempJogos << linhaArquivo << endl;
    }
    
    remove ("jogosSalvos.txt");
    remove ("nomesArquivos.txt");
    rename ("arqTempJogos.txt", "jogosSalvos.txt");
    rename ("arqTempNomes.txt", "nomesArquivos.txt");
    jogosSalvos.close ();
    nomesArquivos.close ();
    free (nomesJogos);

    printMapa (mapa);
    printDominiosSoldados ();
  }

  
  //INICIANDO UM JOGO NOVO
  if (carregarArquivo == 0) {
  
    //DEF. OS JOGADORES
    cout << "\n\nBem Vindo ao Guerra de Computeiros!\n" << endl;

    
    string jogador_1, jogador_2;
    getline (cin, jogador_1);
    cout << "Digite o nome do jogador 1: ";
    getline (cin, jogador_1);
    cout << "Ola, " << jogador_1 << "!" << endl;
    cout << "Digite o nome do jogador 2: ";
    getline (cin, jogador_2);
    cout << "Ola, " << jogador_2 << "!" << endl;

    nomesJogadores[0] = jogador_1;
    nomesJogadores[1] = jogador_2;
    
    printMapa (mapa);
  
    
    //DEF. OS DOMINIOS INICIAS
  
    for (int i = 0; i < 23; i++){
      dominios[i] = 2;
    } //Def. vetor como 2
  
    int contador = 0;
    while (contador < 11){
      int i = rand() % 23;
      if (dominios[i] == 2){
        dominios[i] = 1;
        contador++;
      }
    } //Def. cursos jogador 1
  
    printDominios ();
  
  
    //DEF. OS SOLDADOS INICIAIS
  
    for (int i = 0; i < 23; i++){
      soldados[i] = 1;
    } //Def. vetor como 1
  
    for (int i = 1; i < 3; i++){
      if (i == 1){
        cout << nomesJogadores[0] << ", eh hora de definir os cursos dos seus soldados\n" << endl;
      } 
      
      else {
        cout << nomesJogadores[1] << ", agora eh sua vez de definir os cursos dos seus soldados\n" << endl;
      }
      colocarSoldados (i);
    } //Chama a funcao para colocar os soldados
  }


  quantidadeTerritorios ();  
  encerrarJogo ();
  

  //RODADAS

  int manterAtaque;

  while (verificarVitoria () == 0) {
    
    for (int i = 1; i < 3; i++){

      
      if (verificaAtaquesPossiveis (i) == 0) {
        cout << "Nao ha ataques possiveis para " << nomesJogadores[i - 1] << endl;
        continue;
      }
      
      cout << nomesJogadores[i - 1] << ", voce vai iniciar seus ataques ou pular sua vez?\nPara atacar digite 0 e para pular sua vez digite 1: ";
      cin >> manterAtaque;
      verificaManterAtaque (&manterAtaque);
      
      while (manterAtaque == 0) {
        
        ataque (i);
        
        if (verificarVitoria () == 1) {
          cout << nomesJogadores[dominios[0] -1] << " ganhou o Guerra de Computeiros!!!" << endl;
          break;
        }

        if (verificaAtaquesPossiveis (i) == 0) {
          cout << "Nao ha ataques possiveis para " << nomesJogadores[i - 1] << endl;
          break;
        }
        
        cout << nomesJogadores[i - 1] << ", para continuar seu ataque digite 0 e para encerrar digite 1: ";
        cin >> manterAtaque;
        verificaManterAtaque (&manterAtaque);
      }
  
      if (verificarVitoria () == 1){
        break;
      }
    }

    if (verificarVitoria () == 1){
        break;
    }

    cout << "FIM DE RODADA. HORA DE DISTRIBUIR SOLDADOS\n" << endl;

    printDominiosSoldados ();
    
    colocarSoldados (1);
    colocarSoldados (2);

    encerrarJogo ();
    
  }

  cout << nomesJogadores[dominios[0] - 1] << " EH O VENCEDOR DO GUERRA DE COMPUTEIROS" << endl;


  free (dominios);
  free (soldados);
  free (nomesJogadores);
  return 0;
}