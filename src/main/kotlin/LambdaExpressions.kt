fun main(){
//    val trickFunction = trick
//    trickFunction()
//    threat()
    val coins: (Int) -> String = {
        quantity -> "$quantity quarters"
    }
    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }
    val treatFunction = trickOrThreat(false, coins)
    val trickFunction = trickOrThreat(true, cupcake)

    treatFunction()
    trickFunction()
}

fun trickOrThreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if(isTrick) {
        return trick
    } else {
        if(extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No threats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}