class Employee(var firstname:String,var age:Int,var gender:String,var position:String,var salary:Double){
   fun role(task:String){
       println("The role is $task")

   }
}

fun main() {
    var employee1=Employee("Asherray",32,"Male","Managing Director",234000.00)
    var employee2=Employee("Shantel",25,"Female","Human resource manager",139000.00)
println(employee1.firstname)
    println("Employee1 is ${employee1.age} years old")
}
