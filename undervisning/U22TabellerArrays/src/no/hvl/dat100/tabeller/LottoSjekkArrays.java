package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class LottoSjekkArrays {

	
	public static boolean sjekkkupong_v1 (int[] kupong, int[] lottotall){
	
		return Arrays.equals(kupong,lottotall);
		
	}
	
	public static boolean sjekkkupong_v2 (int[] kupong, int[] lottotall){
		
		// TODO - implementer i en sjekkkupong metode
		Arrays.sort(kupong);
		Arrays.sort(lottotall);
		
		return Arrays.equals(kupong,lottotall);
		
	}
	
	public static void main(String[] args) {

		int[] lottoTall = {34,2,7,16,21,29,1};
		
		int[] minKupong1 = {12,1,34,16,2,25,26};
		int[] minKupong2 = {2,7,34,16,21,1,29};

		// TODO
		System.out.println(sjekkkupong_v1(minKupong1,lottoTall));
		System.out.println(sjekkkupong_v1(minKupong2,lottoTall));
		
		System.out.println(sjekkkupong_v2(minKupong1,lottoTall));
		System.out.println(sjekkkupong_v2(minKupong2,lottoTall));

	}

}
