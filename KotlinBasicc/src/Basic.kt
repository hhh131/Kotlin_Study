
var a = "패키지 스코프"

class B{
    fun print()
    {
        var a="클래스 스코프"
        println(a)
    }
}
fun main()
{
    var a="함수 스코프"
    println(a)
    B().print()
}