fun main()
{
    var JJa =FoodPoll("짜장")
    var JJam =FoodPoll("짬뽕")
    JJa.vote()
    JJa.vote()

    JJam.vote()

    println("${JJa.name} : ${JJa.count}")
    println("${JJam.name} : ${JJam.count}")
    println("총계 : ${FoodPoll.total}")


}

class FoodPoll (val name: String){
    companion object {
        var total=0
    }
    var count=0


    fun vote(){
        total++
        count++
    }

}