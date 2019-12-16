package com.example.junoshopkotlintask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    /***
     * Ваша задача №1.
     * Создать extension для EditText с названием bindWithTv
     * в который качестве аргумента передается TextView.
     *
     * Этот extension должен:
     * 1. По изменению текста в EditText делить строку по пробелу
     * 2. Выбирать только те строки, длина которых > 2
     * 3. Сортировать их все в алфавитном порядке
     * 4. выводить в TextView в виде столбика
     *
     * Задача №2 со звездочкой*
     * Создать extension для SharedPreferences с названием get,
     * он должен принимать 2 параметра первый key класса String,
     * а второй defValue, который может быть любым классом.
     * Extension должен определять какого класса параметр defValue.
     * Если defValue класса String, Int или Long, то надо возвраать значение
     * этого класса взятое из SharedPreferences.
     * Если defValue другого класса, необходимо выбрасывать
     * UnsupportedOperationException("$(название класса) is not recognized" )
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
