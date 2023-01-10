package phurua.it.mytravel;

public class DiaDiem {
    public DiaDiem(String tendiadiem, String mota, int hinhanh) {
        this.tendiadiem = tendiadiem;
        this.mota = mota;
        this.hinhanh = hinhanh;
    }

    String tendiadiem, mota;
    int hinhanh;

    public String getTendiadiem() {
        return tendiadiem;
    }

    public void setTendiadiem(String tendiadiem) {
        this.tendiadiem = tendiadiem;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
