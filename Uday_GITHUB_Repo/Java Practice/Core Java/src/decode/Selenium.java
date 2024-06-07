package decode;


public class Selenium {

	public static void main(String[] args) {
		int[] inp= {1,1,2,2};
		int n=5;
		int[] tmp=new int[n];
		//op=missing,repeating
		
		for(int i=0;i<inp.length;i++) {
			for(int j=i+1;j<inp.length;j++) {
				if(inp[i]==inp[j]) { 
					System.out.println("Duplicate numbers are : "+ inp[i]);
					break;
				}
			}
		}
		for(int i=0;i<n;i++) {
			tmp[i]=i;
		}
		for(int i=0;i<tmp.length-1;i++) {
			for(int j=0;j<inp.length;j++) {
				if(tmp[i]!=inp[j]) {
					System.out.println("Missing numbers are : "+ tmp[i]);		
				}
			}
		}
	}
}

