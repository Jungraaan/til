public class Main {
    public static void main(String[] args) {  //JAVA 프로그램 시작 시 실행되는 코드
        String result = repeatAlphabet("hello", 2); // repeatAlphabet: 함수를 정의하고, 입력된 문자열의 각 문자를 주어진 횟수만큼 반복하여 결과 문자열을 생성
        System.out.println("Result: " + result); // System.out.println(...): 괄호 안에 있는 내용을 콘솔에 출력, "Result: " + result: 문자열 연결(concatenation)을 사용하여 결과를 출력
    }

    public static String repeatAlphabet(String input, int n) {  // input: 문자열을 나타내는 매개변수, n: 반복 횟수를 나타내는 매개변수
        StringBuilder output = new StringBuilder(); // StringBuilder 객체는 가변적인 크기의 문자열을 관리하는데 사용되며, 문자열을 빈번하게 수정해야 할 때 유용
        for (char c : input.toCharArray()) {  // for (char c : input.toCharArray()) { ... }: 입력된 문자열의 각 문자를 순회, toCharArray() 메서드를 사용하여 문자열을 문자 배열로 변환
            for (int i = 0; i < n; i++) { // for (int i = 0; i < n; i++) { ... }: 주어진 횟수(n)만큼 문자를 반복
                output.append(c); // output.append(c)를 통해 결과 문자열에 문자를 추가
            }
        }
        return output.toString(); // output.toString()은 StringBuilder 클래스를 사용하여 생성한 문자열을 일반적인 문자열로 변환하는 메서드
    }
}
