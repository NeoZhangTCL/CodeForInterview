package BigNumber;

public class BigInteger {
	String value;
	
	public BigInteger(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public static BigInteger add(BigInteger a, BigInteger b) {
		StringBuilder num1 = new StringBuilder(a.getValue()).reverse();
		StringBuilder num2 = new StringBuilder(b.getValue()).reverse();
		StringBuilder sb = new StringBuilder();
		int carry = 0, minLen = Math.min(num1.length(), num2.length());
		for (int i=0; i<minLen; i++) {
			sb.append((num1.charAt(i)-48+num2.charAt(i)-48+carry)%10);
			carry = (num1.charAt(i)-48+num2.charAt(i)-48+carry)/10;
		}
		StringBuilder tempNum = num1.length()>num2.length()?num1:num2;
		for (int i=minLen; i<tempNum.length(); i++ ) {
			sb.append((tempNum.charAt(i)-48+carry)%10);
			carry = (tempNum.charAt(i)-48+carry)/10;
		}
		if(carry!=0) sb.append(carry);
		return new BigInteger(sb.reverse().toString());		
	}
	
	
	
	public static void main(String[] args) {
		System.out.print(add(new BigInteger("111111111111111111111111111111111111111111111111111111"),new BigInteger("2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")).getValue());
	} 
}
