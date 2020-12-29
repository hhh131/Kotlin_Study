fun main() {
     var d =Dog1()
    d.eat()
    d.run()

}


interface Runner{
    fun run()
}
interface Enter{
    fun eat()
    {
        println("음식을 먹습니다.")
    }
}
class Dog1 : Runner,Enter
{
    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다.")
    }
}