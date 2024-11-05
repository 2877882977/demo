package demo.entity;

import java.util.Date;

public class Es {
    private Integer id;

    private String pno;

    private String title;

    private String type;

    private String ap;

    private String apno;

    private String no;

    private Date apdate;

    private String aupno;

    private Date aupdate;

    private String address;

    private String deaddress;

    private String inventor;

    private String ipc;

    private String ipc1;

    private String agency;

    private String priority;

    private String agent;

    private String ctno;

    private String laws;

    private String comb;

    private String state;

    private String fee;

    private String lawStatus;

    private String lawName;

    private Date lawDate;

    private String caseStatus;

    private Date cTime;

    private Date uTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno == null ? null : pno.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap == null ? null : ap.trim();
    }

    public String getApno() {
        return apno;
    }

    public void setApno(String apno) {
        this.apno = apno == null ? null : apno.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public Date getApdate() {
        return apdate;
    }

    public void setApdate(Date apdate) {
        this.apdate = apdate;
    }

    public String getAupno() {
        return aupno;
    }

    public void setAupno(String aupno) {
        this.aupno = aupno == null ? null : aupno.trim();
    }

    public Date getAupdate() {
        return aupdate;
    }

    public void setAupdate(Date aupdate) {
        this.aupdate = aupdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDeaddress() {
        return deaddress;
    }

    public void setDeaddress(String deaddress) {
        this.deaddress = deaddress == null ? null : deaddress.trim();
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor == null ? null : inventor.trim();
    }

    public String getIpc() {
        return ipc;
    }

    public void setIpc(String ipc) {
        this.ipc = ipc == null ? null : ipc.trim();
    }

    public String getIpc1() {
        return ipc1;
    }

    public void setIpc1(String ipc1) {
        this.ipc1 = ipc1 == null ? null : ipc1.trim();
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency == null ? null : agency.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public String getCtno() {
        return ctno;
    }

    public void setCtno(String ctno) {
        this.ctno = ctno == null ? null : ctno.trim();
    }

    public String getLaws() {
        return laws;
    }

    public void setLaws(String laws) {
        this.laws = laws == null ? null : laws.trim();
    }

    public String getComb() {
        return comb;
    }

    public void setComb(String comb) {
        this.comb = comb == null ? null : comb.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getLawStatus() {
        return lawStatus;
    }

    public void setLawStatus(String lawStatus) {
        this.lawStatus = lawStatus == null ? null : lawStatus.trim();
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(String lawName) {
        this.lawName = lawName == null ? null : lawName.trim();
    }

    public Date getLawDate() {
        return lawDate;
    }

    public void setLawDate(Date lawDate) {
        this.lawDate = lawDate;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus == null ? null : caseStatus.trim();
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }
    @Override
    public String toString() {
        return "Es{" +
                "id=" + id +
                ", pno='" + pno + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", ap='" + ap + '\'' +
                ", apno='" + apno + '\'' +
                ", no='" + no + '\'' +
                ", apdate=" + apdate +
                ", aupno='" + aupno + '\'' +
                ", aupdate=" + aupdate +
                ", address='" + address + '\'' +
                ", deaddress='" + deaddress + '\'' +
                ", inventor='" + inventor + '\'' +
                ", ipc='" + ipc + '\'' +
                ", ipc1='" + ipc1 + '\'' +
                ", agency='" + agency + '\'' +
                ", priority='" + priority + '\'' +
                ", agent='" + agent + '\'' +
                ", ctno='" + ctno + '\'' +
                ", laws='" + laws + '\'' +
                ", comb='" + comb + '\'' +
                ", state='" + state + '\'' +
                ", fee='" + fee + '\'' +
                ", lawStatus='" + lawStatus + '\'' +
                ", lawName='" + lawName + '\'' +
                ", lawDate=" + lawDate +
                ", caseStatus='" + caseStatus + '\'' +
                ", cTime=" + cTime +
                ", uTime=" + uTime +
                '}';
    }
}