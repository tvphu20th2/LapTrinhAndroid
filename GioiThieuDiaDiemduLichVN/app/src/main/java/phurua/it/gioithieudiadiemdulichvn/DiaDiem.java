package phurua.it.gioithieudiadiemdulichvn;

public class DiaDiem {
    String tendiadiem;
    int hinhanh;
    String mota;

    public DiaDiem(String tendiadiem, int hinhanh, String mota) {
        this.tendiadiem = tendiadiem;
        this.hinhanh = hinhanh;
        this.mota = mota;
    }

    public String getTendiadiem() {
        return tendiadiem;
    }

    public void setTendiadiem(String tendiadiem) {
        this.tendiadiem = tendiadiem;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
