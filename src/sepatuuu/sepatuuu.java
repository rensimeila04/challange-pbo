package sepatuuu;

public class sepatuuu {

    int size;
    String Merk, Warna, jenis, kategori;

    public sepatuuu(int size) {
        this.size = size;
    }

    

    public void merk(String Merk) {
        this.Merk = Merk;
    }

    public void warna(String Warna) {
        this.Warna = Warna;
    }

    public void jenis(String jenis) {
        this.jenis = jenis;

    }

    public void kategori(String kategori) {
        this.kategori = kategori;

    }
    public void showSepatuuu(){
        System.out.println("=====Silahkan pilih size yang sesuai=====");
        System.out.println("25,\t26,\t27,\t28,\t29\n30,\t31,\t32,\t33,\t34");
        
    }
    public void showMerk(){
        System.out.println("=====Silahkan pilih merk yang anda inginkan=====");
        System.out.println("1. 910\t2. Adidas\t3. Nike\n4. Skechers\t5. Puma\t6. Reebok\n7. Vans\t8. converse\t9. fila");
        
    }
    public void showWarna(){
        System.out.println("====Silahkan memilih warna=====");
        System.out.println("1. Black\t2. White\t3. gold\t4. silver\n5. orange\t6. green\t7. yellow\t8. blue\t9. red");
        
    }
    public void showJenis(){
        System.out.println("Jenis Sepatu");
        System.out.println("1. Cowok\n2. Cewek");
       
        
    }
    public void showkategori(){
        System.out.println("=====Silahkan Pilih Kategori Sepatu yang Anda inginkan=====");
        System.out.println("1. Olahraga\n2. Lari\n3. Santai\n4. Kantoran");
        
        
    }
    public void Nota(){
        
        
    }

}
