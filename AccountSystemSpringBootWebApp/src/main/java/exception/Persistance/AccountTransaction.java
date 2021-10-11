package exception.Persistance;

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

    @Id
    @Column(name = "ACCOUNT_TYPE_PK", nullable = false)
    private Long id1;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "TRANSACTION_DATE")
    private LocalDate transactionDate;
    public AccountTransaction (){

    }
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getId1() {
        return id1;
    }

    public void setId1(Long id1) {
        this.id1 = id1;
    }

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
                ", id1=" + id1 +
                ", memberId=" + memberId +
                ", transactionDate=" + transactionDate +
                '}';
    }
}