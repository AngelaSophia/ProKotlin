import jdk.jshell.PersistentSnippet

fun main (){
brand()
    var siany=Doctor("Joseph",50)
    siany.sleep()
    siany.talk("I am diging")

//    override fun eat(){
//        super.eat()
//        println("I am eating all kind of food")
//
//    }
}

fun brand(){
    var age = 20
    if (age < 6){
        println("milk")
    }
    else if (age <= 15){
        println("bring fanta")
    }
    else println("bring cocacola")

}
open class Person(var name: String,var age: Int){
    fun talk(words: String){
        println(words)
    }
    fun  sleep(){
        println("mmmmmmmmmmh")
    }
}
class  Banker( name:String, age:Int ): Person(name,age){
//    fun countMoney(notes:List<Int>):Int{
//        var sum =0
//        notes.forEach(note=>sum+=note)
//        return sum
//    }
}

class  Doctor( name: String, age: Int) :Person(name,age){

    fun treatPatient(patient: String, disease: String) {
        println("Treat $patient with these $disease")
    }
}
data class Student(var name:String,var Id:String,var age:Int,var nationality:String,var strime:String){
    var student = listOf(
        Student("Ayugi","354678989",34,"Kenya","Lisa lab"),
        Student("Laura","4567889",43,"Kenyan","Lisa lab"),
        Student("Brawlian","45362729765",23,"Rwandan","Anita B")
    )
    var sortedStudent=student.sortedBy { student ->student.age}
    var descendingSortedStudent=studentbydesorted
}


var descendingSortedCars = cars.sortedByDescending { car -> car.model }


