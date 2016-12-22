public static void main(String[] args) {
		int a[]={5,65,93};int m=0;
		Arrays.sort(a);
		String s="";
		
		for(int i=a.length-1;i>=0;i--){
			s+=a[i];
		}
		int b=Integer.parseInt(s);System.out.println(b);
		String c=String.valueOf(b);
		int d=c.length()%3;int e=0;
		if(d!=0){for(int j=0;j<=d-1;j++){
			System.out.print(c.charAt(j));e++;
		}System.out.print(",");
		for(d=e;d<c.length();d++){
			System.out.print(c.charAt(d));
			if(d==e+3){
				System.out.print(",");
			}
		}}else if(d==0){
			for(d=e;d<c.length();d++){
				System.out.print(c.charAt(d));
				if(d==e+2){
					System.out.print(",");
				}
		}
	}
}
