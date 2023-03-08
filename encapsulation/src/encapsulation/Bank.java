package encapsulation;

public class Bank {
	private int pin1,pin2,pin3;
	public void setPin(int pin1,int pin2,int pin3) 
	

	{
		this.pin1=pin1;
		this.pin2=pin2;
		this.pin3=pin3;
		
		
	}
	
public int getPin1()
{
return pin1;	
}
public int getPin2()
{
return pin2;	
}
public int getPin3()
{
return pin3;	
}

public void pinValidate()
{
	if( pin1==1001 && pin2==1324 && pin3==1212)
	{
		System.out.println("valid pins");
		
	}
	
}
}


