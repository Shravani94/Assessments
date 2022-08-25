package Oopsconcept;



public class MobileVlidation extends WhatsappLogin {
	private long mobileNumber;
	// this is an abstract method implementation
	public void sentOtp() {
		String name=getName();
		this. mobileNumber =getMobileNumber();
		int count=0;
		while(mobileNumber>0)
		{
			mobileNumber=mobileNumber/10;
			count++;
		}
			if(count==10)
			{
				System.out.println("otp sent successfully");
			}
			else {
				System.out.println("please enter valid mobile number");
			}
			
		}
	@Override
	public void display() {
		System.out.println("this method is from chaild class");
		if(mobileNumber!=0l)
		{
		System.out.println("Thankyou for using Whatsapp");
	}
	}
	/**this is generalized method for avoiding cod repeatation
	 * @param obj
	 */
	public static void getObject(WhatsappLogin obj)
	{
		obj.setName();
		obj.setMobileNumber();
		obj.sentOtp();
		obj.display();
		
	}
	public static void main(String [] args)
	{
		MobileVlidation obj1=new MobileVlidation();
		getObject(obj1);
		WhatsappLogin obj2=new MobileVlidation();
		getObject(obj2);
		
		
		
	}
	}
