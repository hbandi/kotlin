package com.hb.code

fun whenUsage(x:Int){
    when(x){
        101 -> print("help")
        108 -> print("health")
        109 -> print("polic")
        else-> {
            print("jaffa")
        }
    }

}

fun main(args:Array<String>){
    whenUsage(1011)
}