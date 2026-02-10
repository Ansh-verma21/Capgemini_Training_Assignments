package COLLECT;

public class ArrayListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<Integer> l=new MyArrayList<>();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(30);
		l.add(80);
		l.add(40);
		l.add(60);
		l.show();
		Integer a=l.get(2);
		System.out.println(a);
		l.remove(2);
		l.show();
		int k=l.search(80);
		System.out.println(k);
		l.sort();
		l.show();

	}
	

}
class MyArrayList<T>{
	private Object[] data;
	private int size;
	
	public MyArrayList() {
		data=new Object[4];
		size=0;
		
	}
	public void add(T value) {
		if(size== data.length) {
			resize();
		}
		data[size++]=value;
	}
	private void resize() {
		Object[] newData=new Object[data.length*2];
		for(int i=0;i<data.length;i++) {
			newData[i]=data[i];
			
		}
		data=newData;
	}
	
	public void show() {
		for(int i=0;i<size;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
	
	}
	public T get(int i)
	{
		if(i<0||i>=size)
		{
			throw new IndexOutOfBoundsException();
		}
		return (T)data[i];
	}
	public void remove(int index) {
		if(index<0||index>=size)
		{
			throw new IndexOutOfBoundsException();
		}
		for(int i=index;i<size-1;i++ )
		{
			data[i]=data[i+1];
		}
		data[size-1]=0;
		size--;
	}
	public int search(T a)
	{
		for(int i=0;i<size;i++)
		{
			if(data[i].equals(a))
				return i;
		}
		return -1;
			
	}
	public void sort()
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(compare(data[j],data[j+1]))
				{
					Object temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		
	}
	public boolean compare(Object a,Object b) {
		if(a instanceof Integer)
		{
			if((int)a>(int)b)
				return true;
			else
				return false;
		}
		else if(a instanceof Double)
		{
			if((Double)a>(Double)b)
				return true;
			else
				return false;
		}
		else if(a instanceof Float)
		{
			if((float)a>(float)b)
				return true;
			else
				return false;
		}
		else if(a instanceof Long)
		{
			if((long)a>(long)b)
				return true;
			else
				return false;
		}
		else if(a instanceof Character)
		{
			if((char)a>(char)b)
				return true;
			else
				return false;
		}
		else if(a instanceof Short)
		{
			if((short)a>(short)b)
				return true;
			else
				return false;
		}
		else if(a instanceof Byte)
		{
			if((byte)a>(byte)b)
				return true;
			else
				return false;
		}
		else if(a instanceof String)
		{
			String s1 = (String) a;
	        String s2 = (String) b;

	        int len = Math.min(s1.length(), s2.length());
	        for (int i = 0; i < len; i++) {
	            if (s1.charAt(i) != s2.charAt(i)) {
	                return s1.charAt(i) > s2.charAt(i);
	            }
	        }
	        return s1.length() > s2.length();
		}
		return false;
		
	}
}
