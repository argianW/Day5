//Buatlah script yang dapat menghilangkan "Jambu" yang terdapat pada array berikut
//
//const fruits = ['Jeruk', 'Pepaya', 'Jambu', 'Anggur', 'Melon']

fun main() {
    var data: ArrayList<String> = arrayListOf("Jeruk", "Pepaya", "Jambu", "Anggur", "Melon")
    data.remove("Jambu")
//    data.removeAt(2)
    for (i in data){
        println(i)
    }
}