package org.example.spocktraining;

import spock.lang.Specification;

class FizzBuzzSpec extends Specification {

    def "FizzBuzz #number(#description)"() {
        given:
        def sut = new FizzBuzz()

        when:
        def result = sut.generate(number)

        then:
        result == expected

        where: "パラメータ"
        number | expected   || description
        1      | "1"        || "通常の数"
        2      | "2"        || "通常の数"
        3      | "Fizz"     || "3の倍数"
        4      | "4"        || "通常の数"
        5      | "Buzz"     || "5の倍数"
        6      | "Fizz"     || "3の倍数"
        9      | "Fizz"     || "3の倍数"
        10     | "Buzz"     || "5の倍数"
        12     | "Fizz"     || "3の倍数"
        15     | "FizzBuzz" || "3と5の倍数"
    }
}