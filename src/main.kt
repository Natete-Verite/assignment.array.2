fun main(){
    multiply(arrayOf(1,2,3,4,5,6))
    println(anette(arrayOf("Verite",0.23,0.234F,123,true,"chair")))
     var a=calls(arrayOf('k','o','t','l','i','n','a','e','z','u'))
    println(a)

}
fun multiply(numbers:Array<Int>):Int{
    var product = 1
    numbers.forEach { numb->
        product*=numb
    }
    println(product)
    return product
}
fun anette(count:Array<Any>):Double {
    var sum = 0.00
    count.forEach { numb ->
        if (numb is Float|| numb is Double) {
            sum += numb.toString().toDouble()
        }
    }
    return sum
}
fun calls(vowel:Array<Char>):Int{
    var room = 0
    vowel.forEach { phel->
        if (phel =='a'|| phel =='e' || phel =='i' || phel =='o' || phel == 'u'){
            room++
        }
    }
    return room
}
