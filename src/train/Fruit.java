package train;


class Fruit implements Comparable<Fruit> {

	final int weigth;

	public Fruit(int weight) {
		this.weigth = weight;
	}

	@Override
	public int compareTo(Fruit other) {
		return Integer.compare(this.weigth, other.weigth);
	}

	public int getWeigth() {
		return this.weigth;
	}

}