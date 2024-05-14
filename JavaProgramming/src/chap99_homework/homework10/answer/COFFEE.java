package chap99_homework.homework10.answer;

public enum COFFEE {
	AMERICANO(2000) {
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * (this.getPrice() + 300) +
					normalOrder * this.getPrice();
		}
	}, LATTE(3000) {
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * (this.getPrice() + 500) +
					normalOrder * this.getPrice();
		}
	}, MOCHA(4000) {
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * (this.getPrice() + 1000) +
					normalOrder * this.getPrice();
		}
	}, COLDBREW(4500) {
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * (this.getPrice() + 200) +
					normalOrder * this.getPrice();
		}
	};
	
	private int price;
	
	COFFEE(int price) { // 매개변수가 있는 생성자
		this.price = price;
	}

	public int getPrice() { // getter
		return price;
	}

	public void setPrice(int price) { // setter
		this.price = price;
	}
	
	public abstract int totalPrice(int optionOrder, int normalOrder); // 추상 메소드 선언
}
