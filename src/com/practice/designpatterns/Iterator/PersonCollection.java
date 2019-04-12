package com.practice.designpatterns.Iterator;

public class PersonCollection implements ObjectCollection{

	Person [] personArray = {new Person("Ram",1), new Person("Sham",2)};

	@Override
	public Iterator getIterator() {
		return new PersonIterator();
	}
	
	
	private class PersonIterator implements Iterator{
		int cursor =0;
		@Override
		public boolean hasNext() {
			if (cursor >= personArray.length) return false;
			return true;
		}
		@Override
		public Object next() {
			if(hasNext()){
				return personArray[cursor++];
			}
			return null;
		}
	}
	
}
