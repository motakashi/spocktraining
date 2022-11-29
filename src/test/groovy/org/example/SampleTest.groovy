package org.example

import spock.lang.Specification

class SampleTest extends Specification {
    def "privateメソッドの実行"() {
        given:
        def sut = new Sample()

        when:
        def result = sut.getName()

        then:
        result == "初期値"
    }
}
