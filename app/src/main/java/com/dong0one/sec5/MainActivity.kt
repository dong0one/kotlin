package com.dong0one.sec5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var variable:String = "홍길동" //이미 한번 타입을 지정한 변수에 다른 타입이 올 수 없다
        //타입을 미리 특정해서 변수를 설정하는 것이 좋다
        var variable2:String //변수의 타입을 미리 설정
        variable2 = "안녕하세요"

        variable = "다음값" //같은 타입 내에서 내용 수정은 가능

        //코틀린의 기본 타입
        //실수형
        var doubleValue:Double = 33.6 //실수형 포함
        var floatValue:Float = 123.7f //double보단 작은 범위이지만 실수형
        //코틀린은 double과 float을 구분 못하고 전부 double로 인식 -> float형임을 코틀린에게 알려주어야 함


        //정수형
        var intValue:Int = 1234568
        var longValue:Long = 2_147_483_6471 //21474836471이 정수형의 가장 큰 범위
        var shortValue:Short = 123
        var byteValue:Byte = 127

        //문자형
        var chartValue:Char = 'a' //''로 입력해야 한다
        var stringValue:String = "문자열 길이에 상관없이 값을 입력할 수 있다 = 크기를 특정할 수 없다"

       //불린형
        var booleanValue:Boolean = true

        //상수
        val VALVALUE:Boolean = true //값을 바꿀 수 없다
        //상수는 선언할때 변수명을 대문자로


    }
}