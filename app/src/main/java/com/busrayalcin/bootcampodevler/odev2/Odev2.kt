package com.busrayalcin.bootcampodevler.odev2

class Odev2 {

    //Girilen dereceyi fahrenheit'a dönüştüren metot
    fun soru1(sicaklikDerece:Double) : Double {
        return sicaklikDerece * 1.8 + 32
    }

    //Kenarları parametre olarak girilen dikdörtgenin çevresini hesaplayan metot
    fun soru2(kisaKenar:Double, uzunKenar:Double) : Double {
        return 2 * (kisaKenar + uzunKenar)
    }

    //Girilen değerin faktöriyelini hesaplayan metot
    fun soru3(sayi:Int) : Int {
        var faktoriyel = 1
        var n = sayi

        while (n > 1) {
            faktoriyel *= n
            n--
        }
        return faktoriyel
    }

    //Girilen kelime ve harf için harfin kelime içinde kaç adet olduğunu gösteren metot
    fun soru4(kelime:String, harf:Char) : Int {
        var sayac = 0
        for (i in 0 until kelime.length){
            if(kelime[i] == harf){
                sayac++
            }
        }
        return sayac
    }




}