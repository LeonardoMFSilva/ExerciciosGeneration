programa
{
//1.Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
//Encontre após a maior pontuação e a apresente. 
	funcao inicio()
	{
		inteiro numero [5], x = 0, maior = 0
		para (x = 0; x < 5; x++){
			escreva("Digite um valor: ")
			leia(numero[x])
		}
		para(x = 0; x < 5; x++){
			se(maior < numero[x]){
				maior = numero[x]
			}
		}
			escreva("Este é o maior número: " + maior)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 456; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */