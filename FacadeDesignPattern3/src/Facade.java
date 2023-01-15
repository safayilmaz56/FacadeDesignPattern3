public class Facade {
    private Banka banka;
    private MerkezBankasi merkezBankasi;
    private Kredi kredi;


    public Facade(){
        banka = new Banka();
        merkezBankasi = new MerkezBankasi();
        kredi = new Kredi();
    }

    public Banka getBanka() {
        return banka;
    }

    public void setBanka(Banka banka) {
        this.banka = banka;
    }

    public MerkezBankasi getMerkezBankasi() {
        return merkezBankasi;
    }

    public void setMerkezBankasi(MerkezBankasi merkezBankasi) {
        this.merkezBankasi = merkezBankasi;
    }

    public Kredi getKredi() {
        return kredi;
    }

    public void setKredi(Kredi kredi) {
        this.kredi = kredi;
    }

    public void krediKullan(Musteri m, double talep){
        if(!merkezBankasi.karaListeKontrol(m.tcNo) && kredi.krediKullanmaDurumu(m)){
            banka.krediyiKullan(m,talep);
            System.out.println("Kredi kullanildi");
        }
    }

}
