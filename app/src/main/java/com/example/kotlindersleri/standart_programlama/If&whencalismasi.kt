package com.example.kotlindersleri.standart_programlama

fun main(){
    val yas = 19

    if(yas >= 18){
        println("resitsiniz")
    }else{
        println("resit degilsiniz")
    }

    val ka = "adminx"
    val s = 1234567

    if (ka=="adminx" && s==123456 ){
        println("hoşgeldiniz")
    }else{
        println("hatali")
    }

    //when =switch

    val number =1

    when(number){
        1 -> println("sayi birdir")
        2 -> println("sayi ikidir")
        else -> println("tanımlanmayan sayi")
    }


}