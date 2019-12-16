# JunoShopDaggerTaskKotlin
Задания, для провеки уровня владением Dagger, на тематику приложения агрегатора товаров в магазинах
---
Ход выполнения:
1. Создать свой репозиторий из этого шаблона
2. Реализовать поведение описанное в MainActivity
3. Закоммитить решение и запушить в свой репозиторий на своем аккаунте
4. Скинуть ссылку на репозиторий на почту hello@junohunt.ru

## Задача 1
---
Ваша задача №1.
Создать extension для EditText с названием bindWithTv
в который качестве аргумента передается TextView.
Этот extension должен:
1. По изменению текста в EditText делить строку по пробелу
2. Выбирать только те строки, длина которых > 2
3. Сортировать их все в алфавитном порядке
4. выводить в TextView в виде столбика

![task1](https://github.com/JunoHunt/JunoShopKotlinTask/blob/master/examples/KotlinTashGif.gif)

## Задача 2
---
Задача №2 со звездочкой*
Создать extension для SharedPreferences с названием get,
он должен принимать 2 параметра первый key класса String,
а второй defValue, который может быть любым классом.
Extension должен определять какого класса параметр defValue.
Если defValue класса String, Int или Long, то надо возвраать значение
этого класса взятое из SharedPreferences.
Если defValue другого класса, необходимо выбрасывать
UnsupportedOperationException("$(название класса) is not recognized" )
