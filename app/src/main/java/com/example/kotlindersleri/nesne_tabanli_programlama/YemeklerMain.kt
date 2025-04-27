package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){
    //nesne oluşturma
    val y1 = Yemekler(100,"köfte", 249)
    //değer okuma
    y1.bilgiAl()

    //değer değiştirme

    y1.fiyat=350
    y1.bilgiAl()


    val y2 = Yemekler(200,"baklava" , 300)
    y2.bilgiAl()


}