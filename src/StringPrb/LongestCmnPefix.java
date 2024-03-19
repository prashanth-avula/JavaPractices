package StringPrb;

public class LongestCmnPefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"pri","prashanth","pruladfgdf"};
		
		if(s.length==0) {
			System.out.println("no String");
		}
		String pre=s[0];
		for(int i=1;i<=s.length-1;i++) {
			while (s[i].indexOf(pre)!=0) {
				System.out.println(s[i]);
				pre=pre.substring(0,pre.length()-1);
				if(pre.isEmpty()) {
					System.out.println("not String");
				}
			}
			System.out.println(pre);
		}

	}

}
