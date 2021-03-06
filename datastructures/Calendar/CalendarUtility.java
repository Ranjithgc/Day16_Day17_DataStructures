/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Ranjith G C
 *  @version 1.0
 *  @since   12-06-2021
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.datastructure.CalendarQueue;
import com.bridgelabz.datastructure.CalendarToDoubleStack;

public class CalendarUtility {
	 
	/**
	 * Purpose: method for checking year is leap or not
	 * 
	 * @param year input from user
	 * @return returns true if leap year else false
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
			return true;
		else
			return false;
	}

	/**
	 * Purpose: calculate which day is this
	 * 
	 * @param day   input from user
	 * @param month input from user
	 * @param year  input from user
	 * @return returns day from 0 to 6 if 0 means sunday and so on
	 */
	public static int calculateDayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}

	/**
	 * Purpose: print calendar on console using two dimension array
	 * 
	 * @param day  day of the week
	 * @param days days of the month
	 */
	public static void printCalendar(int day, int days) {

		String[][] cal = new String[6][7];
		int temp;
		String weekdaystr = "SUN MON TUE WED THU FRI SAT";
		System.out.println(weekdaystr);
		switch (day) {
		case 0:
			temp = 1;
			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (temp <= 9) {
						cal[i][j] = temp + "   ";
					} else {
						cal[i][j] = temp + "  ";
					}
					temp++;
					if (temp == days + 1) {
						break;
					}
				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 1:
			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j == 0) {
						cal[i][j] = "    ";
					} else {
						if (i <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}

			}
			break;
		case 2:
			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j == 0 || i == 0 && j == 1) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}

			}
			break;
		case 3:
			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j >= 0 || i == 0 && j <= 2) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 4:

			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j >= 0 || i == 0 && j <= 3) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 5:

			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j >= 0 || i == 0 && j <= 4) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 6:

			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j >= 0 || i == 0 && j <= 5) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		}
		for (int i = 0; i < cal.length; i++) {
			for (int j = 0; j < cal[i].length; j++) {
				if (cal[i][j] == null)
					break;
				System.out.print(cal[i][j]);

			}
			if (cal[i] == null)
				break;
			System.out.println();
		}

	}

	/**
	 * Purpose: method for printing calendar using queue
	 * 
	 * @param day  input from program
	 * @param days input from program
	 */
	public static void printCalendarUsingQueue(int day, int days) {
		QueueImplementedUsingLinkedList<String> weekDayQueue = new QueueImplementedUsingLinkedList<String>();
		QueueImplementedUsingLinkedList<String> weekDateQueue = new QueueImplementedUsingLinkedList<String>();
		String weekdaystr = "SUN MON TUE WED THU FRI SAT";
		String[] weekdaystrarr = weekdaystr.split(" ");
		for (int i = 0; i < weekdaystrarr.length; i++) {
			weekDayQueue.enQueue(weekdaystrarr[i]);
		}
		weekDayQueue.show();
		switch (day) {
		case 0:

			for (int i = 1; i <= days; i++) {
				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}
				if (i % 7 == 0) {
					weekDateQueue.enQueue("\n");
				}
			}
			break;
		case 1:

			System.out.print("    ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}
				if (i == 6 || i == 13 || i == 20 || i == 27) {
					weekDateQueue.enQueue("\n");
				}
			}
			break;
		case 2:

			System.out.print("        ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}
				if (i == 5 || i == 12 || i == 19 || i == 26) {
					weekDateQueue.enQueue("\n");
				}
			}
			break;
		case 3:

			System.out.print("            ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}
				if (i == 4 || i == 11 || i == 18 || i == 25) {
					weekDateQueue.enQueue("\n");
				}
			}
			break;
		case 4:

			System.out.print("                ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}
				if (i == 3 || i == 10 || i == 17 || i == 24) {
					weekDateQueue.enQueue("\n");
				}
			}
			break;
		case 5:

			System.out.print("                    ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}
				if (i == 2 || i == 9 || i == 16 || i == 23 || i == 30) {
					weekDateQueue.enQueue("\n");
				}
			}
			break;
		case 6:

			System.out.print("                        ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}
				if (i == 1 || i == 8 || i == 15 || i == 22 || i == 29) {
					weekDateQueue.enQueue("\n");
				}
			}
			break;
		}

		System.out.println(weekDateQueue.showQueueWithoutSpace());
	}

	/**
	 * Purpose: method for printing calendar using queue and the put queue into the
	 * stack 1 and the also put that stack data into stack 2
	 * 
	 * @param day  input from program
	 * @param days input from program
	 */
	public static void printCalendarUsingQueueDoubleStack(int day, int days) {
		QueueImplementedUsingLinkedList<String> weekDayQueue = new QueueImplementedUsingLinkedList<String>();
		StackImplementUsingLinkedList<String> weekDayStack1 = new StackImplementUsingLinkedList<String>();
		StackImplementUsingLinkedList<String> weekDayStack2 = new StackImplementUsingLinkedList<String>();
		QueueImplementedUsingLinkedList<String> weekDateQueue = new QueueImplementedUsingLinkedList<String>();
		StackImplementUsingLinkedList<String> weekDateStack1 = new StackImplementUsingLinkedList<String>();
		StackImplementUsingLinkedList<String> weekDateStack2 = new StackImplementUsingLinkedList<String>();
		String weekdaystr = "SUN MON TUE WED THU FRI SAT";
		String[] weekdaystrarr = weekdaystr.split(" ");
		for (int i = 0; i < weekdaystrarr.length; i++) {
			weekDayQueue.enQueue(weekdaystrarr[i]);
		}
		//weekDayQueue.show();
		for (int i = 0; i < weekdaystrarr.length; i++) {
			String str = weekDayQueue.get();
			weekDayQueue.deQueue();
			weekDayStack1.push(str);
		}
		//weekDayStack1.show();
		for (int i = 0; i < weekdaystrarr.length; i++) {
			if (!weekDayStack1.isEmpty()) {
				weekDayStack2.push(weekDayStack1.peek());
				weekDayStack1.pop();
			}

		}
		weekDayStack2.show();
		switch (day) {
		case 0:

			for (int i = 1; i <= days; i++) {
				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}
				if (i % 7 == 0) {

				}
			}
			for (int i = 1; i <= days; i++) {
				String str = weekDateQueue.get();
				weekDateQueue.deQueue();
				weekDateStack1.push(str);
			}
			for (int i = 1; i <= days; i++) {
				weekDateStack2.push(weekDateStack1.peek());
				if (i % 7 == 0) {
					weekDateStack2.push("\n");
				}
				if (!weekDateStack1.isEmpty()) {
					weekDateStack1.pop();
				}

			}
			weekDateStack2.showStackWithoutSpace();
			break;
		case 1:

			System.out.print("    ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}

			}
			for (int i = 1; i <= days; i++) {
				String str = weekDateQueue.get();
				weekDateQueue.deQueue();
				weekDateStack1.push(str);
			}
			for (int i = 1; i <= days; i++) {
				weekDateStack2.push(weekDateStack1.peek());
				if (i == 6 || i == 13 || i == 20 || i == 27) {
					weekDateStack2.push("\n");
				}
				if (!weekDateStack1.isEmpty()) {
					weekDateStack1.pop();
				}

			}

			weekDateStack2.showStackWithoutSpace();
			break;
		case 2:

			System.out.print("        ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}

			}
			for (int i = 1; i <= days; i++) {
				String str = weekDateQueue.get();
				weekDateQueue.deQueue();
				weekDateStack1.push(str);
			}
			for (int i = 1; i <= days; i++) {
				weekDateStack2.push(weekDateStack1.peek());
				if (i == 5 || i == 12 || i == 19 || i == 26) {
					weekDateStack2.push("\n");
				}
				if (!weekDateStack1.isEmpty()) {
					weekDateStack1.pop();
				}

			}
			weekDateStack2.showStackWithoutSpace();
			break;
		case 3:

			System.out.print("            ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}

			}
			for (int i = 0; i < days; i++) {
				String str = weekDateQueue.get();
				weekDateQueue.deQueue();
				weekDateStack1.push(str);
			}
			for (int i = 0; i < days; i++) {
				weekDateStack2.push(weekDateStack1.peek());
				if (i == 4 || i == 11 || i == 18 || i == 25) {
					weekDateStack2.push("\n");
				}
				if (!weekDateStack1.isEmpty()) {
					weekDateStack1.pop();
				}

			}
			weekDateStack2.showStackWithoutSpace();
			break;
		case 4:

			System.out.print("                ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}

			}
			for (int i = 0; i < days; i++) {
				String str = weekDateQueue.get();
				weekDateQueue.deQueue();
				weekDateStack1.push(str);
			}
			for (int i = 0; i < days; i++) {
				weekDateStack2.push(weekDateStack1.peek());
				if (i == 3 || i == 10 || i == 17 || i == 24) {
					weekDateStack2.push("\n");
				}
				if (!weekDateStack1.isEmpty()) {
					weekDateStack1.pop();
				}

			}
			weekDateStack2.showStackWithoutSpace();
			break;
		case 5:

			System.out.print("                    ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}

			}
			for (int i = 0; i < days; i++) {
				String str = weekDateQueue.get();
				weekDateQueue.deQueue();
				weekDateStack1.push(str);
			}
			for (int i = 0; i < days; i++) {
				weekDateStack2.push(weekDateStack1.peek());
				if (i == 2 || i == 9 || i == 16 || i == 23 || i == 30) {
					weekDateStack2.push("\n");
				}
				if (!weekDateStack1.isEmpty()) {
					weekDateStack1.pop();
				}

			}
			weekDateStack2.showStackWithoutSpace();
			break;
		case 6:

			System.out.print("                        ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					weekDateQueue.enQueue(i + "   ");
				} else {
					weekDateQueue.enQueue(i + "  ");
				}

			}
			for (int i = 0; i < days; i++) {
				String str = weekDateQueue.get();
				weekDateQueue.deQueue();
				weekDateStack1.push(str);
			}
			for (int i = 0; i < days; i++) {
				weekDateStack2.push(weekDateStack1.peek());
				if (i == 1 || i == 8 || i == 15 || i == 22 || i == 29) {
					weekDateStack2.push("\n");
				}
				if (!weekDateStack1.isEmpty()) {
					weekDateStack1.pop();
				}

			}
			weekDateStack2.showStackWithoutSpace();
			break;
		}

	}
}