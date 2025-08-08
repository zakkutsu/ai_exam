# 🩺 Diagnosis Diabetes Menggunakan Fuzzy Logic

Program ini merupakan implementasi logika fuzzy untuk mendiagnosis kemungkinan diabetes berdasarkan data kesehatan pasien seperti kadar glukosa, tekanan darah, dan indeks massa tubuh (BMI).  

---

## 🎯 Tujuan
- Membantu proses diagnosis awal diabetes secara otomatis menggunakan **Fuzzy Logic**.
- Menunjukkan penerapan metode kecerdasan buatan pada bidang kesehatan.
- Menjadi contoh proyek machine learning sederhana untuk mahasiswa dan peneliti.

---

## 📄 Dokumentasi
Program ini menggunakan **Metode Fuzzy Mamdani** untuk menganalisis input:
- **Input**: Kadar glukosa, tekanan darah, BMI, umur, dll.
- **Fuzzyfikasi**: Mengubah nilai input menjadi derajat keanggotaan.
- **Rule Base**: Menentukan aturan diagnosis berdasarkan pengalaman medis.
- **Inferensi**: Mengolah aturan fuzzy untuk mendapatkan hasil.
- **Defuzzyfikasi**: Mengubah hasil fuzzy menjadi nilai diagnosis akhir.

File utama:  
- `diagnosis_of_diabetes_using_fuzzy_logic.ipynb` – berisi seluruh kode implementasi dan contoh penggunaan.

---

## 👀 Preview Singkat
Contoh input & output:
```

Masukkan kadar glukosa: 150
Masukkan tekanan darah: 85
Masukkan BMI: 28.5
Hasil Diagnosis: Risiko Tinggi Diabetes (85%)

````

---

## ⚙️ Cara Install
1. Pastikan **Python 3.8+** sudah terpasang.
2. Clone repository ini:
   ```bash
   git clone https://github.com/zakkutsu/diabetes-fuzzy-logic.git
    ````
3. Masuk ke folder proyek:
   ```bash
   cd diabetes-fuzzy-logic
   ```
4. Install dependensi:
   ```bash
   pip install -r requirements.txt
   ```
5. Jalankan program di Jupyter Notebook:
   ```bash
   jupyter notebook diagnosis_of_diabetes_using_fuzzy_logic.ipynb
   ```

---

## 📂 Isi Web / Aplikasi

Walaupun berbasis Jupyter Notebook, program ini dapat dikembangkan menjadi web app dengan **Streamlit** atau **Flask**.
Fitur yang dapat ditambahkan:

* Form input data pasien
* Grafik fungsi keanggotaan
* Tabel hasil diagnosis
* Unduh laporan diagnosis

---

## 🏷 Text Tag

* `fuzzy logic`
* `mamdani`
* `diabetes`
* `diagnosis`
* `machine learning`
* `healthcare`
* `python`

---
