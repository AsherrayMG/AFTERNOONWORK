fun main() {
    var languages = arrayOf("Kotlin", "Python", "Javascript", "PHP", "HTML", "Ruby")
    println(languages[1])
    languages[1] = "C++"
    println(languages[1])

    //Accessing elements
    for (x in languages){
        println(x)
    }

}