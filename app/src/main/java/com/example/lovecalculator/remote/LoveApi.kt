package com.example.lovecalculator.remote

interface LoveApi
@GET("getPercentage")
fun persentageNames(
    @Query("fname") firstName: String,
    @Query("sname") secondName: String,
    @Header("X-RapidAPI-Key") key: String = "a7461364b3mshe283389668cdbccp1a8b9bjsnac7111e02e0e",
    @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"
): retrofit2.Call<LoveModel>

 {
}