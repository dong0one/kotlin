package com.dong0one.sec4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName = "김보현" //var는 변수의 내용을 수정 가능
        Log.d(TAG, "my name = $myName" )
        myName = "홍길동"
        Log.d(TAG, "my name = $myName" )
        val myAge = 21       //val는 변수의 내용을 수정 불가
        Log.d(TAG, "my age = $myAge" )

        var myNumbers = "1,2,3,4,5,6,"
        var thisWeekNumbers = "5,6,7,8,9,10"

        if(myNumbers == thisWeekNumbers) {
            textLog.text = "당첨되었습니다"
            //Log.d(TAG, "당첨되었습니다")
        }else{
            textLog.text = "당첨되지 않았습니다"
            //Log.d(TAG, "당첨되지 않았습니다")
        }

        for(idx in 1..10) {
            textLog.append("\n현재 숫자는 ${idx}입니다")

        }
    }
}