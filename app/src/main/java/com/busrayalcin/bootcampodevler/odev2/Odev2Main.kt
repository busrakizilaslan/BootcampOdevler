package com.busrayalcin.bootcampodevler.odev2

fun main() {
    var odev2 = Odev2()
    var sicaklikDerece = 44.4
    var sicaklikFahrenheit = odev2.soru1(sicaklikDerece)
    println("Sıcaklık Derece : $sicaklikDerece Fahrenheit : $sicaklikFahrenheit")

    println("--------------------------------------------")


    var cevre = odev2.soru2(17.17,44.44)
    println("Dikdörtgenin Çevresi : $cevre")

    println("--------------------------------------------")


    var sayi = 5
    var faktoriyel = odev2.soru3(sayi)
    println("Girilen Sayı : $sayi  Faktöriyel Değeri : $faktoriyel")

    println("--------------------------------------------")


    var kelime = "araba"
    var harf = 'a'
    var sonuc = odev2.soru4(kelime,harf)
    println("Girilen Kelime : $kelime  Aranan Harf : $harf  Adet : $sonuc")

    println("--------------------------------------------")






}