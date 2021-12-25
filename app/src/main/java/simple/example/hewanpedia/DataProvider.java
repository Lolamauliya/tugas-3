package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.kurakura;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<kurakura> initDataKurakura(Context ctx) {
        List<kurakura> kurakuras = new ArrayList<>();
        kurakuras.add(new kurakura("cherry_head", "Paraguay",
                "kura-kura Cherry Head yang tergolong ke dalam jenis hewan omnivora ini mampu mengonsumsi mulai dari dedaunan, sayur-sayuran, buah-buahan, cacing, hingga serangga.", R.drawable.kura_cherry_head));
        kurakuras.add(new kurakura("forsteni", "Sulawesi selatan, indonesia",
                "Walau tergolong kura-kura darat, ternyata jenis kura-kura eksotis ini lebih menyukai habitat dengan kondisi lembab, misal di dekat aliran sungai.", R.drawable.kura_forsteni));
        kurakuras.add(new kurakura("leopard", "Benua afrika",
                "Sebagai hewan herbivora, pakan dari kura-kura Leopard umumnya berupa dedaunan, sayur-sayuran, dan buah-buahan, nih.", R.drawable.kura_leopard));
        kurakuras.add(new kurakura("sulcata", "Gurun Afrika",
                "Jenis kura-kura darat ini punya ciri khas tempurung berwarna kuning dan punya karakteristik sangat keras. Kura-kura Sulcata pun tergolong salah satu spesies kura-kura darat terbesar di dunia", R.drawable.kura_sulcata));
        kurakuras.add(new kurakura("aligator", "amerika utara",
                "Bukan hanya penampilannya saja, jenis kura-kura ini juga memiliki temperamen yang agresif dan tidak ragu untuk menggigit jika merasa terancam dengan kondisi di sekitarnya.", R.drawable.kura_indian));
        kurakuras.add(new kurakura("indian", "Asia selatan",
                "Ukuran dari kura-kura Indian Star juga tergolong kecil, yakni mulai 17-30 centimeter. Spesies kura-kura darat ini juga mampu bertahan hidup hingga 80 tahun, dengan rata-rata 30-55 tahun sebagai peliharaan.", R.drawable.kura_aligator));

        return kurakuras;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("netherland_dwarf", "belanda",
                "kelinci yang berasal dari belanda dengan berat 1,1-2,5 pon,Dwarf belanda adalah satu ras kelinci terkecil ", R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci("orictolagus_cuniculus", "eropa",
                "kelinci orictolagus cuniculus juga disebut kelinci eropa atau kelinci domestik adalah satu satunya spesies dalam genusnya", R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci("holland_lop", "belanda",
                "kelinci jenis holland lop adalah kelinci yang independent dan playfull", R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci("mini_lop", "jerman",
                "Adalah jenis kelinci domestik yang di akui oleh american rabbit association ", R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci("raksasa", "belgia",
                "jenis kelinci domestik yang sangat besar,biasanya dianggap sebagai jenis terbesar dari spesiesnya ", R.drawable.kelinci_raksasa));
        kelincis.add(new Kelinci("rex", "prancis",
                "kelinci ini mempunyai tubuh yang besar,telinga yang tegak,dan ciri khas yang menjadikan kelinci rex ini di sukai adalah bulunya yang seperti karpet ", R.drawable.kelinci_rex));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataKurakura(ctx));
        hewans.addAll(initDataKelinci(ctx));
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
