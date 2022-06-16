package com.busrayalcin.bootcampodevler.odevler

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


    //Girilen kenar sayısına göre iç açılar toplamını hesaplayan metot
    fun soru5(kenarSayisi:Int) : Int {
        return (kenarSayisi - 2) * 180
    }


    //Girilen gün sayısına göre maaş hesabı yapan metot
    fun soru6(gun:Int) : Int {
        val calismaSaati = 8
        var maas = 0
        if (gun > 20){
            maas = 1600 + (gun - 20) * 20 * calismaSaati
        }else{
            maas = gun * 10 * calismaSaati
        }
        return maas
    }


    //Girilen kota değerine göre ücreti hesaplayan metot
    fun soru7(kota:Int) : Int {
        var ucret = 100
        if (kota > 50){
            ucret += (kota - 50) * 4
        }
        return ucret
    }

}