package com.project.example.oops;

class BANK {
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends BANK {
	float getRateOfInterest() {
		return 8;
	}
}
class ICICI extends BANK {
	float getRateOfInterest() {
		return 7;
	}
}
class AXIS extends BANK {
	float getRateOfInterest() {
		return 9;
	}
}
public class Overriding {
	public static void main(String[] args) {
		SBI sbi= new SBI();
		ICICI icici= new ICICI();
		AXIS axis= new AXIS();
		
		System.out.println("Interest Rate of SBI:\t"+sbi.getRateOfInterest());
		System.out.println("Interest Rate of ICICI:\t"+icici.getRateOfInterest());
		System.out.println("Interest Rate of AXIS:\t"+axis.getRateOfInterest());
	}
}
