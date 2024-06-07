package strings;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp="assfeedfffedvfe";
		char[] charArray=inp.toCharArray();
        String remove="";
        int i,j;
        for(i=0;i<=charArray.length-1;i++){
            for(j=0;j<i;j++){
                if(charArray[i]==charArray[j]){
                    break;
                }
            }
            if(j==i){
                remove+=charArray[i]+"";   
            }
        }
        System.out.println(remove);
	}

}
