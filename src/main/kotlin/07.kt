//Add to Array
//Buatlah script untuk menambahkan kata "Handuk" ke awal array, dan "Celana" ke akhir array.
//
//const stuff = ['Meja', 'Buku', 'Topi', 'Baju', 'Kayu']

fun main() {
    var data: ArrayList<String> = arrayListOf("Meja", "Buku", "Topi", "Baju", "Kayu")
    data.add(0, "Handuk")
    data.add("Celana")
    for (i in data) {
        println(i)
    }
}