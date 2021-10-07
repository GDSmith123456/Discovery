package persistance;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Prizes {
    private int prizesId;
    private String prizesDesc;
    private long prizesCost;

    @Id
    @Column(name = "Prizes_ID")
    public int getPrizesId() {
        return prizesId;
    }

    public void setPrizesId(int prizesId) {
        this.prizesId = prizesId;
    }

    @Basic
    @Column(name = "Prizes_Desc")
    public String getPrizesDesc() {
        return prizesDesc;
    }

    public void setPrizesDesc(String prizesDesc) {
        this.prizesDesc = prizesDesc;
    }

    @Basic
    @Column(name = "Prizes_Cost")
    public long getPrizesCost() {
        return prizesCost;
    }

    public void setPrizesCost(long prizesCost) {
        this.prizesCost = prizesCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prizes prizes = (Prizes) o;
        return prizesId == prizes.prizesId && prizesCost == prizes.prizesCost && Objects.equals(prizesDesc, prizes.prizesDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prizesId, prizesDesc, prizesCost);
    }
}
