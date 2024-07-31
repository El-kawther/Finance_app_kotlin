package com.example.financeappprojectkotlin.ViewModel

import androidx.lifecycle.ViewModel
import com.example.financeappprojectkotlin.Repository.MainRepository

class MainViewModel (val repository: MainRepository):ViewModel(){
    constructor():this(MainRepository())
    fun loadData()=repository.items

}