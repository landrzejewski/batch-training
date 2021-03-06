package pl.training.batch;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {

    private String number;
    private BigDecimal balance = BigDecimal.ZERO;

    public void changeBalanceBy(BigDecimal amount) {
        balance = balance.add(amount);
    }

}
