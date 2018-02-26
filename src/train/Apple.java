package train;

class Apple <T> extends Fruit{

	public Apple(int weight) {
		super(weight);
	}
public  int compareTo(Apple other) {
		return Integer.compare(this.weigth, other.weigth);
	}
}