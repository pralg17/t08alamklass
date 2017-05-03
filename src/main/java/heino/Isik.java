//package heino;

class Isik {
    private String eesNimi;
    private String pereNimi;
    private Integer vanus;
    private String status;

    public String getEesNimi() {
        return eesNimi;
    }

    public void setEesNimi(String eesNimi) {
        this.eesNimi = eesNimi;
    }

    public String getPereNimi() {
        return pereNimi;
    }

    public void setPereNimi(String pereNimi) {
        this.pereNimi = pereNimi;
    }

    public Integer getVanus() {
        return vanus;
    }

    public void setVanus(Integer vanus) {
        this.vanus = vanus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNimi(){
        return eesNimi + " " + pereNimi;
    }

    @Override
    public String toString(){
        return "Nimi: " + getNimi() + "\nVanus: " + vanus + "\n"; 
    }
}
