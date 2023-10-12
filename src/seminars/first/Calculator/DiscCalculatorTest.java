package seminars.first.Calculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class DiscCalculatorTest {

    public static void main(String[] args) {
        testCalculatingDiscountWithValidInput();
        testCalculatingDiscountWithNegativePurchaseAmount();
        testCalculatingDiscountWithGreaterDiscountAmount();
    }

    @Test
    public static void testCalculatingDiscountWithValidInput() {
        double purchaseAmount = 100.0;
        int discountAmount = 20;
        double expectedDiscountedAmount = 80.0; // ожидаемая сумма покупки со скидкой
        double actualDiscountedAmount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);
        // используем AssertJ для проверки ожидаемого и фактического результата
        Assertions.assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    public static void testCalculatingDiscountWithNegativePurchaseAmount() {
        double purchaseAmount = -100.0; // отрицательная сумма покупки
        int discountAmount = 20;
        // ожидаемое исключение ArithmeticException
        Assertions.assertThatThrownBy(() -> Calculator.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    public static void testCalculatingDiscountWithGreaterDiscountAmount() {
        double purchaseAmount = 100.0;
        int discountAmount = 120; // скидка больше 100%
        // ожидаемое исключение ArithmeticException
        Assertions.assertThatThrownBy(() -> Calculator.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class);
    }

}