fun main() {
    var a: Int = 11
    var b: Int = 4
    var c: Int = 9

    if( a > b && a > c){
        println("The largest number is $a")
    } else if( b > a && b > c){
        println("The largest number is $b")
    } else if( c > b && c > a){
        println("The largest number is $c")
    }
}