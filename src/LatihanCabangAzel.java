public class LatihanArrayAzel {
    public static void main(String[] args) {
        /*
            buat array untuk menyimpan nama murid smpn55.
            (Fika, Bintang, Qila, Junaedi, Alen)

            setelah itu panggil murid-murid nya pake sout
         */

        /*
            buat array untuk menyimpan nama buah
            beri nama variabel array nya buah
            (Alpukat, Mangga, Strawbery, Anggur)
            Output: Alpukat, Mangga, Strawbery, Anggur

            Setelah itu tampilkan seluruh buah pakai sout
            Jika berhasil ganti buah Mangga jadi buah 'Naga'
            Sehingga tampilan programnya menjadi seperti dibawah ini
            (Alpukat, Naga, Strawbery, Anggur)
            Output: Alpukat, Mangga, Naga, Anggur

        */
        String [] buah ={
                "Alpukat",
                "Mangga",
                "Strawberry",
                "Anggur"

        };
        System.out.println( buah[0]);
        System.out.println( buah[1]);
        System.out.println( buah[2]);
        System.out.println( buah[3]);

        buah[1] = "Naga";

        System.out.println( buah[0]);
        System.out.println( buah[1]);
        System.out.println( buah[2]);
        System.out.println( buah[3]);

        /*
            1. Buat variabel array untuk menampung stok indomie di toko herna
                (2, 3, 5, 1)
                setelah itu tolong hitung total stok indomie nya
                output: total stok indomie = ?

            2. Hari ini, stok indomie toko herna berkurang karena digigitin tikus.
               Sehingga stok berkurang 3.
               Berapakah total stok indomie terbaru saat ini
               output: total stok indomie = ?
         */
        int indomieTikus = 3;


    int[] indomie = { 2 ,3 ,5 , 1 };

        System.out.println( indomie [0]);
        System.out.println( indomie [1]);
        System.out.println( indomie [2]);
        System.out.println( indomie [3]);




    }
}
