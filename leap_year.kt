fun main() {
    var year: Int = 2024
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)){
        println("Leap Year")
    }
    else{
        println("Not a Leap Year")
    }
}