import jdk.jfr.Event

/*
fun main()
{
    EventPrinter().start()
}

interface EventListener{
    fun onEvent(count:Int)
}

class Counter(var Listner: EventListener){

    fun count(){
        for (i in 1..100)
        {
            if(i%5 ==0){
                Listner.onEvent(i)
            }
        }
    }
}

class EventPrinter: EventListener
{
    override fun onEvent(count: Int) {
        print("${count}-")
    }

    fun start()
    {
        val counter = Counter(this)
        counter.count()
    }
}*/
fun main()
{
EventPrinter().start()
}

interface EventListener{
    fun onEvent(count:Int)
}

class Counter(var listener: EventListener){
    fun count(){
        for(i in 1..100)
        {
            if(i % 5 == 0 ){
                listener.onEvent(i)
            }
        }
    }
}
class EventPrinter{
    fun start(){
        val counter = Counter(object: EventListener{
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}