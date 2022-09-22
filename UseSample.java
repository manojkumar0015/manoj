package classs;

public class UseSample {
	public static void main(String[] args) {
		Sample s1=new Sample();
		s1.name="anoj";
		s1.age=54;
		s1.idCard=56984;
		s1.isPresent=true;
		
		Sample s2=new Sample();
		s2.name="abilan";
		s2.age=25;
		s2.idCard=47984;
		s2.isPresent=true;
		
		Sample s3=new Sample();
		s3.name="jp";
		s3.age=96;
		s3.idCard=69984;
		s3.isPresent=false;
		Sample[] p=new Sample[3];
		p[0]=s1;
		p[1]=s2;
		p[2]=s3;
		for(int i=0;i<p.length;i++) {
			if(p[i].age==25) {
				System.out.println(p[i].isPresent+p[i].name);
			}
		/*int max=0;String name="";
		for(int i=0;i<p.length;i++) {
			if(p[i].idCard>max) {
				max=p[i].idCard;
				name=p[i].name;
				
			}
		}
		System.out.println(name);*/
		
		/*int min=p[0].idCard; int age=0;
		for(int i=0;i<p.length;i++) {
			if(p[i].idCard<min) {
				min=p[i].idCard;
				age=p[i].age;
			}
		}
		System.out.println(age);*/
		
		
				
				
			
				
				
			}
			
	}
}
			
		 
		
		
	


