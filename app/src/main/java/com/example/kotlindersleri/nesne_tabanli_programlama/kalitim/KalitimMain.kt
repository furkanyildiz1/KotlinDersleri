package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main(){
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kopek= Kopek()
    val kedi=Kedi()

    hayvan.sesCikar() //kalıtım yok kendi methoduna erişti
    memeli.sesCikar() //önce kendine bakar kendinde yoksa üst sınıfta bu fonk varsa ona erişir, kalıtım var
    kopek.sesCikar() //kalıtım var kendi methoduna erişti
    kedi.sesCikar()  //kalıtım var kendi methoduna erişti

}