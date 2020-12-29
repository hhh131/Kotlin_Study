fun main()
{
    b(::a)
    val c ={ str:String->println("$str 람다 함수") }
    b(c)
}

fun a (str:String)
{
    println("$str 함수 a")
}
fun b(function:(String)->Unit)
{
        function("b가 호출함")
}