public class Light {
	private  int watts;
	private boolean indicator;
	
	
	
	public int getWatts() {
		return watts;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	public boolean isIndicator() {
		return indicator;
	}
	public void setIndicator(boolean indicator) {
		this.indicator = indicator;
	}

	public Light(int watts, boolean indicator) {
		super();
		this.watts = watts;
		this.indicator = indicator;
	}
	//���ƣ����Ƶ�״̬��Ϊ��
	public void switchOn() {
		this.indicator = true;
	}
	//�ص�
	public void switchOff() {
		this.indicator = false;
	}
	//����Ƶ�������Ϣ�Ϳ���״̬
	public void printInfo() {
		System.out.println("����"+watts+",�Ƶ�״̬��"+indicator);
}
	public static void main(String[] args) {
//		Light p = new Light(12);
		
	}
}
 