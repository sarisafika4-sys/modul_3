// Parent class
open class Mahasiswa(
    var nama: String,
    var nim: String
) {
    open fun tampil() {
        println("Nama : $nama")
        println("NIM  : $nim")
    }
}

// Child class (Inheritance)
class MahasiswaAktif(
    nama: String,
    nim: String,
    var jurusan: String
) : Mahasiswa(nama, nim) {

    override fun tampil() {
        super.tampil()
        println("Jurusan : $jurusan")
    }
}

// Main program
fun main() {
    val mhs1 = Mahasiswa("Sari", "12345")
    val mhs2 = MahasiswaAktif("Budi", "67890", "Informatika")

    println("=== Data Mahasiswa ===")
    mhs1.tampil()

    println("\n=== Data Mahasiswa Aktif ===")
    mhs2.tampil()
}