package com.AbsInterfaceDemo;


abstract class AbstractClasss {
	
		int regno;
		AbstractClasss(int r)
		{
			regno=r;
		}
		void fueltank()
		{
			System.out.println("Fill the fuel tank");
		}
		
		abstract void steering(int direction,int angle);
		abstract void braking(int force);
}
class Maruti extends AbstractClasss
{
	Maruti(int r) 
	{
		super(r);
		System.out.println("Registration number of Maruti is "+r);
		
	}
	
	
	void steering(int d,int a)
	{
	 System.out.println("Maruti  is moving in "+d+"North at an angle of " +a);	
	}
	void braking(int force) 
	{
		System.out.println("Braking of Maruti is Hydraulic");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti m=new Maruti(2623456);
		m.steering(39,90);
		
		AbstractClasss a=new Maruti(5229); // creating super class refernce to access sub class features
		a.braking(70);
		
		

	
	
	}

}
