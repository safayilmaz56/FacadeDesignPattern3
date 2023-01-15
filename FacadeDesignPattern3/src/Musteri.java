public class Musteri {
    public int musteriNumarasi;
    public String tcNo;
    public String ad;

    public Musteri(int musteriNumarasi, String tcNo, String ad) {
        this.musteriNumarasi = musteriNumarasi;
        this.tcNo = tcNo;
        this.ad = ad;
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
