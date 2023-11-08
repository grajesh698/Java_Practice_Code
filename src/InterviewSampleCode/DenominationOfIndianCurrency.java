package InterviewSampleCode;

//Denomination Of Indian Currency
//Input: 2343
//Output: 1*2000 1*200 1*100 2*20 1*2 1*1
//Type of currency 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1

public class DenominationOfIndianCurrency {

	public static void main(String[] args) {
		int Amount = 7999;
		int count, rem;

		if (Amount >= 2000) {
			rem = Amount % 2000;
			count = Amount / 2000;
			Amount = rem;
			System.out.print(count + "*2000 ");
		}
		if (Amount <= 2000 && Amount >= 500) {
			rem = Amount % 500;
			count = Amount / 500;
			Amount = rem;
			System.out.print(count + "*500 ");
		}
		if (Amount <= 500 && Amount >= 200) {
			rem = Amount % 200;
			count = Amount / 200;
			Amount = rem;
			System.out.print(count + "*200 ");
		}
		if (Amount <= 200 && Amount >= 100) {
			rem = Amount % 100;
			count = Amount / 100;
			Amount = rem;
			System.out.print(count + "*100 ");
		}
		if (Amount <= 100 && Amount >= 50) {
			rem = Amount % 50;
			count = Amount / 50;
			Amount = rem;
			System.out.print(count + "*50 ");
		}
		if (Amount <= 50 && Amount >= 20) {
			rem = Amount % 20;
			count = Amount / 20;
			Amount = rem;
			System.out.print(count + "*20 ");
		}
		if (Amount <= 20 && Amount >= 10) {
			rem = Amount % 10;
			count = Amount / 10;
			Amount = rem;
			System.out.print(count + "*10 ");
		}
		if (Amount <= 10 && Amount >= 5) {
			rem = Amount % 5;
			count = Amount / 5;
			Amount = rem;
			System.out.print(count + "*5 ");
		}
		if (Amount <= 5 && Amount >= 2) {
			rem = Amount % 2;
			count = Amount / 2;
			Amount = rem;
			System.out.print(count + "*2 ");
		}
		if (Amount <= 2 && Amount >= 1) {
			rem = Amount % 1;
			count = Amount / 1;
			Amount = rem;
			System.out.print(count + "*1 ");
		}
	}
}