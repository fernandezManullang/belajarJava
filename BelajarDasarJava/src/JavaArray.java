public class JavaArray {
    public static void main(String[] args) {
        
        String []  arrayString;
        arrayString = new String[3];
        arrayString[0] = "Irfan";
        arrayString[1] = "Fernandez";
        arrayString[2] = "Manullang";


        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

         // another method
         String [] namaSaya = {
            "Irfan", "Fernandez", "Manullang"
        };

        System.out.println(namaSaya[0]);

        // Array Initializer
        int [] arrayInt = new int[]{
            22,24,26,28,30
        };
        System.out.println(arrayInt[3]);

        long [] arrayLong ={
            32,34,36,38,40
        };
        System.out.println(arrayLong[0]);
        // mengubah nilai dalam aaray
        arrayLong[1] = arrayLong[1] * 4;
        System.out.println(arrayLong[1]);
        // mengetahui panjang dari array
        System.out.println(arrayLong.length);

        // Menggunakan Array dalam Array
        String [][][] members ={{
            {"Irfan","Diego", "Budi"}, 
            {"Fernandez", "Elmando", "Harsel"}, 
            {"Nover"}, 
            {"Manullang", "Berutu"}
        }};

        System.out.println(members[0][0][1]);
        System.out.println(members[1][0][1]);
        System.out.println(members[3][0][0]);

        gambarPola();

    }

      // Membuat Pola Gambar menggunakan array
      static void gambarPola(){
        int tinggi = 10;
        int lebar = 10;
        for(int i = 0; i < tinggi; i++ ){
            System.out.print(" *");
        }
        System.out.println();
      }
}
