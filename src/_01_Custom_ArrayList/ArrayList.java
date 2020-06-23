package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array;
	
	public ArrayList() {
		array = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}
	
	public void add(T val) {
		T[] longerArray = (T[]) new Object[array.length+1];
		longerArray[longerArray.length-1] = val;
		
		for (int i = 0; i < array.length; i++) {
			longerArray[i] = array[i];
		}
		array = longerArray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] anotherArray = (T[]) new Object[array.length+1];
		for (int i = 0; i < anotherArray.length; i++) {
			if (i < loc) {
				anotherArray[i] = array[i];
			} else if (i > loc) {
				anotherArray[i] = array[i-1];
			} else {
				anotherArray[i] = val;
			}
		}
		array = anotherArray;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] lastArray = (T[]) new Object[array.length-1];
		for (int i = 0; i < array.length; i++) {
			if (i < loc) {
				lastArray[i] = array[i];
			} else if (i > loc){
				lastArray[i-1] = array[i];
			} else {
			}
		
		}
		array = lastArray;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(val)) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return array.length;
	}
}