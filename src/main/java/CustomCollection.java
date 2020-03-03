import java.util.Arrays;

public class CustomCollection<T> {
	private Object data[];
	private int index;
	public CustomCollection() {
		this.data=new Object[10];
		this.index=-1;
	}
	public int size() {
		return this.data.length;
	}
	public void add(Object item) {
		++this.index;
		this.ensureAndIncreaseSize(this.index);
		this.data[this.index]=item;
	}
	public void ensureAndIncreaseSize(int index) {
		if(index>=this.size())
			this.data=Arrays.copyOf(this.data,this.size()*2);
	}
	public T get(int index) {
		return (T)this.data[index];
	}
	public void remove(Object item) {
		int index=-1;
		while(++index<this.size()) {
			if(this.data[index]==item)
				break;
		}
		for(int i=index;i<this.size()-1;i++)
			this.data[i]=this.data[i+1];
	}
	public void display() {
		for(Object items:this.data) {
			if(items!=null)
				System.out.print((T)items+" ");
		}
		System.out.println();
	}
}