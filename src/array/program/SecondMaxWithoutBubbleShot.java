package array.program;

public class SecondMaxWithoutBubbleShot {

	public static void main(String[] args) {
		int a[]= {90,70,20,30,10,50,40,100};
		int fmax=0;
		int smax=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i])
			{
				smax=a[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}

}
