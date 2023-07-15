import domain.Order

class OrderProcessorImpl: OrderProcessor {
    override fun processOrder(order: Order) {
        val totalPrice = order.getTotalPrince()

        println("Order Processed sucessfully. total price:$totalPrice")
    }
}