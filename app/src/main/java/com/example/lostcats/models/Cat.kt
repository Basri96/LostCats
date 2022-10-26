package com.example.lostcats.models

import java.io.Serializable

data class Cat(val id: Int, val name: String, val age: Int) : Serializable {
    constructor(name: String,age: Int ) : this(-1, name, age)

    override fun toString(): String {
        return "$id $name $age"
    }
}
