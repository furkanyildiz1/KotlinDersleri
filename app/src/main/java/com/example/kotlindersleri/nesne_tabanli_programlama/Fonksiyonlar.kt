package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {
    //void - sadece işlem yapan

    fun selamla1() { //swift-func
        val sonuc = "merhaba ahmet"
        println(sonuc)
    }

    //return -hem işlem yapan hem veri transferi yapan

    fun selamla2() : String {
        val sonuc = "merhaba ahmet"
        return sonuc
    }

    //parametreli

    fun selamla3(isim:String) {
        val sonuc = "merhaba $isim"
        println(sonuc)
    }

    //Overloading
    //bir sınıf içinde aynı isimdeki fonksiyonalrı tekrardan kullanmak
    //TRÜLERİ FARKLI OLABİLİR
    //TRÜLERİ DEĞÜİŞTİRMEDEN BAŞKA BİR PARAMETRE EKLENEBİLİR

    fun topla(sayi1:Int, sayi2:Int){
        println("toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Double, sayi2:Double){
        println("toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int, sayi2:Int, isim:String){
        println("toplam: ${sayi1+sayi2} - islem yapan $isim")
    }


}