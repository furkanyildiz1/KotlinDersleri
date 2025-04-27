package com.example.kotlindersleri.standart_programlama

fun main(){
//for döngüsü
    for (i in 1..3){
        println("Döngü 1 : $i")
    }

    //10 ile20 arasuında b5 er artış

    for( x in 10..20 step 5){
        println("Döngü 2 : $x ")
    }

    for( x in 20 downTo  10 step 5){
        println("Döngü 3 : $x ")
    }
//while döngüsü
    var sayac = 1

    while(sayac < 4){
        println("döngü 4 : $sayac")
        sayac++
    }
}