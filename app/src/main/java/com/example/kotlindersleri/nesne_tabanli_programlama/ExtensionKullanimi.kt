package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){
    //extension=genişletmek
    //varolan yapıya kendimize özgü yapılar ekleyrek onu genişletiriz
    //fonk dışı yazılıorher yerden erişim için
    val sonuc=5 carp 2// infix olmamış hali syntx = 5.carp(2) //this=5
    println(sonuc)
}

//ınt sınıfına carp fonk ekledik ve genişlettik o yüzden Int. ile devam ettik
infix fun Int.carp(sayi:Int) : Int {
    return this*sayi //this =bağlı olan ınt sınıfını temsil eder
}

