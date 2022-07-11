package 变量

/* 变量 & 类型推断 */

/* 编译时常量 */
const val MAX = 200

fun main() {

    /* val 定义只读变量 */
    val age : Int = 5
    /* 不能修改 */
    // age = 4
    println(age)

    /* var 定义可写变量 */
    var grade : Int
    grade = 4
    println(grade)

    println(MAX)

    /* 类型推导 */
    var str = "Hello World"
    println(str)

}