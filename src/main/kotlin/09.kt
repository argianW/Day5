//Saringlah data berikut agar outputnya menjadi hanya orang-orang di bawah 21 tahun.
//const people = [
//{ id: 1, name: 'Udin', age: 12 },
//{ id: 2, name: 'Wati', age: 51 },
//{ id: 3, name: 'Budi', age: 34 },
//{ id: 4, name: 'Agus', age: 16 },
//{ id: 5, name: 'Sari', age: 19 },
//{ id: 6, name: 'Ririn', age: 21 },
//]
//Contoh output
//[
//{ id: 1, name: 'Udin', age: 12 },
//{ id: 4, name: 'Agus', age: 16 },
//{ id: 5, name: 'Sari', age: 19 },
//]

data class People(var id: Int, var nama: String, var age: Int)

fun main() {
    var peoole: ArrayList<People> = ArrayList()
    peoole.add(People(1,"Udin", 12))
    peoole.add(People(2, "Wati", 51))
    peoole.add(People(3, "Budi", 34))
    peoole.add(People(4, "Agus", 16))
    peoole.add(People(5, "Sari", 19))
    peoole.add(People(6, "Riri", 21))

    var filterPeople = peoole.filter { it.age <= 21}
    println(filterPeople)
}
