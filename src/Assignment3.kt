import java.util.*

fun main() {
    name()
    cities()
    numbers()
  var x=(Arrays.toString(myNames("Nancy","Caitlin","Brian")))
    println(x)
}
fun name(){
    var namesArray=arrayOf("Betty","Zida","Wamani","Nancy")
    println(Arrays.toString(namesArray))
}
fun cities(){
    var cities= arrayOf("Harare","Mumbai","Dodoma","Jakarta")
    var sortedCities=cities.sortedArray()
    println(Arrays.toString(sortedCities))
}
fun numbers(){
    var numbersArray= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var total= numbersArray[2]+numbersArray[5]
    println(total)
    var index=numbersArray.indexOf(158)
    println(index)
    var sortedNumbersArray=numbersArray.sortedArray()
    println(Arrays.toString(sortedNumbersArray))
}
fun myNames(a:String,b:String,c:String):Array<String>{

    var result= arrayOf(a,b,c)

    return result
}