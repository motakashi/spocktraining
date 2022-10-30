package org.example.spocktraining;

import spock.lang.Specification;

class SomeClientSpec extends Specification {
    def "スタブを使ったテスト"() {
        given: "スタブの生成"
        SomeService stub = Stub()

        and: "スタブのセットアップ"
        stub.calculate(1) >> 100
        //stub.calculate(_) >>> [100, 200]

        and: "SUT"
        def sut = new SomeClient(stub)

        when: "実行"
        def result = sut.execute(1)

        then: "アサーション"
        result == 100
    }

    def "モックを使ったテスト"() {
        given: "モックの生成"
        SomeService mock = Mock()

        and: "モックの検証"
        1 * mock.calculate(1) >> 100
        //0 * mock.calculate(_)
        //_ * mock.calculate(_) >> 100
        //(1..3) * mock.calculate(1) >> 100

        and: "SUT"
        def sut = new SomeClient(mock)

        when: "実行"
        def result = sut.execute(1)

        then: "アサーション"
        result == 100
    }
}