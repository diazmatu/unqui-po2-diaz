package ar.edu.unq;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> list;

	public Multioperador() {
		this.list = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getList() {
		return this.list;
	}

	public void addNumber(int i) {
		this.list.add(i);
	}
	
	public int restarTodos() {
		int counter = this.list.get(0)*2;
		for(int num:this.list) {
			counter = counter-num;
		}
		return counter;
	}

	public int sumarTodos() {
		int counter = 0;
		for(int num:this.list) {
			counter = counter+num;
		}
		return counter;
	}

	public int multiplicarTodos(int i) {
		int counter = 1;
		for(int num:this.list) {
			counter = counter*num;
		}
		return counter;
	}

}
