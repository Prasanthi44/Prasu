package org.phone;

public class Phone {
	private void phoneInfo(String Phonename,String Phonemodel) {
		System.out.println("Phone name is "+Phonename+"\t"+"Phone model is "+Phonemodel);	

	}
	private void phoneInfo(float phonememory ) {
		System.out.println("Phone memory is "+phonememory);
		
		}
	private void phoneInfo(Float phoneRam) {
		System.out.println("Phone Ram is " +phoneRam);

	}
	public static void main(String[] args) {
		Phone d=new Phone();
		d.phoneInfo("Redmi", "Note4");
		d.phoneInfo(64f);
		d.phoneInfo(4f);
	}
	

}
