package pm;

public class Exam6 {

	public static void main(String[] args) {
/* exception 예외 
개발자가 프로그램을 작성하는 과정에서의 실수 혹은 
사용자가 잘못된 값을 입력하는 경우에서도 예외가 즉 오류가 발생할수 있다. 

다양하게 발생하는 오류 중 개발자가 해결할 수 있는 오류를 '예외'라고 한다. 
이러한 예외가 발생했을 때 이를 적절하게 처리하는 것을 '예외 처리'라고 한다. 

예외와 에러의 차이
예외는 '연산오류, 숫자 포맷오류 등과 같이 상황에 따라 개발자가 해결할 수 있는 '오류'
여기서 해결 할수 있는의 의미는 오류 자체를 수정할 수 있다는 것이 아니라
오류가 발생했을 때 차선책으로 선택을 하는 것을 말한다. 
반면에 에러는 자바 에서 발생하는 오류로 개발자가 해결할 수 없는 오류를 말한다. 

자바에서는 예외도 객체다. 

자바에서 예외의 최상위 클래스 Exception 클래스 
            에러의 최상위 클래스는 Error 클래스

이 2개의 클래스는 모두 Throwable 클래스를 상속받고 있다. 따라서
이 2개의 클래스는 모두 Throwable 클래스의 모든 기능을 포함한다. 


Throwable 클래스를 상속받는 Exception 클래스는 다시 
일반예외checked exception 클래스와 실행예외 unchecked exception
클래스로 나뉜다. 

일반예외는 컴파일 전에 체크
실행예외는 실행 중에 체크한다. 

Exception 클래스에게서 직접 상속받은 예외 클래스 들이 처리하는 일반 예외는
컴파일 전에 예외 발생 문법을 검사한다.
반면  실행예외는 컴파일 전이 아니라 실행할 때 발생하는 예외로 예외 처리를 하지 않더라도
실행은 된다. 따라서 프로그램 실행 중에 프로그램이 강제 종료 되는 이유는 대부분 
실행 예외 때문이다. 

1 일반예외 일반 예외는 예외 처리를 하지 않으면 컴파일 자체 불가능해진다. 
    일반 예외 클래스를 알아보자. 
    
  InterruptedException - Thred.sleep(시간) 매서드는 일정 시간동안
  해당 쓰레드를 일시 정지 상태로 만드는 Thread클래서의 매서드이다. 
  이 매서드는 일반 예외가 발생할 수 있다. 때문에 반드시 예외처리를 해야 한다. 
  예외처리를 생략하면 문법오류가 발생해서 컴파일 자체가 불가능.
  ClassNotFoundException , 
  IOException, 
  FileNotFoundException,
  CloneNotSupportedException


		//1. InterruptedException
		//Thread.sleep(1000);
		
		//2. ClassNotFoundException
		//Class cls = Class.forName("java.lang.Object");
		
		
실행 예외
일반예외는 예외처리를 하지 않으면 오류가 발생하여 실행 자체가 불가능하다. 
실행예외는 일단 실행은 된다. 오류가 발생하지 않는다. 

그렇기 때문에 예외 처리 없이 컴파일과 실행은 가능하지만 실행 중에 실행 예외가 발생하면
프로그램이 강제로 종료된다. 

ArithmeticExcepeion
Arithmetic의 사전적인 의미는 '산술'또는 '연산'이다. 
연산 자체가 불가능 할때 발생되는 실행 예외이다. 
분모가 0일 때 즉 0으로 나눌때 이다. 이렇게 계산을 하게 되면 예외가 발생된다. 
		*/
		
		//System.out.println(3/0);
		
/*
 
 ClassCastException
 상속 관계에 있는 클래스 간의 업캐스팅은 항상 가능하지만 다운캐스팅은 
 '가능할수도 ,'불가능 할수도 있다. 
 classCastExcption 다운 캐스팅이 불가능 한 상황에서 다운캐스팅을 시도할 때
 발생된다. 


ArrayIndexOutOfBoundsException
배열의 인덱스를 잘못 사용할때 발생 

자바에서는 예외 처리 구문이 있으면 적절히 예외가 처리됐다고 판단을 하기 때문에 
프로그램을 강제 종료하지 않는다. 심지어는 예외처리 구문 내에 아무런 코드를 작성하지 않아도
예외처리된것으로 간주하기도 한다. 

 */
		int[] a = {1,2,3};
		
		System.out.println(a[3]);
		
		
		
		
//		A a = new A();
//		B b = (B) a;
	}

}

class A {}
class B extends A {}


