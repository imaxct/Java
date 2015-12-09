package chapter6;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月19日 下午9:53:13
 * 
 *        pro 3.1
 */
class ArrayIndexOutOfBoundsException extends Exception {
	private static final long serialVersionUID = 1L;
	/* 不加就有warning >_< */

	public ArrayIndexOutOfBoundsException() {
		super("ArrayIndexOutOfBoundsException: The length is bigger than maximum length(32768)");
	}

	public ArrayIndexOutOfBoundsException(String str) {
		super("ArrayIndexOutOfBoundsException:" + str);
	}
}

class NegativeArraySizeException extends Exception {
	private static final long serialVersionUID = 1L;
	/* 不加就有warning >_< */

	public NegativeArraySizeException() {
		super("NegativeArraySizeException: The length is bigger than maximum length(32768)");
	}

	public NegativeArraySizeException(String str) {
		super("NegativeArraySizeException:" + str);
	}
}

public class MyString {
	private static final int MAX_LENGTH = 32768;
	private char[] str = new char[MyString.MAX_LENGTH];
	private int length;

	public MyString(String str) throws ArrayIndexOutOfBoundsException {
		if (str.length() > MyString.MAX_LENGTH) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for (int i = 0; i < str.length(); i++)
			this.str[i] = str.charAt(i);
		this.setLength(str.length());
	}

	public boolean equals(Object mystr) {
		if (mystr instanceof MyString) {
			MyString tmp = (MyString) mystr;
			if (tmp.length() != this.length())
				return false;
			for (int i = 0; i < this.length; i++)
				if (tmp.charAt(i) != this.charAt(i))
					return false;
			return true;
		} else if (!(mystr instanceof String)) {
			return false;
		}
		String temp = (String) mystr;
		for (int i = 0; i < this.length; i++)
			if (temp.charAt(i) != this.charAt(i))
				return false;

		return true;
	}

	public int length() {
		return length;
	}

	private void setLength(int length) {
		this.length = length;
	}

	public char charAt(int index) {
		return this.str[index];
	}

	public MyString subString(int num) throws ArrayIndexOutOfBoundsException {
		if (num > this.length()) {
			throw new ArrayIndexOutOfBoundsException("Wrong parameter");
		}
		String temp = "";
		for (int i = 0; i < num; i++)
			temp += this.charAt(i);
		MyString mystr = new MyString(temp);
		return mystr;
	}

	public MyString subString(int beg, int end) throws ArrayIndexOutOfBoundsException {
		if (!(0 <= beg && beg <= this.length() && 0 <= end && end <= this.length())) {
			throw new ArrayIndexOutOfBoundsException("Wrong parameter");
		}
		String temp = "";
		for (int i = beg; i < end; i++)
			temp += this.charAt(i);
		MyString mystr = new MyString(temp);
		return mystr;
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < this.length; i++)
			temp += this.charAt(i);
		return temp;
	}
}
