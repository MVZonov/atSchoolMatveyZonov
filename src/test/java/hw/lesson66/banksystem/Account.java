package hw.lesson66.banksystem;

import java.math.BigDecimal;

abstract class Account {
    private BigDecimal amount; //поле для текущей суммы на счете
    private long account; //поле для текущего номера счета
    private long clientId; //поле для номера клиента банка

    public Account(long account, long clientId) {
        this.account = account;
        this.clientId = clientId;
        amount = BigDecimal.valueOf(0.0);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public long getAccount() {
        return account;
    }

    public long getClientId() {
        return clientId;
    }
    public BigDecimal addToAmount(BigDecimal amount){
        return getAmount().add(amount);
    }
    public BigDecimal subToAmount(BigDecimal amount){
        return getAmount().subtract(amount);
    }
}
