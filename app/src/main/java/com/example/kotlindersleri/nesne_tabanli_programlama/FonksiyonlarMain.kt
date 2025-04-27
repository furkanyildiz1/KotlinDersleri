package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){
    val f=Fonksiyonlar()//Fonksiyonlar classını adı yazılmalı

    //VOİD OLAN =unit
    f.selamla1()

    //return=string yani veri transeferi olucak fonksiyonlar classından
    val gelenSonuc=f.selamla2()
    println("gelen sonuc: $gelenSonuc")

    //paraemtreyi verdim
    f.selamla3("zeynep")

    f.topla(10,20,"beyza")
}