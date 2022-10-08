package com.example.week9_files

import java.io.File

fun main(){
    val list = mutableListOf<Word>()
        File("C:\\Users\\dilni\\AndroidStudioProjects\\Week9_files\\app\\src\\main\\java\\com\\example\\week9_files\\input.txt")
        .forEachLine {
          val temp = it.split(",") // split the string on ,
            list.add(Word(temp[0],temp[1].toInt()))
        }
    list.forEach{
        // kotlin way of doing a for loop
        println("${it.word} -- ${it.num}")
    }
}

data class Word(val word:String,val num:Int)