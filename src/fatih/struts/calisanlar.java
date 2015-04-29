package fatih.struts;

import com.opensymphony.xwork2.ActionSupport;

public class calisanlar extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String isim;
	private int yas;

	//action arayüzüyle bir anlaþma
	public String execute() {
		return SUCCESS;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public void validate() {
		if (isim == null ||isim.trim() .equals("")) {
			addFieldError("isim", "isim alani bos gecilemez");
		}
		if (yas < 20 || yas > 55) {
			addFieldError("yas",
					"Sisteme giris yapabilmek icin yasiniz 20-55 arasinda olmalidir.");
		}
	}
}