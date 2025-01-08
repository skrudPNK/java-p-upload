package chapter03;

// 코드에 메타데이터를 추가하는 방법
// 툴 또는 프레임워크에 특정 코들르 어떻게 해석해야 하는지에 대한 정보를 제공해줌
// 컴파일러에게 코드 작성의 의도를 알랄 수 있음
// 실행시 특정 코드가 어떻게 동작하는지 지정 가능

// 기본적인 어노테이션
// @OVerride: 지정한 메서드가 상위 클래스의 메서드를 오버라이드하는 메서드임을 컴퓨터에 알림
// @Deprecated: 지정한 메서드가 더 이상 사용되지 않음을 명시
// @SuppressWarnigs: 컴파일 경고를 무시하도록 함

// @param arg

// 커스텀 어노테이션: @interface를 이용하여 어노테이션 직접 생성 가능

@interface CustomAnnotation {
	String value() default "";
}

@CustomAnnotation(value="Hello")

public class H_Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





