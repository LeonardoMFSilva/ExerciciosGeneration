programa
{
	
	funcao inicio()
	{
		const inteiro linha = 3, coluna = 3
		inteiro M[linha][coluna], soma = 0, diagonal = 0
		para (inteiro l = 0; l < linha; l++){
			para(inteiro c = 0; c < coluna; c++){
				escreva("Digite o número da linha: " + (l+1) + " e coluna " + (c+1) + ": ")
				leia(M[l][c])
				soma = soma + M[l][c]
				se(l == c){
					diagonal += M[l][c]
				}
			}
		}

		escreva("\nA soma dos valores é: " + soma)
		escreva("\nA soma dos valores da diagonal é: " + diagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 121; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */