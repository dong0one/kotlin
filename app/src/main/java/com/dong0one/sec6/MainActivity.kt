package com.dong0one.sec6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var first = 300
        var second = 500
        var third = 270

        //비교연산자 <, >, >=, <=, ==, !=
        var result1 = first < 500
        Log.d("compare", "첫번째 결과 = ${result1}")
        var result2 = second < 500
        Log.d("compare", "두번째 결과 = ${result2}")

        //논리연산자(대부분 비교연산자의 결과를 다시 한 번 비교할 때 사용)
        var logic1 = result1 && result2
        Log.d("compare", "논리연산 && 결과 = ${logic1}")
        var logic2 = result1 || result2
        Log.d("compare", "논리연산 || 결과 = ${logic2}")
        var logic3 = !result1
        Log.d("compare", "논리연산 ! 결과 = ${logic3}")

        //if(조건식 = 비교연산 + 논리연산){ }
        var month1 = 7
        if(month1 > 9){
            Log.d("if", "가을 옷을 입습니다.")
        }
        else if(month1 < 0 && month1 > 6){
            Log.d("if", "해수욕장을 갑니다.")

        }
        else{
            //위의 if 조건문 만족하지 않았을 때 실행되는 코드블럭
            Log.d("if", "집에 있습니다.")
        }

        //when = 거의 대부분의 언어에선 switch, if문의 확장판
        var month2 = 6
        when(month2){
            6 -> {
                Log.d("when", "6월 입니다.")
            }
            9 -> {
                Log.d("when", "9월 입니다.")
            }
            9, 10, 11 ->{
                Log.d("when", "가을입니다.")
            }
            in 9..11 ->{
                Log.d("when", "가을입니다.")
            }
            else -> {
                Log.d("if", "집에 있습니다.")
            }
        }
    }

}