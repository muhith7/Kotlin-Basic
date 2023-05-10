package tipeData

fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiUkm = 90

    val syaratLulusUJian = nilaiUjian > 75
    val syaratLulusAbsen = nilaiAbsen > 75
    val syaratLulusUkm = nilaiUkm > 75

    val apakahLulus = syaratLulusUJian && syaratLulusAbsen && syaratLulusUkm
    //val apakahLulus = ( syaratLulusUJian && syaratLulusAbsen ) && syaratLulusUkm
    //val apakahLulus = (( syaratLulusUJian && syaratLulusAbsen ) && syaratLulusUkm )
    //Operasi Logika dikerjakan dari kiri selalu
    println(apakahLulus)
}