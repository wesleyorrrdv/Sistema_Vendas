import domain.Order
import domain.Produto

fun main() {
    val products = listOf(
        Produto("Product 1", 10.0),
        Produto("Product 2", 15.0),
        Produto("Product 3", 20.0)
    )

    val order = Order(products)
    val orderProcessor = OrderProcessorImpl()
    orderProcessor.processOrder(order)
}