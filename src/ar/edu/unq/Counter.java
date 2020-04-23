package ar.edu.unq;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> list;

	public Counter() {
		this.list = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getList() {
		return this.list;
	}

	public void addNumber(int i) {
		this.list.add(i);
	}

	public int getOcurrenciasImpares() {
		int counter = 0;
		for(int num:this.list) {
			float resto = num%2;
			if(resto!=0) {
				counter++;
			}
		}
		return counter;
	}

	public int getOcurrenciasPares() {
		int counter = 0;
		for(int num:this.list) {
			float resto = num%2;
			if(resto==0) {
				counter++;
			}
		}
		return counter;
	}

	public int getMultiplosDe(int i) {
		int counter = 0;
		for(int num:this.list) {
			float resto = num%i;
			if(resto==0) {
				counter++;
			}
		}
		return counter;
	}

}
