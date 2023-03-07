# Lista 02 - Matrizes


1.  Escreva um programa Java que declara e constrói uma matriz de ordem M(2 x 5) de 10 elementos do tipo int. Em seguida use laços for para inicializar os elementos com os valores de 1 até 10. Para finalizar exiba os valores dos elementos da matriz na vertical. Seu programa deverá exibir a seguinte saída.

​				


> 1, 2, 3, 4, 5
> 6, 7, 8, 9, 10

2. Dada uma matriz A (N X N), percorrer a matriz para verificar se a matriz possui elementos repetidos. No final o programa deve imprimir se há ou não elementos repetidos.

3. Dada uma matriz com N linhas e M colunas, escrever um programa para calcular a soma de cada linha da matriz, criando-se um vetor B de dimensão N, onde cada elemento de B representa a soma de uma linha da matriz.

| 1    | 0    | 2    | -1   | 3    | →    | 5    |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 4    | 3    | 2    | 1    | 0    | →    | 10   |
| 1    | -2   | 3    | 4    | 5    | →    | 11   |
| 8    | 5    | 1    | 3    | 2    | →    | 19   |
|      |      |      |      |      |      | ↓    |
|      |      |      |      |      |      | 45   |

$$
SOMALINHA_i \sum_{j=1}^{5} MAT_{ij} (i= 1, 2, 3, 4)
$$

$$
TOTAL = \sum_{i=1}^{4}SOMALINHA_i
$$



4.  Fazer um programa para ler duas matrizes A e B de dimensão N por M e calcular e imprimir a Matriz C = A – B.


5. Fazer um programa para ler duas matrizes A e B de dimensão N por M e calcular e imprimir a Matriz C = A X B seguindo a regra da geração de matrizes multiplas

6. Dada uma matriz A de ordem N por M, encontrar o menor elemento da matriz e informar o valor.

7. Dada uma matriz A de ordem N por M, encontrar o maior elemento da matriz e informar o valor e a posição (linha e coluna) onde o valor foi encontrado.

8. Uma matriz quadrada é chamada de quadrado mágico se a soma dos elementos de cada linha, a soma dos elementos de cada coluna e as somas das diagonais principais e
  secundárias são todas iguais. Por exemplo, as matrizes abaixo são quadrados mágicos

  

  Exemplo 01:

  | 3    | 4    | 8    |
  | ---- | ---- | ---- |
  | 10   | 5    | 0    |
  | 2    | 6    | 7    |

  Exemplo 02:

  | 1    | 1    | 1    |
  | ---- | ---- | ---- |
  | 1    | 1    | 1    |
  | 1    | 1    | 1    |

  

  

  - > Faça um programa que solicite o tamanho da matriz, solicite os valores, e depois de entrar com os valores retorne se a matriz é um quadrado mágico ou não (segundo as regras acima).

9. Faça um programa que solicite o tamanho da matriz (MxN), solicite os valores, e depois de entrar com os valores retorne:
    	a. Valor total da soma dos elementos pares da matriz.
		b. Valor da soma dos elementos dos índices impares da matriz.
		c. Valor do produto dos elementos impares da matriz .
		d. Quantidade e posição (linha x coluna) de um determinado número (perguntar esse número) encontrado na matriz. Apenas a primeira ocorrência.
		e. Caso M=N (matriz quadrada – MxM) calcular a somatória da diagonal principal e secundária.
		f. Criar um vetor com a soma de todos os elementos de cada linha e outro com a soma dos elementos de cada coluna.


10. Faça um programa que solicite o tamanho da matriz (MxM), e monte as seguintes matrizes abaixo (considerando aqui no exemplo uma matriz 4 x 4). Imprima cada matriz no formato informado abaixo (obs – encontrar a condição para popular o valor e não carregar os valores na posição)

    a. 

    | 1    |      |      |      |
    | ---- | ---- | ---- | ---- |
    |      | 1    |      |      |
    |      |      | 1    |      |
    |      |      |      | 1    |

    b.

    |      |      |      | 1    |
    | ---- | ---- | ---- | ---- |
    |      |      | 1    |      |
    |      | 1    |      |      |
    | 1    |      |      |      |

    c.

    | 1    | 1    | 1    | 1    |
    | ---- | ---- | ---- | ---- |
    | 1    |      |      | 1    |
    | 1    |      |      | 1    |
    | 1    | 1    | 1    | 1    |

    d.

    | 1    |      |      |      |
    | ---- | ---- | ---- | ---- |
    | 1    | 1    |      |      |
    | 1    | 1    | 1    |      |
    | 1    | 1    | 1    | 1    |

    e.

    | 0    | 0    | 0    | 0    |
    | ---- | ---- | ---- | ---- |
    | 1    | 0    | 0    | 0    |
    | 1    | 1    | 0    | 0    |
    | 1    | 1    | 1    | 0    |

    

​	