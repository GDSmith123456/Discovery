package persistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class AccountTransaction {
    @Id
    @Column(name = "ACCOUNT_id", nullable = false)
    private Long id;

    @Column(name = "ACCOUNT_MEMBER_ID")
    private Long accountMemberId;

    @Column(name = "ACCOUNT_AMOUNT")
    private Long accountAmount;

    @Column(name = "ACCOUNT_DATE")
    private LocalDate accountDate;

    public LocalDate getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(LocalDate accountDate) {
        this.accountDate = accountDate;
    }

    public Long getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(Long accountAmount) {
        this.accountAmount = accountAmount;
    }

    public Long getAccountMemberId() {
        return accountMemberId;
    }

    public void setAccountMemberId(Long accountMemberId) {
        this.accountMemberId = accountMemberId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "id=" + id +
                ", accountMemberId=" + accountMemberId +
                ", accountAmount=" + accountAmount +
                ", accountDate=" + accountDate +
                '}';
    }
}