4.3h Under what conditions would a pre-order and a breadth-first traversal be the same? 
= Pertama-tama pengertian pre-order traversal adalah cara berpindah antara nodes dengan cara mengunjungi node paling kiri hingga anak-anaknya. Sedangkan pengertian breadth-first traversal adalah cara berpindah antara nodes dengan cara mengunjungi node per level hingga akhir. Jadi kapan kondisinya sama adalah ketika root node tidak bercabang sama sekali (linear) atau ketika root node memiliki anak tapi semuanya adalah leaf nodes (tidak memiliki anak) atau ketika hanya ada satu node sebagai root dan leaf. Visualisasinya:
1.  1
   / \
  2   3
Pre-order: 1 2 3
Breadth-first: 1 2 3

2.  1
    |
    2
    |
    3
    |
    4
Pre-order: 1 2 3 4
Breadth-first: 1 2 3 4

3. 1
Pre-order: 1 
Breadth-first: 1 

4.3i Suppose a directory structure has N files stored in n directories.  Answer the following questions: 
a. What is the run time of a traversal that prints out the directory names? 
= Traversal yang hanya perlu mencetak nama direktori harus setidaknya mengunjungi setiap direktori satu kali, sehingga waktu jalannya adalah O(n) dimana n adalah jumlah direktori.
b. What is the run time of a traversal that prints out the file names? 
= Traversal yang hanya perlu mencetak nama file harus setidaknya mengunjungi setiap file satu kali, sehingga waktu jalannya adalah O(N) dimana N adalah jumlah file.
c. How does your answer to Part b of this question change if you know that N = Omega(n)
= Jawaban untuk bagian (b) tidak berubah, dan tetap O(N). Hal ini karena N = Ω(n) berarti jumlah file setidaknya sebanding atau lebih besar daripada jumlah direktori. Akibatnya, waktu traversal didominasi oleh jumlah file yang dikunjungi, sehingga kontribusi direktori menjadi tidak signifikan untuk dihitung dalam time complexity.