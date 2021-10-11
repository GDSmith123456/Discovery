package exception.Persistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class AccountType {
    @Id
    @Column(name = "ACCOUNT_TYPE_ID", nullable = false)
    private Long id;

    @Column(name = "MNEMONIC", length = 50)
    private String mnemonic;

    @Column(name = "ACCOUNT_TYPE_NAME", length = 50)
    private String accountTypeName;

    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;

    @Id
    @Column(name = "ACCOUNT_id", nullable = false)
    private Long id1;

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

    public Long getId1() {
        return id1;
    }

    public void setId1(Long id1) {
        this.id1 = id1;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "id=" + id +
                ", mnemonic='" + mnemonic + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                ", id1=" + id1 +
                ", accountMemberId=" + accountMemberId +
                ", accountAmount=" + accountAmount +
                ", accountDate=" + accountDate +
                '}';
    }
}