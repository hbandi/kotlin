package com.hb.code.koans

fun groupByLength():Map<Int,List<String>>{
    return listOf<String>("a","ab","bz","c","abc","abcd","adb","wxyz").groupBy { it.length }
}

class Employee(name:String,age:Int,company:String,salary:Int,city:String)

fun employees():List<Employee>{
    return arrayListOf<Employee>(Employee("hanu",32,"IVY",10000,"HYD"),
            Employee("sinu",22,"IVY",20000,"HYD"),
            Employee("monu",44,"TSYS",30000,"BLR"),
            Employee("konu",88,"IVY",40000,"PUNE"),
            Employee("ramu",77,"IVY",50000,"MUMBAI"),
            Employee("manuu",22,"IVY",60000,"VIZAG"),
            Employee("bro",22,"IVY",100110,"HYD"),
            Employee("santhi",90,"IVY",90000,"HYD"),
            Employee("bar",10,"IVY",918910,"HYD")
    )
}


fun main(args: Array<String>) {

}
