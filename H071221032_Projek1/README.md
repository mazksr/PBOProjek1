com.config.Config #menyediakan konfigurasi koneksi database. Program ini mengatur parameter koneksi untuk terhubung ke database MySQL.
com.controllers.DBController #berfungsi sebagai pengontrol untuk berinteraksi dengan tabel database "tb_produk". Kelas ini mewarisi kelas "Config" yang menyediakan konfigurasi koneksi database.

#Untuk Insert, edit, delete, dan read data
com.layout.Delete 
com.layout.Edit
com.layout.Insert
com.layout.Read

com.layout.Menu #Menu utama (CLI)

com.models.Product #Merepresentasikan blueprint produk dalam suatu sistem. Memiliki beberapa atribut yang mendefinisikan karakteristik produk seperti id, nama, harga, dan jumlah produk.

com.MainApp #Berisikan method main untuk memanggil interface menu.