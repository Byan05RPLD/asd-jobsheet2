public class DosenMain03 {  
    public static void main(String[] args) {  
        
        Dosen03 d1 = new Dosen03();  
        d1.tampilInformasi();  
        int masaKerjad1 = d1.hitungMasaKerja(2025);  
        System.out.println("Masa kerja " + d1.getNamaDosen() + " adalah: " + masaKerjad1 + " tahun.");  
        
        System.out.println();

        Dosen03 d2 = new Dosen03("D001", "Dr. Joko Sudarmo", true, 2013, "Teknik Informatika");  
        d2.tampilInformasi();  

        d2.setStatusAktif(false);  

        int masaKerjad2 = d2.hitungMasaKerja(2025);  
        System.out.println("Masa kerja " + d2.getNamaDosen() + " adalah: " + masaKerjad2 + " tahun.");  
        d2.ubahKeahlian("Data Science");  
        System.out.println("Bidang terbaru " + d2.getNamaDosen() + ": " + d2.getBidang());  
    }  
}