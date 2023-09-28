import (
	"fmt"
	"os"
)

func totalapagar(codigoProduto, qtdComprada int) float64 {
	switch codigoProduto {
	case 0:
		return 0
	case 1:
		return float64(qtdComprada) * 0.5
	case 2:
		return float64(qtdComprada) * 1.00
	case 3:
		return float64(qtdComprada) * 4.00
	case 5:
		return float64(qtdComprada) * 7.00
	case 9:
		return float64(qtdComprada) * 8.00
	default:
		return -1
	}
}

func main() {
	for {
		fmt.Println("Tabela de Produtos:")
		fmt.Println("Código 1 - Produto A - R$0.50")
		fmt.Println("Código 2 - Produto B - R$1.00")
		fmt.Println("Código 3 - Produto C - R$4.00")
		fmt.Println("Código 5 - Produto D - R$7.00")
		fmt.Println("Código 9 - Produto E - R$8.00")
		fmt.Println("Código 0 - Finalizar")

		var codigoProduto, qtdComprada int
		fmt.Print("Informe o código do produto (ou 0 para sair): ")
		fmt.Scan(&codigoProduto)

		if codigoProduto == 0 {
			fmt.Println("Finalizando programa")
			break
		}

		fmt.Print("Informe a quantidade desejada: ")
		fmt.Scan(&qtdComprada)
		precoTotal := totalapagar(codigoProduto, qtdComprada)

		if precoTotal >= 0 {
			fmt.Println("O preço do produto é:", precoTotal)
		} else {
			fmt.Println("Código inválido")
		}
	}
}