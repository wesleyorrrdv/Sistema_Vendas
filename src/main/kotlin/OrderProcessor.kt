import domain.Order

interface OrderProcessor {
    fun processOrder(order:Order)
}