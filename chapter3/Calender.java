package chapter3;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月5日 下午1:55:23
 * 
 *        Pro 3.3
 */

public class Calender {

	static String MM[][] = new String[13][6];
	static String head = " Sun Mon Tue Wed Thu Fri Sat";
	static String blank = "                            ";

	/* 获取一个日期是星期几 */
	public static int getWeekOfDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return w;
	}

	/* 获取一个月的最大日期是多少 */
	public static int getMaxDayOfMonth(int year, int month) {
		Calendar time = Calendar.getInstance();
		time.clear();
		time.set(Calendar.YEAR, year);
		time.set(Calendar.MONTH, month - 1);
		int day = time.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}

	/* 将日历输入到MM中 */
	public static void makeMonth(int Month, int Year) {

		int st = getWeekOfDate(Year, Month, 1);
		int ed = getMaxDayOfMonth(Year, Month);
		for (int i = 1; i <= st; i++)
			MM[Month][0] += "    ";
		int k = 0;

		for (int i = 1; i <= ed; i++) {
			Formatter fmt = new Formatter();
			fmt.format("%4d", i);
			MM[Month][k] += fmt.toString();
			if (MM[Month][k].length() >= 28)
				k++;
			fmt.close();
		}
	}

	/* 输出日历 */
	public static void outCal(int month, int year) {
		if (year > 0) {
			System.out.println(head + "    " + head + "    " + head);
			for (int i = 1; i <= 4; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.printf("%-28s", MM[i * 3 - 2][j].length() == 0 ? blank : MM[i * 3 - 2][j]);
					System.out.print("    ");
					System.out.printf("%-28s", MM[i * 3 - 1][j].length() == 0 ? blank : MM[i * 3 - 1][j]);
					System.out.print("    ");
					System.out.printf("%-28s\n", MM[i * 3][j].length() == 0 ? blank : MM[i * 3][j]);
				}
			}
		} else {
			System.out.println(head);
			for (int i = 0; i < MM[month].length; i++)
				System.out.println(MM[month][i]);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 13; i++)
			for (int j = 0; j < 6; j++)
				MM[i][j] = "";
		Scanner in = new Scanner(System.in);
		System.out.println("输入一个年份(大于12)或者月份:");
		int opt = in.nextInt();
		if (opt > 0 && opt <= 12) {
			makeMonth(opt, 2011);
			outCal(opt, 0);
		} else if (opt < 0) {
			System.out.println("呵呵，输入无效、");
		} else {
			for (int i = 1; i <= 12; i++)
				makeMonth(i, opt);
			outCal(0, opt);
		}
		in.close();
	}
}
