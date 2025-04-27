package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

class Kedi : Memeli() {
    override fun sesCikar() {
        //super.sesCikar(),,,,,,,,super: kalıtım ile üst sınıfı temsil eder =memeli
        println("miyav")
    }
}