package persistance;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Member {
    private int memberId;
    private String memberFname;
    private String memberLname;
    private long memberPoints;

    @Id
    @Column(name = "Member_ID")
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "Member_Fname")
    public String getMemberFname() {
        return memberFname;
    }

    public void setMemberFname(String memberFname) {
        this.memberFname = memberFname;
    }

    @Basic
    @Column(name = "Member_Lname")
    public String getMemberLname() {
        return memberLname;
    }

    public void setMemberLname(String memberLname) {
        this.memberLname = memberLname;
    }

    @Basic
    @Column(name = "Member_Points")
    public long getMemberPoints() {
        return memberPoints;
    }

    public void setMemberPoints(long memberPoints) {
        this.memberPoints = memberPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId && memberPoints == member.memberPoints && Objects.equals(memberFname, member.memberFname) && Objects.equals(memberLname, member.memberLname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberFname, memberLname, memberPoints);
    }
}
