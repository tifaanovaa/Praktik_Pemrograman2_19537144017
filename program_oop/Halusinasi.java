
class BTS {
    private String nama;
    private int umur;
    private String namacowo;

    public void tambah (String nama, int umur, String namacowo) {
        this.nama = nama;
        this.umur = umur;
        this.namacowo = namacowo;
    }

    public void detail() {
        System.out.println("Nama saya "+this.nama+", umur saya "+this.umur+" tahun dan punya pacar yg ganteng namanya "+this.namacowo+"");
    }
}

public class Halusinasi {
    public static void main(String[] args) {
        BTS ganteng = new BTS();
        ganteng.tambah ("Tifa", 19 , "Taehyung");
        ganteng.detail();
    }
}