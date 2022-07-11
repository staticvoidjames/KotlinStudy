package 条件表达式

/* 条件表达式 */
/* 表达式 与 语句 的区别: https://www.zhihu.com/question/20750344/answer/16052631 */
fun main() {

    val score = 59

    var grade: String
    if (score in 0..59) {
        grade = "不及格"
    } else if (score in 60..79) {
        grade = "及格"
    } else if (score in 80..100) {
        grade = "优秀"
    } else {
        grade = "???"
    }
    println(grade)

    /* 表达式有返回值 */
    grade = when (score) {
        in 0..59 -> "不及格"
        in 60..79 -> "及格"
        in 80..100 -> "优秀"
        else -> "???"
    }
    println(grade)

    if (score !in 60..100) {
        println("不及格!!!")
    }

    /*字符串模板*/
    val jack = "Jack"
    val rose = "Rose"
    val letLove = true
    println("$jack ${if (letLove) "really" else "can't"}  love $rose")
}
