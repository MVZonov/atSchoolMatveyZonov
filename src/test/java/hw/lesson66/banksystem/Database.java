package hw.lesson66.banksystem;

import java.math.BigDecimal;

public abstract class Database {

    public void deposit(BigDecimal amount, Account account) {
    } //      сохраняет указанную сумму на указанный счет

    protected abstract void withdraw(BigDecimal amount, Account account); //      забирает указанную сумму на указанный счет

    protected abstract BigDecimal getAmount(Account account); //      получает значение суммы с указанного счета

    public void transfer(BigDecimal amount, Account writeOffAccount, Account replenishedOffAccount) {
//      передает указанную сумму с одного указанного счета на другой
        withdraw(amount, writeOffAccount);
        deposit(amount, replenishedOffAccount);
    }
}
