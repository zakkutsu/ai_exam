/* This is a programming exam 1 created by Nasrul and Faiz about an online restaurant application. */

#include <iostream>
#include <string>
using namespace std;

string menu[15] = {"Dimsum","Bakpao","Capcay","Soto","Rawon","Bakso","Pecel","Rendang","Gulai Ayam","Tauco", "Balado Cumi","Nasi Oncom", "Gulai Ayam","Batagor","Lotek"};
int harga[15] = {10000,40000,15000,20000,25000,15000,15000,30000,25000,25000,15000,20000,25000,25000,15000};


int
main ()
{
  cout << "-----------------------------------------------------------\n";
  cout << "\tProgam Restoran Online Faiz Nasrul Sejahtera\n";
  cout << "-----------------------------------------------------------";


    int daftar, i, jumlah, pesan, makan[100], jarak, kurir;
    char ulang;
    string nama, provinsi, kota, kecamatan;
    double telp, pos, diskon;

//Input daftar masakan
do {
  cout << "\nDaftar Masakan\n";
  cout << "1.\tMasakan Cina\n";
  cout << "2.\tMasakan Jawa\n";
  cout << "3.\tMasakan Padang\n";
  cout << "4.\tMasakan Sunda\n";
  cout << "Silakan Pilih Jenis Masakan = ";
  cin >> daftar;

switch (daftar) {
    case 1 :
      
      cout << "\nSilakan Pilih Menu\n";
      cout << "=================================\n";
      cout << "Kode \tMenu \t\tHarga\n";
      cout << "=================================\n";
      cout << "1.\tDimsum \t\tRp.10.000\n";
      cout << "2.\tBakpao \t\tRp.5.000\n";
      cout << "3.\tCapcay \t\tRp.15.000\n";

      cout << "Masukkan jumlah menu yang akan dipesan = ";
      cin >> jumlah;
      cout << "Masukkan kode makanan yang akan dipesan :\n";
      for (int i = 0; i < jumlah; i++) {
    	  cout << "Makanan Ke-" << i + 1 << " = ";
    	  cin >> makan[i];
    	}
    break;
    
    
    case 2 :
      cout << "\nSilakan Pilih Menu\n";
      cout << "=================================\n";
      cout << "Kode\tMenu \tHarga\n";
      cout << "=================================\n";
      cout << "4.\tSoto  \tRp.20.000\n";
      cout << "5.\tRawon \tRp.25.000\n";
      cout << "6.\tBakso \tRp.15.000\n";
      cout << "7.\tPecel \tRp.15.000\n";
      cout << "Masukkan jumlah menu yang akan dipesan = ";
      cin >> jumlah;
      cout << "Masukkan kode makanan yang akan dipesan :\n";
      for (int i = 0; i < jumlah; i++) {
    	  cout << "Makanan Ke-" << i + 1 << " = ";
    	  cin >> makan[i];
    	}
    break;
    
    
    case 3 :
      cout << "\nSilakan Pilih Menu\n";
      cout << "=================================\n";
      cout << "Kode\tMenu \t\tHarga\n";
      cout << "=================================\n";
      cout << "8.\tRendang \tRp.30.000\n";
      cout << "9.\tGulai Ayam \tRp.25.000\n";
      cout << "10.\tTauco \t\tRp.25.000\n";
      cout << "11.\tBalado Cumi \tRp.15.000\n";
      cout << "Masukkan jumlah menu yang akan dipesan = ";
      cin >> jumlah;
      cout << "Masukkan kode makanan yang akan dipesan :\n";
      for (int i = 0; i < jumlah; i++) {
    	  cout << "Makanan Ke-" << i + 1 << " = ";
    	  cin >> makan[i];
    	}
    break;
    
    
    case 4 :
      cout << "\nSilakan Pilih Menu\n";
      cout << "=================================\n";
      cout << "Kode\tMenu \t\tHarga\n";
      cout << "=================================\n";
      cout << "12.\tNasi Oncom \tRp.20.000\n";
      cout << "13.\tGulai Ayam \tRp.25.000\n";
      cout << "14.\tBatagor \tRp.25.000\n";
      cout << "15.\tLotek \t\tRp.15.000\n";
      cout << "Masukkan jumlah menu yang akan dipesan = ";
      cin >> jumlah;
      cout << "Masukkan kode makanan yang akan dipesan :\n";
      for (int i = 0; i < jumlah; i++) {
    	  cout << "Makanan Ke-" << i + 1 << " = ";
    	  cin >> makan[i];
    	    } 
        }
        
    //input alamat penerima
    cout<<"================================\n";
    cout<<"Masukkan alamat penerima\n";
    cout<<"================================\n";
    cout<<"Nama = ";
    cin>>nama;
    cout<<endl;
    cout<<"Nomor = ";
    cin>>telp;
    cout<<endl;
    cout<<"Provinsi = ";
    cin>>provinsi;
    cout<<endl;
    cout<<"Kota = ";
    cin>>kota;
    cout<<endl;
    cout<<"Kecamatan = ";
    cin>>kecamatan;
    cout<<endl;
    cout<<"Kode Pos = ";
    cin>>pos;
    cout<<endl;
    cout<<"Jarak yang ditempuh kurir(per-KM) = ";
    cin>>jarak;
    cout<<endl;
    
    kurir=jarak*3000;
    
    //menghitung total
    int total=0;
    for(i=0; i<jumlah;i++){
        total=total+harga[makan[i]-1];
        }
    
    //menghitung diskon
    if (total>200000) {
        diskon=total*0.1;
    }
    else if(total>100000) {
        diskon=total*0.7;
    }
    else if(total>50000) {
        diskon=total*0.05;
    }

    //nota pembayaran
    cout<<"=================================================";
    cout<<"\n\t\tNota Pembayaran"<<endl;
    cout<<"================================================="<<endl;
    cout<<"Alamat Tujuan\n";
    cout<<"Nama\t\t= "<<nama<<endl;
    cout<<"Provinsi\t= "<<provinsi<<endl;
    cout<<"Kota\t\t="<<kota<<endl;
    cout<<"Kecamatan\t="<<kecamatan<<endl;
    cout<<"Kode Pos\t="<<pos<<endl;
    cout<<"Nomor Telephone\t="<<telp<<endl;
    
    cout<<"================================================="<<endl;
    cout<<"No\tNama Makanan\tHarga\t"<<endl;
    cout<<"================================================="<<endl;
        for(i = 0; i < jumlah; i++) {
            cout<<i+1<<"\t"<<menu[makan[i]-1]<<"\t\t"<<harga[makan[i]-1]<<"\t"<<endl;
        }
    cout<<"================================================="<<endl;
        cout<<"Diskon \t\t\t"<<diskon<<endl;
        cout<<"Biaya Kurir \t\t"<<kurir<<endl;
        cout<<"Total Pembayaran \t"<<total+kurir-diskon<<endl;
    cout<<"================================================="<<endl;
    

    cout << "Apakah ingin bertransaksi lagi (y/t)? ";
    cin >> ulang;
    cout << endl;
    }
    while (ulang!= 't');
    
    return 0;
}


