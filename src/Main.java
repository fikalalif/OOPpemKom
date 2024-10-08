class Kaka {
    String nama = "Wisnu";
    public void fungsi() {
        System.out.println("minta duit!");
    }
}

class Person extends Kaka{
    final String adik1 = "nanang";
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
        Person Adk = new Person();
        Adk.setAdik("John");
        Adk.fungsi();

        System.out.println(Adk.getAdik());
        System.out.println(Adk.adik1);
        System.out.println(Adk.adik1+" "+ Adk.nama );
    }
}