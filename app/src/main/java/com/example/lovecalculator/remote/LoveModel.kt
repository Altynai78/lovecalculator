package com.example.lovecalculator.remote

data class LoveModel(
@SerializedName("fname")
var firstName:String,
@SerializedName("sname")
var secondName:String,
var percentage:String,
var result :String

):java.io.Serializable)
