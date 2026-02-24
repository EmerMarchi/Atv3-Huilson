import java.math.BigDecimal
import java.text.Bidi

fun main() {

    val vitine : List<Map<String, BigDecimal>> = listOf(
        mapOf("banana" to BigDecimal("3.31")),
        mapOf("uva" to BigDecimal("6.99")),
        mapOf("abacate" to BigDecimal("5.50")),
        mapOf("abacaxi" to BigDecimal("10.01")),
    )

    fun menu(){
        print("1 - Comprar produto")
        print("2 - Vender produto")
        print("3 - Ver caixa")
        print("4 - Ver estoque")
        print("5 - Sair")
        var opcao = readln().toInt()
        when (opcao) {
            1->"Comprando..."
            2->"Vendendo..."
            3->"Donheiro atual..."
            4->"Produtos em estoque"
            else->"Saindo..."
        }
    }

    open class Produto(
       var nome: String,
       var preco: BigDecimal,
    )

    class  Estoque(
       var produto: Produto,
    )

    class Compra(
        var produto: Produto,
    )

    class Venda(
        var produto: Produto,
    )

    class Financeiro(
        caixa : BigDecimal = "100.0".toBigDecimal(),
    )
}