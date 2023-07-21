fun main(args: Array<String>) {
    print("Enter The Number:")
    val number: Int = readln().toInt()
    val factorial = fact(number)
    println("By Tailrec Keyword,Factorial of $number = $factorial")
}

tailrec fun fact(num: Int,temp: Int=1): Int {
    return if(num == 1){
        temp
    }
    else{
        fact(num-1 ,temp*num)
    }
}




