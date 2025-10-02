# 🩺 Sistem Evaluasi Risiko Diabetes dengan Fuzzy Logic

<!-- Language Switch -->
**Languages:** [🇮🇩 Indonesian](#indonesian) | [🇺🇸 English](#english) | [🇯🇵 Japanese](#japanese)

---

## Indonesian

### 🎯 Tujuan
Sistem ini mengimplementasikan logika fuzzy untuk mengevaluasi risiko diabetes berdasarkan parameter kesehatan utama:
- **Kadar Glukosa Darah** - Indikator utama diabetes
- **Body Mass Index (BMI)** - Faktor risiko obesitas
- Memberikan prediksi risiko diabetes dalam skala 0-100

### 📄 Dokumentasi
Program menggunakan **Metode Fuzzy Mamdani** dengan struktur:

**Input Variables:**
- **Glukosa** (50-200 mg/dL): Rendah, Sedang, Tinggi
- **BMI** (10-50): Normal, Overweight, Obesitas

**Output Variable:**
- **Risiko** (0-100%): Rendah, Sedang, Tinggi

**Fuzzy Rules:**
1. Glukosa Rendah + BMI Normal → Risiko Rendah
2. Glukosa Rendah + BMI Overweight → Risiko Sedang
3. Glukosa Sedang + BMI Normal → Risiko Sedang
4. Glukosa Sedang + BMI Overweight → Risiko Tinggi
5. Glukosa Tinggi + BMI Normal → Risiko Tinggi
6. Glukosa Tinggi + BMI Obesitas → Risiko Tinggi

### � Fitur Utama
- ✅ Implementasi Fuzzy Logic dengan scikit-fuzzy
- ✅ Visualisasi membership functions
- ✅ Sistem aturan berbasis pengetahuan medis
- ✅ Output grafik untuk analisis
- ✅ Evaluasi risiko real-time

### 👀 Preview Singkat
```python
# Input Example
glukosa_input = 150  # mg/dL
bmi_input = 28       # kg/m²

# Output
Input Glukosa: 150
Input BMI: 28
Tingkat Risiko Diabetes: 75.00%
```

### ⚙️ Cara Install
1. **Clone Repository:**
   ```bash
   git clone https://github.com/zakkutsu/ai_exam.git
   cd ai_exam
   ```

2. **Install Dependencies:**
   ```bash
   pip install scikit-fuzzy numpy matplotlib
   ```

3. **Jalankan Jupyter Notebook:**
   ```bash
   jupyter notebook diabetes-fuzzy-logic.ipynb
   ```

### 🏷️ Tags
`fuzzy-logic` `diabetes` `healthcare` `ai` `machine-learning` `medical-diagnosis` `scikit-fuzzy` `python` `jupyter`

### 🎬 Demo
Program mencakup visualisasi interaktif dari:
- Fungsi keanggotaan untuk setiap variabel
- Proses defuzzifikasi
- Hasil evaluasi risiko dengan grafik

---

## English

### 🎯 Purpose
This system implements fuzzy logic to evaluate diabetes risk based on key health parameters:
- **Blood Glucose Level** - Primary diabetes indicator
- **Body Mass Index (BMI)** - Obesity risk factor
- Provides diabetes risk prediction on 0-100 scale

### 📄 Documentation
The program uses **Mamdani Fuzzy Method** with structure:

**Input Variables:**
- **Glucose** (50-200 mg/dL): Low, Medium, High
- **BMI** (10-50): Normal, Overweight, Obese

**Output Variable:**
- **Risk** (0-100%): Low, Medium, High

**Fuzzy Rules:**
1. Low Glucose + Normal BMI → Low Risk
2. Low Glucose + Overweight BMI → Medium Risk
3. Medium Glucose + Normal BMI → Medium Risk
4. Medium Glucose + Overweight BMI → High Risk
5. High Glucose + Normal BMI → High Risk
6. High Glucose + Obese BMI → High Risk

### 🚀 Main Features
- ✅ Fuzzy Logic implementation with scikit-fuzzy
- ✅ Membership function visualization
- ✅ Medical knowledge-based rule system
- ✅ Graphical output for analysis
- ✅ Real-time risk evaluation

### 👀 Quick Preview
```python
# Input Example
glucose_input = 150  # mg/dL
bmi_input = 28       # kg/m²

# Output
Input Glucose: 150
Input BMI: 28
Diabetes Risk Level: 75.00%
```

### ⚙️ Installation
1. **Clone Repository:**
   ```bash
   git clone https://github.com/zakkutsu/ai_exam.git
   cd ai_exam
   ```

2. **Install Dependencies:**
   ```bash
   pip install scikit-fuzzy numpy matplotlib
   ```

3. **Run Jupyter Notebook:**
   ```bash
   jupyter notebook diabetes-fuzzy-logic.ipynb
   ```

### 🏷️ Tags
`fuzzy-logic` `diabetes` `healthcare` `ai` `machine-learning` `medical-diagnosis` `scikit-fuzzy` `python` `jupyter`

### 🎬 Demo
The program includes interactive visualization of:
- Membership functions for each variable
- Defuzzification process
- Risk evaluation results with charts

---

## Japanese

### 🎯 目的
このシステムは、主要な健康パラメータに基づいて糖尿病リスクを評価するファジィロジックを実装しています：
- **血糖値** - 糖尿病の主要指標
- **ボディマス指数（BMI）** - 肥満リスク要因
- 0-100スケールで糖尿病リスク予測を提供

### 📄 ドキュメンテーション
プログラムは以下の構造で**マムダニファジィ法**を使用：

**入力変数:**
- **グルコース** (50-200 mg/dL): 低、中、高
- **BMI** (10-50): 正常、過体重、肥満

**出力変数:**
- **リスク** (0-100%): 低、中、高

**ファジィルール:**
1. 低グルコース + 正常BMI → 低リスク
2. 低グルコース + 過体重BMI → 中リスク
3. 中グルコース + 正常BMI → 中リスク
4. 中グルコース + 過体重BMI → 高リスク
5. 高グルコース + 正常BMI → 高リスク
6. 高グルコース + 肥満BMI → 高リスク

### 🚀 主要機能
- ✅ scikit-fuzzyによるファジィロジック実装
- ✅ メンバーシップ関数の可視化
- ✅ 医学知識ベースのルールシステム
- ✅ 分析用グラフィカル出力
- ✅ リアルタイムリスク評価

### 👀 クイックプレビュー
```python
# 入力例
glucose_input = 150  # mg/dL
bmi_input = 28       # kg/m²

# 出力
Input Glucose: 150
Input BMI: 28
Diabetes Risk Level: 75.00%
```

### ⚙️ インストール
1. **リポジトリのクローン:**
   ```bash
   git clone https://github.com/zakkutsu/ai_exam.git
   cd ai_exam
   ```

2. **依存関係のインストール:**
   ```bash
   pip install scikit-fuzzy numpy matplotlib
   ```

3. **Jupyter Notebookの実行:**
   ```bash
   jupyter notebook diabetes-fuzzy-logic.ipynb
   ```

### 🏷️ タグ
`ファジィロジック` `糖尿病` `ヘルスケア` `AI` `機械学習` `医療診断` `scikit-fuzzy` `python` `jupyter`

### 🎬 デモ
プログラムには以下のインタラクティブな可視化が含まれています：
- 各変数のメンバーシップ関数
- 非ファジィ化プロセス
- チャート付きリスク評価結果
