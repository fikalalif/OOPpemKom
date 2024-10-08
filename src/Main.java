class Keluarga {
    String ayah;

    public void fungsi() {
        System.out.println("menyiram tanaman");
    }
    void panggilAyah(String ayah){
        this.ayah = ayah;
    }
}

class Anak extends Keluarga{
    final String adik1 = "Nanang";
    private String adik;

    // Getter
    public String getAdik() {
        return adik;
    }

    // Setter
    public void setAdik(String newAdik) {
        this.adik = newAdik;
    }
}


public class Main {
    public static void main(String[] args) {
        Anak Adk = new Anak();
        Adk.setAdik("Dudung");
        Adk.ayah = "wisnu";

        System.out.println("adik pertama : " + Adk.adik1);
        System.out.println("adik kedua : " + Adk.getAdik());
        System.out.println("ayah : " + Adk.ayah);
        Adk.fungsi();
    }
}