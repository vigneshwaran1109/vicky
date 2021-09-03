package org.bank;

public class BankInfo  extends AxisBank {
private void saving() {

	System.out.println("saving amount is 145620");
}
private void fixed() {

	System.out.println("fixed amount is 700000");
}
public static void main(String[] args) {
	
	BankInfo a=new BankInfo();
	
	a.saving();
	a.fixed();
	a.deposit();
}
}
