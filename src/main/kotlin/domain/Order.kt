package domain

data class Order(val products: List<Produto>){
    fun getTotalPrince():Double{
        return products.sumOf { it.price }
    }
}
