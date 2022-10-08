package com.example.week9_files

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<MyWord>()
      //  File("C:\\Users\\dilni\\AndroidStudioProjects\\Week9_files\\app\\src\\main\\java\\com\\example\\week9_files\\input.txt")
          resources.openRawResource(R.raw.input).bufferedReader()
            .forEachLine {
                val temp = it.split(",") // split the string on ,
                list.add(MyWord(temp[0],temp[1].toInt()))
            }
        list.forEach{
            // kotlin way of doing a for loop
            println("${it.word} -- ${it.num}")
        }

    }
}

data class MyWord(val word:String,val num:Int)