package persistance;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class AccountType {
    private boolean accountTypeId;
    private String accountTypeCurrency;
    private Date accountTypeDateCreation;

    @Id
    @Column(name = "AccountType_ID")
    public boolean isAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(boolean accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @Basic
    @Column(name = "AccountType_Currency")
    public String getAccountTypeCurrency() {
        return accountTypeCurrency;
    }

    public void setAccountTypeCurrency(String accountTypeCurrency) {
        this.accountTypeCurrency = accountTypeCurrency;
    }

    @Basic
    @Column(name = "AccountType_DateCreation")
    public Date getAccountTypeDateCreation() {
        return accountTypeDateCreation;
    }

    public void setAccountTypeDateCreation(Date accountTypeDateCreation) {
        this.accountTypeDateCreation = accountTypeDateCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return accountTypeId == that.accountTypeId && Objects.equals(accountTypeCurrency, that.accountTypeCurrency) && Objects.equals(accountTypeDateCreation, that.accountTypeDateCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTypeId, accountTypeCurrency, accountTypeDateCreation);
    }
}
