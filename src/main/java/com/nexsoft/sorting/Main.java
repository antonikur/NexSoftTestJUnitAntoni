package com.nexsoft.sorting;



/*
 * Clone repo ini ke repository github kalian masing2
 * tambahakan unit test untuk melakukan fungsi test :
 * Positive Test
 * Negative Test
 * 1 .Jumlah test harus ada minimal 5
 * 2. Test setiap eksekusi tidak boleh melebihi 500 mili second (jangan error tapi dapat failure)
 * 
 * 
 * data diambil dari data excel data.csv
 * buatlah reportnya
 */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CSorting sort = new CSorting();
		int arr[] = {1,2,1,3,4,2,5,6};
		sort.insertionSort(arr,arr.length);
		sort.display(arr);
		
		
		
	}

}
