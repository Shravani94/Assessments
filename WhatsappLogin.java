package Oopsconcept;
import java.util.Scanner;

abstract public class WhatsappLogin {
	/** name is private member
	 * mobile number is also a private member
	 */
	private String name;
	private long mobileNumber;
	/**getName() is a public method for accessing private data
	 * setName() is public method for accessing private data
	 * getMobileNumber() is public method for accessing data
	 * setMobileNumber() is public method for accessing data
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		this.name=sc.next();
		}
	public long getMobileNumber()
	{
		return mobileNumber;
	}
	public void setMobileNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your mobile number");
		try {
		this.mobileNumber=sc.nextLong();
		}catch(Exception  e) {
			System.out.println("this is not number");
		}
	}
	//sentOtp() is an abstract method
	
	abstract public void sentOtp();
	
	//display() is used for achieving polymorphism

	public void display()
	{
		System.out.println("Thismethod is from parent class");
		System.out.println("Thankyou for using Whatsapp");
	}
	

}
