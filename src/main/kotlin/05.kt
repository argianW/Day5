//Buatlah script untuk mencetak dengan rentang angka tertentu.
//
//Contoh
//Input pertama: 4
//Input kedua: 8
//Output di browser: 4, 5, 6, 7, 8

fun main() {
    var a = readLine()!!
    var b = readLine()!!
    var c = a.toInt()
    var d = b.toInt()

    for (i in c..d) {
        println(i)
    }
}