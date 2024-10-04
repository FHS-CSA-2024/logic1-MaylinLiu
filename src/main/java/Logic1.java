package src.main.java;


public class Logic1
{
    public static void main(String[] args){
        Logic1 logicDriver = new Logic1();
		//All test cases;
		System.out.println(logicDriver.old35(3));
		System.out.println(logicDriver.old35(10));
		System.out.println(logicDriver.old35(15));
		System.out.println(logicDriver.specialEleven(22));
		System.out.println(logicDriver.specialEleven(23));
		System.out.println(logicDriver.specialEleven(24));
		System.out.println(logicDriver.more20(20));
		System.out.println(logicDriver.more20(21));
		System.out.println(logicDriver.more20(42));
		System.out.println(logicDriver.less20(18));
		System.out.println(logicDriver.less20(59));
		System.out.println(logicDriver.less20(20));
		System.out.println(logicDriver.nearTen(12));
		System.out.println(logicDriver.nearTen(17));
		System.out.println(logicDriver.nearTen(19));
		System.out.println(logicDriver.sortaSum(3, 4));
		System.out.println(logicDriver.sortaSum(9, 4));
		System.out.println(logicDriver.sortaSum(10, 11));
		System.out.println(logicDriver.in1To10(5, false));
		System.out.println(logicDriver.in1To10(11, false));
		System.out.println(logicDriver.in1To10(11, true));
		System.out.println(logicDriver.teenSum(3, 4));
		System.out.println(logicDriver.teenSum(10, 13));
		System.out.println(logicDriver.teenSum(13, 2));
		System.out.println(logicDriver.love6(6, 4));
		System.out.println(logicDriver.love6(4, 5));
		System.out.println(logicDriver.love6(1, 5));
		System.out.println(logicDriver.lastDigit(23, 19, 13));
		System.out.println(logicDriver.lastDigit(23, 19, 12));
		System.out.println(logicDriver.lastDigit(23, 19, 3));
		System.out.println(logicDriver.answerCell(false, false, false));
		System.out.println(logicDriver.answerCell(false, false, true));
		System.out.println(logicDriver.answerCell(true, false, false));
		System.out.println(logicDriver.alarmClock(1, false));
		System.out.println(logicDriver.alarmClock(5, false));
		System.out.println(logicDriver.alarmClock(0, false));
		System.out.println(logicDriver.teaParty(6, 8));
		System.out.println(logicDriver.teaParty(3, 8));
		System.out.println(logicDriver.teaParty(20, 6));
		System.out.println(logicDriver.redTicket(2, 2, 2));
		System.out.println(logicDriver.redTicket(2, 2, 1));
		System.out.println(logicDriver.redTicket(0, 0, 0));
		System.out.println(logicDriver.greenTicket(1, 2, 3));
		System.out.println(logicDriver.greenTicket(2, 2, 2));
		System.out.println(logicDriver.greenTicket(1, 1, 2));
		System.out.println(logicDriver.squirrelPlay(70, false));
		System.out.println(logicDriver.squirrelPlay(95, false));
		System.out.println(logicDriver.squirrelPlay(95, true));
		System.out.println(logicDriver.caughtSpeeding(60, false));
		System.out.println(logicDriver.caughtSpeeding(65, false));
		System.out.println(logicDriver.caughtSpeeding(65, true));
		System.out.println(logicDriver.dateFashion(5, 10));
		System.out.println(logicDriver.dateFashion(5, 2));
		System.out.println(logicDriver.dateFashion(5, 5));
		System.out.println(logicDriver.fizzString2(1));
		System.out.println(logicDriver.fizzString2(5));
		System.out.println(logicDriver.fizzString2(3));
		System.out.println(logicDriver.fizzString2(15));
		System.out.println(logicDriver.sodaParty(30, false));
		System.out.println(logicDriver.sodaParty(50, false));
		System.out.println(logicDriver.sodaParty(70, true));
    }

    public Logic1() {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

	public boolean old35(int n) {
		return (n % 3 == 0 || n % 5 == 0) && !(n % 3 == 0 && n % 5 == 0);
	}

	public boolean specialEleven(int n) {
		return n % 11 == 0 || n % 11 == 1;
	}

	public boolean more20(int n) {
		return n % 20 == 1 || n % 20 == 2;
	}

	public boolean less20(int n) {
		return n % 20 == 18 || n % 20 == 19;
	}

	public boolean nearTen(int num) {
		return num % 10 <= 2 || num % 10 >= 8;
	}

	public int sortaSum(int a, int b) {
		int sum = a + b;
		return (sum >= 10 && sum <= 19) ? 20 : sum;
	}

	public boolean in1To10(int n, boolean outsideMode) {
		return outsideMode ? n <= 1 || n >= 10 : n >= 1 && n <= 10;
	}

	public int teenSum(int a, int b) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			return 19;
		}
		return a + b;
	}

	public boolean love6(int a, int b) {
		return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
	}

	public boolean lastDigit(int a, int b, int c) {
		return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10;
	}

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) return false;
		return !isMorning || isMom;
	}

	public String alarmClock(int day, boolean vacation) {
		if (vacation) {
			return (day == 0 || day == 6) ? "off" : "10:00";
		} else {
			return (day == 0 || day == 6) ? "10:00" : "7:00";
		}
	}

	public int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5) return 0;
		if (tea >= 2 * candy || candy >= 2 * tea) return 2;
		return 1;
	}

	public int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2) return 10;
		if (a == b && b == c) return 5;
		if (a != b && a != c) return 1;
		return 0;
	}

	public int greenTicket(int a, int b, int c) {
		if (a == b && b == c) return 20;
		if (a == b || b == c || a == c) return 10;
		return 0;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		return temp >= 60 && (temp <= (isSummer ? 100 : 90));
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		int offset = isBirthday ? 5 : 0;
		if (speed <= 60 + offset) return 0;
		if (speed <= 80 + offset) return 1;
		return 2;
	}

	public int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) return 0;
		if (you >= 8 || date >= 8) return 2;
		return 1;
	}

	public String fizzString2(int n) {
		if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
		if (n % 3 == 0) return "Fizz!";
		if (n % 5 == 0) return "Buzz!";
		return n + "!";
	}

	public boolean sodaParty(int sodas, boolean isWeekend) {
		if (isWeekend) {
			return sodas >= 40;
		} else {
			return sodas >= 40 && sodas <= 60;
		}
	}
}
