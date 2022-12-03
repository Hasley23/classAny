fun main(args: Array<String>) {
    val str1 = "str"
    val str2 = "str"
    val user1 = User("John","Doe",25)
    val user2 = User("John","Doe",25)
    //val userNew = User("Toni","Stark",30)


    println(user1.equals(user2))
    println(user1.hashCode())
    println(user2.hashCode())
    //println(userNew)
}