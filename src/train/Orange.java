package train;


class Orange<T> extends Fruit {

	public Orange(int weight) {
		super(weight);
	}
public <T> int compareTo(Orange<T> other) {
		return Integer.compare(this.weigth, other.weigth);
	}
}
