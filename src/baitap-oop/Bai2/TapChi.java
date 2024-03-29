package Bai2;

public class TapChi extends TaiLieu{
	private int soPhatHanh;
	private int thangPhatHanh;
	
	public TapChi() {
		super();
	}

	public TapChi(String maTL, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTL, tenNXB, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return "TapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + ", toString()="
				+ super.toString() + "]";
	}
}
