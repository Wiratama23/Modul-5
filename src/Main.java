
import java.util.*;

public class Main {
    static ArrayList<String> alamat = new ArrayList<>();
    static ArrayList<Integer> luas = new ArrayList<>();
    static ArrayList<Integer> panjang = new ArrayList<>();
    public static void daftar(){
        dinasPertanahan tanah = new dinasPertanahan();
        Scanner input = new Scanner(System.in);
        boolean out = false;
        do{
            boolean error = true;
            System.out.println("\n====================");
            System.out.println("1. Daftar\n2. Munculkan Data\n3. Keluar");
            System.out.print("Pilih : ");
            int k = input.nextInt();
            if(k == 1){
                do{
                    input.nextLine();
                    try{
                        System.out.println("\nPendaftaran tanah by Dinas Pertanahan");
                        System.out.print("Lokasi tanah\t : ");
                        tanah.setAlamat(input.nextLine());
                        System.out.print("Luas Tanah\t\t : ");
                        tanah.setLuas_Tanah(input.nextInt());
                        System.out.print("Panjang Tanah\t : ");
                        tanah.setPanjang_Tanah(input.nextInt());

                        alamat.add(tanah.getAlamat());
                        luas.add(tanah.getLuas_Tanah());
                        panjang.add(tanah.getPanjang_Tanah());
                        error = false;

                    }catch (InputMismatchException e){
                        System.out.println("Error : "+e);
                    }

                }while(error);
            } else if (k == 2) {
                do{
                    try{
                        System.out.println("Jumlah data : "+alamat.size());
                        System.out.println("Masukkan berapa banyak data yang ingin di tampilkan");
                        System.out.print("Jumlah : ");
                        int p = input.nextInt();
                        p--;
                        for(int i =0 ; i <= p;i++){
                            System.out.println("\n====================");
                            System.out.println("Data ke "+ (i+1));
                            System.out.println("Alamat\t : "+ alamat.get(i));
                            System.out.println("Luas\t : "+ luas.get(i));
                            System.out.println("Panjang\t : "+ panjang.get(i));
                        }
                        error = false;
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Error : "+e);
                    }
                }while(error);

            }else{
                out = true;
            }
        }while(!out);

    }

    public static void main(String[] args) {
        daftar();
    }
}
