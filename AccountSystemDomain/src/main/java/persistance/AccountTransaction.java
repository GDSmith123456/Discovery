package persistance;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class AccountTransaction {
    private boolean accountTransactionId;
    private boolean accountTransactionAmount;

    @Id
    @Column(name = "AccountTransaction_ID")
    public boolean isAccountTransactionId() {
        return accountTransactionId;
    }

    public void setAccountTransactionId(boolean accountTransactionId) {
        this.accountTransactionId = accountTransactionId;
    }

    @Basic
    @Column(name = "AccountTransaction_Amount")
    public boolean isAccountTransactionAmount() {
        return accountTransactionAmount;
    }

    public void setAccountTransactionAmount(boolean accountTransactionAmount) {
        this.accountTransactionAmount = accountTransactionAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return accountTransactionId == that.accountTransactionId && accountTransactionAmount == that.accountTransactionAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTransactionId, accountTransactionAmount);
    }
}
