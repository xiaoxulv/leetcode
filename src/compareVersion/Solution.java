package compareVersion;

public class Solution {
	public int compareVersion(String version1, String version2){
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int len1 = v1.length;
		int len2 = v2.length;
		int len = Math.max(len1, len2);
		int i = 0;

		while(i < len){
			int c1 = 0, c2 =0;
			if(i < len1)
				c1 = Integer.parseInt(v1[i]);
			if(i < len2)
				c2 = Integer.parseInt(v2[i]);
			if(c1 > c2)
				return 1;
			else if(c2 > c1)
				return -1;
			i++;
		}
        return 0;
	
	}
	// not work, there are test cases without "."
/*    public int compareVersion(String version1, String version2) {
        int len1 = version1.length();
        int len2 = version2.length();
        int i = 0;
        while(i < len1 && i < len2){
        	if(version1.charAt(i) > version2.charAt(i)) 
        		return 1;
        	else if(version1.charAt(i) < version2.charAt(i))
        		return -1;
        	else 
        		i++;
        }
        if(i == len1 && i < len2)
        	return -1;
        if(i == len2 && i < len1)
        	return 1;
        return 0;
    }
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.compareVersion("3.1", "3.21"));
//		String s = ".abc";
//		String[] str = s.split("\\.");
//		System.out.println(str[0]);
//		System.out.println(str[1]);
				
	}

}
