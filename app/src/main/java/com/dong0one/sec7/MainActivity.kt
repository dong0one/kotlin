package com.dong0one.sec7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var variable  = 357

        //배열
        //Int -> IntArray
        var IntArr:IntArray = IntArray(10)
        //index = 0부터 시작
        IntArr[0] = 10
        IntArr[9] = 100
        //IntArr[10]은 범위를 벗어나는 인덱스
        Log.d("array", "9번 인덱스의 값${IntArr[9]}")

        var weekArray = CharArray(7)
        weekArray[0] = '월'
        weekArray[6] = '일'

        //컬렉션: list, listOf()로 초기화, <> -> Generic(타입 특정)
        //리스트(배열이랑 동일), 뮤터블리스트(동적)
        var list = listOf<Int>()
        var mutableList = mutableListOf<Int>()
        //값 넣기
        mutableList.add(5) //index 0
        mutableList.add(10) //index 1

        Log.d("컬렉션", "3번 인덱스의 값 = ${mutableList.get(3)}")

        //맵은 키, 벨류 형태
        var mutableMap = mutableMapOf<String, String>()
        mutableMap.put("변수1", "값")
        mutableMap.put("변수2", "값")
        Log.d("컬렉션", "맵 변수1의 값 = ${mutableMap.get("변수1")}")
    }
}