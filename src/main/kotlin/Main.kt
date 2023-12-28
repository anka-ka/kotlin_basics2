import java.util.*

fun main() {
    println("Введите колиство лайков")
    val scan = Scanner(System.`in`)
    val input = scan.nextInt()
    val likes = input % 10
    if (likes == 1) {
        println("Понравилось $input человеку")
    } else {
        println("Понравилось $input людям")
    }
}

