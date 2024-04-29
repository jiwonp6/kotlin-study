package ch07_exception

import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader

fun readFile() {
    // 예외 떠넘기기가 된 Exception 을 처리하지 않아도 됨
    // 코틀린에서는 모든 예외가 Unchecked Exception
    val br = BufferedReader(FileReader("README.md"))
    val line = br.readLine()
    println(line)
    br.close()

    // 예외가 발생하지 않는 것은 아니기 때문에, 발생 예상되는 예외를 따로 적절한 예외처리를 하면 됨
    try {
    } catch (e: FileNotFoundException) {
        println("파일을 찾을 수 없습니다.")
    }
}

fun main() {
    readFile()
}