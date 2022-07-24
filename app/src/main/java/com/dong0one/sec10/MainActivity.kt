package com.dong0one.sec10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //클래스의 사용
        //1.초기화
        var cls = 클래스() //인스턴스 = 메모리에 로드되어 있는 클래스

        cls.variable
        cls.function()

        //2.companion object로 만들기
        Log.d("태그", "메시지")

        var child = Child()
        child.showMoney()

        var parent = Parent()
        parent.showHouse()

        var child2 = Child()
        child2.showHouse()

        var son = Son()
        var result1 = son.getNumber("홍")
    }
}

class Log{
    companion object {
        var variable = "난 누구"
        fun d(tag: String, msg: String) {
            print("[$tag] : $msg")

        }
    }
}

//class : 변수(property)와 함수(method)의 모음
class 클래스 {
    init{
        //클래스를 초기화하면 호출된다
    }
    var variable:String = "" // 변수 - 프로파티

    fun function() { //함수 - 메서드
        var variable_local = ""
    }
}

//상속
//상속을 하는 이유
//1. 기존의 작성된 코드를 재활용하기 위해
//2. 코드를 재활용하는데 -> 체계적인 구조로 사용하기 위해
//open : 상속을 할 수 있다는 의미
open class Parent{
    var money = 50000000
    open var house = "강납 200평 아파트"

    open fun showHouse(){
        Log.d("클레스", "my house =${house}")
    }
}
//            초기화화
class Child : Parent(){
    //상솓받으면, parent class의 property와 method를 내 것처럼 사용 가능
    override var house = "강남 10평 오피스텔"

    fun showMoney(){
        Log.d("클레스", "money=${money}")
    }

    override fun showHouse(){
        Log.d("클레스", "my house =${house}")
    }

}

//overroad : 파라미터가 다르면 함수명이 같아도 함수 정의 가능
class Son{
    fun getNumber() : Int{
        return 1
    }

    fun getNumber(param:String) : Int{
        return 2
    }
}