package demo.entity;

public class EsWithBLOBs extends Es {
    private String abstr;

    private String claim;

    private String laws;

    private String scope;

    public String getAbstr() {
        return abstr;
    }

    public void setAbstr(String abstr) {
        this.abstr = abstr == null ? null : abstr.trim();
    }

    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim == null ? null : claim.trim();
    }

    public String getLaws() {
        return laws;
    }

    public void setLaws(String laws) {
        this.laws = laws == null ? null : laws.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }
}