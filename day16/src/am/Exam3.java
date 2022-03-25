package am;

public class Exam3 {
	public static void main(String[] args) {
		G g = new G();
		System.out.println(g.a);
		System.out.println(g.b);
		System.out.println(g.c);
		System.out.println(g.d);
	}
}


class G{
	int a,b,c,d;
	G() {
		 this(5);
	}
	G(int k){
		a = k;
		b = k;
		c = k;
		d = k;
	}
}