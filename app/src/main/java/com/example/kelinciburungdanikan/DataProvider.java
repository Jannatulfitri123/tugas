package com.example.kelinciburungdanikan;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.kelinciburungdanikan.model.Kelinci;
import com.example.kelinciburungdanikan.model.Hewan;
import com.example.kelinciburungdanikan.model.Burung;
import com.example.kelinciburungdanikan.model.Ikan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("anggora", "turkey",
                "Kelinci ini berasal dari Ankara, Turki. Kelinci anggora mulai dikenal oleh publik luar Turki setelah pada tahun 1723, kelinci ini dikenalkan di Perancis oleh para pelaut Inggris.", R.drawable.ankara));
        kelincis.add(new Kelinci("Dutch", "Belanda",
                "Kelinci Belanda atau yang sering juga disebut dengan kelinci dutch memiliki keunikan pada bulunya. Kelinci yang berasal dari Belanda ini dikenal dengan keanekaragaman warna bulu, meskipun bulunya cukup pendek. ", R.drawable.dutch));
        kelincis.add(new Kelinci("Dwart", "netherland",
                "Kelinci natherland dwarf, Kelinci ini mungil, beratnya hanya 490 gram sampai 1,1 kilogram dan bisa bertahan hidup hingga usia 10-12 tahun apabila dirawat dengan baik.", R.drawable.dutch));
        kelincis.add(new Kelinci("holland pop", "Belanda",
                "Holland lop termasuk dalam kategori kelinci kerdil. Sebab, beratnya hanya 900 gram sampai 1,8 kilogram, tutur laman Pet Helpful. Kelinci ini bisa dikenali dari telinganya yang jatuh ke bawah, kepala bulat, dan rambut tebal.", R.drawable.hollandpop));

        return kelincis;
    }


    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("Lovebird", "madagaskar",
                "Burung lovebird Sebagian besar spesies Lovebird berasal dari Afrika dan sisanya dari Madagaskar. Nama burung cinta ini diamati dari karakter Lovebird yang kerap berdekatan dan saling mencintai satu sama lain.",R.drawable.lovebird));
        burungs.add(new Burung("Jalak", "Indonesia",
                "Burung Jalak putih berasal dari Indonesia. burung Jalak Putih merupakan burung yang masuk dalam keluarga Sturnidae.",R.drawable.jalak));
        burungs.add(new Burung("red vector","Indonesia",
                "Burung red vector kenari berasal dari Indonesia. Burung ini mempunyai kicauan gacor dan bulu yang indah", R.drawable.redvektor));
        burungs.add(new Burung("Cendrawasih", "Irian tenggara",
                "Burung yang berasal dari Irian Tenggara ini memiliki ukuran lebih panjang dari si Kuning Kecil tadi, yakni berukuran 34 cm.", R.drawable.cendrawasih));
        return burungs;
    }
    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan("butterfly", "samudra pasifik dan hindia",
                "Namanya butterflyfish atau ikan kupu kupu. Ia masuk kelompok ikan laut tropis dari keluarga Chaetodontidae dan banyak ditemukan di sekitar terumbu karang di laut Atlantik, Hindia dan Samudra Pasifik.", R.drawable.butterfly));
        ikans.add(new Ikan("zebrasoma", "hawai",
                "Ikan jenis ini dapat ditemukan di daerah terumbu karang yang dangkal dengan kedalamannya sekitar 2 sampai 46 m", R.drawable.zebarasoma));
        ikans.add(new Ikan("Ikan Badut", "samudra pasifik",
                "Ikan badut merupakan ikan karang tropis yang hidup diperairan hangat pada daerah terumbu karang dengan kedalaman kurang dari 50 cm dan berair jernih", R.drawable.badut));
        ikans.add(new Ikan("Paracanthurus hepatus", "pasifik",
                "Ikan ini menyebabkan keracunan jika dimakan manusia, tetapi banyak dicari sebagai ikan hias. ", R.drawable.zebarasoma));
        ikans.add(new Ikan("firefish", "filipina",
                "Firefish merupakan ikan akuarium karang yang populer karena tahan terhadap penyakit. Ikan ini berasal dari filipina", R.drawable.firefish));
        return ikans;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKelinci(ctx));
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataIkan(ctx));
    }
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}