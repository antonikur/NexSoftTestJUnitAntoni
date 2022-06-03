package com.nexsoft.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TestCSorting {
	CSorting csorting;
	
	@BeforeEach
	public void init() {
		csorting = new CSorting();
	}
	
	@DisplayName("Bubble Sort-cek data berubah")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testBubbleSort_dataBenarDiganti(String str) {
		
		assertTimeout(Duration.ofMillis(500), ()->{
		try {
			//arrange
			String [] arrayString = str.split(",");
			int [] arrayInt = new int[arrayString.length];
			String strCompare = "";
			
			
			//act
			//insert sring array ke int array
			for(int i=0; i<arrayString.length; i++) {
				arrayInt[i] = Integer.parseInt(arrayString[i]);
			}
			
			//sorting
			csorting.bubbleSort(arrayInt, arrayInt.length);
				
			//str yang sudah di sorting
			for(int i:arrayInt) {
				strCompare += i+",";
			}
			//hapus char akhir (,) di string
			strCompare=strCompare.substring(0,strCompare.length()-1);
			
			//assert, string yang sudah di sort dengan yang belum
			assertNotEquals(strCompare, str, "Array masih sama");
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	@DisplayName("Selection Sort-cek data berubah")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testSelectionSort_dataBenarDiganti(String str){
		assertTimeout(Duration.ofMillis(500), ()->{
		try {
			//arrange
			String [] arrayString = str.split(",");
			int [] arrayInt = new int[arrayString.length];
			String strCompare = "";
			
			//act
			//insert sring array ke int array
			for(int i=0; i<arrayString.length; i++) {
				arrayInt[i] = Integer.parseInt(arrayString[i]);
			}
			//sorting
			csorting.selectionSort(arrayInt);
			
			//str yang sudah di sorting
			for(int i:arrayInt) {
				strCompare += i+",";
			}
			//hapus char akhir (,) di string
			strCompare=strCompare.substring(0,strCompare.length()-1);
			
			//assert, string yang sudah di sort dengan yang belum
			assertNotEquals(strCompare, str, "Array masih sama");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	});
	}
	
	@DisplayName("Insertion Sort-cek data berubah")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testInsertionSort_dataBenarDiganti(String str){
		assertTimeout(Duration.ofMillis(500), ()->{
		try {
			
			//arrange
			String [] arrayString = str.split(",");
			int [] arrayInt = new int[arrayString.length];
			String strCompare = "";
			
			//act
			//insert sring array ke int array
			for(int i=0; i<arrayString.length; i++) {
				arrayInt[i] = Integer.parseInt(arrayString[i]);
			}
			//sorting
			csorting.insertionSort(arrayInt, arrayInt.length);
			
			//string yang sudah di sorting
			for(int i:arrayInt) {
				strCompare += i+",";
			}
			//hapus char akhir (,) di string
			strCompare=strCompare.substring(0,strCompare.length()-1);
			
			//assert, string yang sudah di sort dengan yang belum
			assertNotEquals(strCompare, str, "Array masih sama");		
		
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		});
	}
	
	@DisplayName("Bubble Sort-cek urutan asc")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testBubbleSort_pemastianSortBenarAscend(String str) {
		assertTimeout(Duration.ofMillis(500), ()->{
			try {
				//arrange
				String [] arrayString = str.split(",");
				int [] arrayInt = new int[arrayString.length];
				//act
		
				//insert sring array ke int array
				for(int i=0; i<arrayString.length; i++) {
					arrayInt[i] = Integer.parseInt(arrayString[i]);
				}
				//sorting
				csorting.bubbleSort(arrayInt, arrayInt.length);
				
				//assert
				for(int i=0; i < arrayInt.length; i++) {
					//penanganan kalau sudah sampai index akhir
					if(arrayInt.length == i+1) {
						break;
					}
					if(arrayInt[i] > arrayInt[i+1]) {
						fail("Index masih tidak tersortir dengan benar (ascending sort)");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		});
	}
	
	@DisplayName("Selection Sort-cek urutan asc")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testSelectionSort_pemastianSortBenarAscend(String str) {
		assertTimeout(Duration.ofMillis(500), ()->{
			try {
				//arrange
				String [] arrayString = str.split(",");
				int [] arrayInt = new int[arrayString.length];
				//act
				//insert sring array ke int array
				for(int i=0; i<arrayString.length; i++) {
					arrayInt[i] = Integer.parseInt(arrayString[i]);
				}
				//sorting
				csorting.selectionSort(arrayInt);
				
				//assert
				for(int i=0; i < arrayInt.length; i++) {
					//penanganan kalau sudah sampai index akhir
					if(arrayInt.length == i+1) {
						break;
					}
					if(arrayInt[i] > arrayInt[i+1]) {
						fail("Index masih tidak tersortir dengan benar (ascending sort)");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	@DisplayName("Insertion Sort-cek urutan asc")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';', numLinesToSkip = 1)
	public void testInsertionSort_pemastianSortBenarAscend(String str) {
		assertTimeout(Duration.ofMillis(500), ()->{
			try {
				//arrange
				String [] arrayString = str.split(",");
				int [] arrayInt = new int[arrayString.length];
				//act
				//insert sring array ke int array
				for(int i=0; i<arrayString.length; i++) {
					arrayInt[i] = Integer.parseInt(arrayString[i]);
				}
				//sorting
				csorting.insertionSort(arrayInt, arrayInt.length);
				
				//assert
				for(int i=0; i < arrayInt.length; i++) {
					//penanganan kalau sudah sampai index akhir
					if(arrayInt.length == i+1) {
						break;
					}
					if(arrayInt[i] > arrayInt[i+1]) {
						fail("Index masih tidak tersortir dengan benar (ascending sort)");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
