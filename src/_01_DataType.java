public class _01_DataType {

    public static void main(String[] args) {

        // 변수명의 구성 : 알파벳, 숫자, _, $ 로 구성
        // 카멜 표기법 : helloJavaWorld => 단어가 바뀔 때마다 대문자로 표기

        // 진수 표현
        int num = 10;       // 10진수
        int bNum = 0B1010;  // 2진수 "0B"
        int oNum = 012;     // 8진수 "0"
        int hNum = 0xA;     // 16진수 "0x"

        // 음수 표현
        // 양수에 2의보수(1의보수 + 1)를 취함
        int pFive = 0B00000000000000000000000000000101;  // +5
        int nFive = 0B11111111111111111111111111111011;  // -5
        int sum = pFive + nFive;                          // (+5) + (-5) = 0

        // 자료형
        boolean _1Byte = true;  // true, false
        char ____2Byte = 'A';   // '\u0000'(0) ~ '\uFFFF'(65535)( (16비트 유니코드 문자 데이터)
        byte ____1Byte = -128;
        short ___2Byte = -32768;
        int _____4Byte = -2147483648;
        long ____8Byte = -9223372036854775808L;   // 정수를 "L"을 이용하여 long 타입으로 초기화
        float ___4Byte = 3.14F; // 1.4E-45 ~ 3.4028235E38 // "F"를 이용하여 float 타입으로 초기화
        double __8Byte = 3.14;  // 4.9E-324 ~ 1.7976931348623157E308
            // float  : 부호비트(1) 지수부(8)  가수부(23)
            // double : 부호비트(1) 지수부(11) 가수부(52)

        // 상수
        final double PI = 3.14; // 상수 식별자 "final"

        // 리터럴 : 프로그램에서 사용하는 모든 숫자, 문자, 논리값
        // 위에서 "PI"는 변수, "3.14"는 리터럴

        // 형변환
        // 묵시적형변환 : byte -> short/char -> int -> long -> float -> double
        byte bNum_ = 10;
        int iNum_ = bNum;               // byte -> int
        long lNum_ = 10;                // int -> long
        float fNum_ = lNum_;            // long -> float
        double dNum_ = fNum_ + iNum_;   // (int -> float) -> double
        // 명시적형변환 : 묵시적형변환의 반대
        double PI_ = 3.14;
        int pi_ = (int)PI_;             // double -> int
    }
}