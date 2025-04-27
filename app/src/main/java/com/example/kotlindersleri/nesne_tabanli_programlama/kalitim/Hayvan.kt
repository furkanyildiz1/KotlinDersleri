package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

open class Hayvan {
    //override = interface ve kalıtımda kullanılır (farklı calssalrda aynı fonk
    //kullanmamişidir kullanılan fonksşiyonun başına open eklenir)

    open fun sesCikar(){
        println("ses çıkar")
    }
}