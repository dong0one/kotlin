package com.dong0one.sec8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //intArrayOf : 배열에 저장할 값을 미리 할당
        var intArray = intArrayOf(0,1,2,3,4,5,6,7,8)
        for (value in intArray){
            Log.d("반복문", "value=${value}")}
        //for
        //일반적으로 몇 번의 횟수를 반복하는 형태
        //until : 마지막 값은 제외
        //step : 건너뜀 1 until 10 step 2
        //downTo : 값을 감소 -> in 10 downTo 1
        for(index in 1 until 10){
            Log.d("반복문", "index = ${index}")
        }
        //while
        var out = 0
        while(out < 3){
            Log.d("while", "현재 out 카운트=${out}")
            out = out + 1
        }

        //do while -> 무조건 한 번의 실행
        do{
            Log.d("while", "현재 out 카운트=${out}")
            out = out + 1
        }while(out <3)

        //control loop -> break, continue
        for(index in 1..10){
            if(index > 5) break
            else if(index == 5) continue
            Log.d("for", "현재 숫자=${index}")
        }
    }
}