package com.example.financeappprojectkotlin.Repository

import com.example.financeappprojectkotlin.Domain.ExpenseDomain

class MainRepository {
    val items= mutableListOf(
        ExpenseDomain("Resturant", 300.5,"img1","30 juillet 2024") ,
        ExpenseDomain("hopital", 110.5,"img2","31 juillet 2024"),
         ExpenseDomain("Cinema", 20.0,"img3","23 aout 2024"),
        ExpenseDomain("Souperette", 1003.5,"img4","5 aout 2024"),


    )
}