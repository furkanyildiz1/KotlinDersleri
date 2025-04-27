package com.example.kotlindersleri.nesne_tabanli_programlama

data class Yemekler(var id:Int , var ad:String , var fiyat:Int) {

    //constructor-init
    //bu sınıftan nesne oluştuğunda çalışsın
    init {
        println("*******nesne oluştu******")
    }

    fun bilgiAl(){
        println("Id: ${id}") //this bulunduğu sınıfı temsil eder this.id olabilir
        println("ad: ${ad}")
        println("fiyat: ${fiyat}")
    }

//sınıf içindeki super: ifadesi kalıtım ile bir üst sınıfı temsil eder


}