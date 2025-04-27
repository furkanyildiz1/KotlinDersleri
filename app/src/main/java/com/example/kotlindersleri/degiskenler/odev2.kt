package com.example.kotlindersleri.degiskenler



fun derecetofahrenayt(Derece:Double) : Double{
    return Derece*1.8+32
}

fun dikdortgenhesabi(Kısakenar:Int,Uzunkenar:Int):Int{
    return 2*(Kısakenar+Uzunkenar)
}

fun faktoriyel(sayi:Int):Int{
    var sonuc=1
    for(i in 1..sayi){
        sonuc *=i
    }
    return sonuc
}

fun Harfbul(kelime:String):Int{
    var sayac=0
    for(harf in kelime){
        if(harf=='a' || harf=='A' )
            sayac++
    }
    return sayac
}

fun AcılarTopla(Kenarsayisi:Int):Int{
    return (Kenarsayisi-2)*180
}

fun MaasHesabı(gunsayisi:Int):Int{
    var toplamsaat=gunsayisi*8
    var normalsaatucret=10
    var mesaisaat=0
    var toplammaas=0
    if(toplamsaat >160){
        mesaisaat=toplamsaat-160
        toplammaas=normalsaatucret*8+mesaisaat*20
    }else{
        toplammaas=toplamsaat*10
    }
    return toplammaas
}

fun ucrethesabı(Kotamik:Int):Int{
    return if(Kotamik <= 50 ){
        100
    }else{
        100 + (Kotamik-50)*4
    }
}

fun main(){
    val x=derecetofahrenayt(25.4)
    println(x)

    val y= dikdortgenhesabi(5,10)
    println(y)

    val z= faktoriyel(4)
    println(z)

    val k= Harfbul("furkan")
    println(k)

    val s= AcılarTopla(4)
    println(s)

    val e= MaasHesabı(30)
    println(e)

    val f= ucrethesabı(51)
    println(f)
}

