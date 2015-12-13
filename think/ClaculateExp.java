package think;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月30日 下午4:39:41
 * 
 *        中缀表达式求值
 */

public class ClaculateExp {
	final static int MAX_ARRAY = 9999;

	// 比较优先级
	static boolean cmp(char a, char b) {
		if (b == '(')
			return true;
		else if ((b == '*' || b == '/') && (a == '+' || a == '-' || a == '('))
			return true;
		else if ((b == '+' || b == '-') && (a == '('))
			return true;
		else
			return false;
	}
	// 转化为后缀表达式
	static void toSuffix(char[] infix, char[] suffix) {
		int i, j = 0, top = 0;
		char stack[] = new char[MAX_ARRAY];

		for (i = 0; infix[i] != '\0'; i++) {
			if (infix[i] >= '0' && infix[i] <= '9') {
				suffix[j++] = infix[i];
			} else {
				if (i != 0 && infix[i - 1] >= '0' && infix[i - 1] <= '9') {
					suffix[j++] = ' ';
				}
				if (infix[i] == ')') {
					while (stack[top - 1] != '(') {
						suffix[j++] = stack[--top];
						suffix[j++] = ' ';
					}
					top--;
				} else if (top == 0 || cmp(stack[top - 1], infix[i])) {
					stack[top++] = infix[i];
				} else {
					while (!cmp(stack[top - 1], infix[i])) {
						suffix[j++] = stack[--top];
						suffix[j++] = ' ';
						if (top == 0)
							break;
					}
					stack[top++] = infix[i];
				}
			}
		}
		if (suffix[j - 1] != ' ') {
			suffix[j++] = ' ';
		}
		while (top != 0) {
			suffix[j++] = stack[--top];
			suffix[j++] = ' ';
		}
		suffix[j] = '\0';
	}
	// 后缀求值
	static int getValue(char[] suffix) {
		int stack[] = new int[MAX_ARRAY];
		int top = 0, value = 0;
		for (int i = 0; suffix[i] != '\0'; i++) {
			if (suffix[i] >= '0' && suffix[i] <= '9') {
				value = value * 10 + suffix[i] - '0';
			} else if (suffix[i] == ' ') {
				stack[top++] = value;
				value = 0;
			} else {
				switch (suffix[i]) {
				case '+':
					value = stack[top - 2] + stack[top - 1];
					break;
				case '-':
					value = stack[top - 2] - stack[top - 1];
					break;
				case '*':
					value = stack[top - 2] * stack[top - 1];
					break;
				case '/':
					value = stack[top - 2] / stack[top - 1];
					break;
				default:
					break;
				}
				top -= 2;
			}
		}

		return stack[0];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] infix = new char[MAX_ARRAY];
		char[] suffix = new char[MAX_ARRAY];
		Scanner in = new Scanner(System.in);
		int top = 0;
		System.out.println("Input an expression:");
		String unTrimedString = in.next();
		for (int i = 0; i < unTrimedString.length(); i++) {
			if (unTrimedString.charAt(i) != ' ')
				infix[top++] = unTrimedString.charAt(i);
		}
		toSuffix(infix, suffix);
		int res = getValue(suffix);
		System.out.println("The result of the expression is : " + res);
		in.close();
	}

}
