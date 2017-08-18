package STACK;

public class stack {

	protected int[] data;
	protected int tos;

	public stack(int cap) {
		tos = -1;
		data = new int[cap];
	}

	public void push(int item) throws Exception {
		if (size() == this.data.length) {
			throw new Exception(" Stack full ");
		}
		this.tos++;
		this.data[this.tos] = item;
	}

	public int top() throws Exception {
		if (size() == 0) {
			throw new Exception(" stack is empty");
		}
		return this.data[tos];
	}

	public int pop() throws Exception {
		if (size() == 0) {
			throw new Exception(" stack is empty");
		}
		
		int rv=this.data[this.tos];
		this.data[this.tos] = 0;
		tos--;
		return rv;
	}

	public int size() {
		return tos + 1;
	}

	public void display() {
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = tos; i >= 0; i--)
			System.out.print(this.data[i] + "\t");
		System.out.println(".");
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public boolean isempty()
	{
		return this.size()==0;
	}

	public void DisplayRev() throws Exception {
		if(this.size()==0) {
			return;
		}
		int item = this.pop();
		DisplayRev();
		System.out.print(item + "\t");
		this.push(item);
	}
    
    	
    	
	

}
