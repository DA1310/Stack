package STACK;

public class dynamic_stack extends stack {
	public dynamic_stack(int cap)
	{
		super(cap);
	}
	@Override 
	public void push(int item) throws Exception
	{
		if (size()== this.data.length)
		{
			int[] oa = data;
			data = new int[2*this.data.length];
			for(int i=0;i<size() ; i++)
			{
				data[i] = oa[i];
			}
			
		}
		super.push(item);
	}

}
