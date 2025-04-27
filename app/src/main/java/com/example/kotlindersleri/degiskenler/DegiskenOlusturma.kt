package com.example.kotlindersleri.degiskenler

import kotlin.reflect.typeOf

fun main() {
    var id = 1
    var ad = "mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum = true

    println("ID: $id")
    println("ad: $ad")
    println("resim: $resim")
    println("puan: $puan")
    println("fiyat: $fiyat")
    println("stokDurum: $stokDurum")


    //Sabitler=Constant=değeri daha sonra değişmeyen

    var sayi= 30
    sayi=100
    println(sayi)

    val numara=50 //val sabit demektir
    println(numara)
    //var esnek bir yapıda olduğu için val kullanmak performans açısından daha iyidir

    //TÜR DÖNÜŞÜMLERİ
    //1-Sayısaldan sayısala
    val d = 89.56
    val i = 34
    val sonuc2 = i.toDouble()
    println(sonuc2)
    val sonuc1 = d.toInt()
    println(sonuc1)

    //2-Sayısaldan metne çevirme
    var x = 85
    val sonuc3 = x.toString()//"85"
    println(sonuc3)

    //3-Metinden sayısla çevirme
    val yazi="48"//"48T" yazarsak hata alırız string ifade var
    val sonuc4=yazi.toInt()
    println(sonuc4)

    var yazi1="48t"
    var sonuc5=yazi1.toIntOrNull()
    if(sonuc5 != null){
        println(sonuc5)
    }else{
        println("null olur")
    }



}