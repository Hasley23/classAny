class User(val firstName: String, val lastName: String, var age: Int) {
    override fun toString(): String {
        return "User: $firstName $lastName\nAge: $age"
    }

     override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (lastName != other.lastName) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = lastName.hashCode()
        result = 31 * result + age
        return result
    }


}