fun main(){
    var favouriteActor : String? = "Max"
    // This variable is String but if we try to reassign it to null we get error message
    // So use "?" to make this string nullable
    //favouriteActor = null
    // If I want to get length of this string I need user construction
    // .? or !!.
    if (favouriteActor != null) {
        println("The number of characters in your favourites actor's name ${favouriteActor.length}")
    } else {
        println("You didn't input the name!")
    }

    val lengthOfName = favouriteActor?.length ?: 0

    println("The number of character is: ${lengthOfName}")
}