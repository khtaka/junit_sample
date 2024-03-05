package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void multiplyで3と4の乗算結果を取得する() {
	    // Calculatorクラスのインスタンスを生成する
	    // テスト用のオブジェクトの変数名はよくsut(System under test、テスト対象の略)を用います
	    Calculator sut = new Calculator();
	    // 想定する計算結果の用意
	    int expected = 12;
	    // 3 x 4の結果を`multiply()`に計算させる
	    int actual = sut.multiply(3, 4);
	    // 計算結果が12となるか検証する
	    assertThat(actual).isEqualTo(expected);
	}

}
