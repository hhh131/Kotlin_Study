fun main()
{
    var price = 5000

    var a = Book("코틀린 공부",10000).apply {
        name="[초특가]"+name
        discount()
    }
    a.run {
        println("상품명 : ${name},가격 ${price}원")
    }

    a.let {
        println("상품명 : ${it.name},가격 ${it.price}원")
    }
}
class Book(var name: String,var price:Int)
{
    fun discount()
    {
        price-=2000
    }

}