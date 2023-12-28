import java.util.*

fun main() {
    println("Введите колиство лайков")
    val likes = readln().toInt()
    if (likes % 100 == 11 || likes % 10 in 2..9 || likes % 10 == 0) {
        println("Понравилось $likes людям")
    } else if (likes % 10 == 1) {
        println("Понравилось $likes человеку")
    }
}

