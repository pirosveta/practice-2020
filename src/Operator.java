public enum Operator {
	MOVE_UP(1382),
	MOVE_DOWN(1383),
	MOVE_RIGHT(1153),
	MOVE_LEFT(1381),
	MOVE_RIGHT_IF_TRUE(1110),
	MOVE_DOWN_IF_TRUE(733),
	END_OF_PROGRAM(545),

	// ARITHMETIC OPERATION
	ADDITION(1141),
	SUBTRACTION(1142),
	MULTIPLICATION(1270),
	DIVISION(555),
	MODULO(1143),

	// COMPARATORS
	EQUALLY(721),
	MORE(917),
	LESS(918),

	// LOGISTIC OPERATORS
	NOT(837),
	AND(830),
	OR(1260),

	// COMMANDS
	VARIABLE(610),
	FUNCTION(584),
	WORK_WITH_TEXT(708),
	TEXT_OUTPUT(556),
	IF(820),

	// EMPTY
	EMPTY(32);

	// функции для работы с enum
	private final int symbolCode;

	Operator(int symbolCode) {
		this.symbolCode = symbolCode;
	}



	public int getSymbolCode() {
		return this.symbolCode;
	}
}
