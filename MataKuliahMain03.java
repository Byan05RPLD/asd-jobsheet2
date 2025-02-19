public class MataKuliahMain03 {
    public static void main(String[] args) {  

        
        MataKuliah03 mk1 = new MataKuliah03();    
        MataKuliah03 mk2 = new MataKuliah03("MK001", "Algoritma", 3, 4);  
        
        System.out.println();
        mk1.tampilInformasi();  
        mk2.tampilInformasi();   
        mk2.ubahSKS(4);    
        mk2.tambahJam(2);  
        mk2.kurangiJam(1);  
        mk2.kurangiJam(10); 
    }
}

