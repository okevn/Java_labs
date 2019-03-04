package ua.lviv.iot;

public class Notebook {
	private String color;
	private double numberOfPages;
	private double priceInGRN;
	private String coverType;
	protected String producingCountry;
	private static int size = 4;
	protected int quality;

	public Notebook() {
	}

	public Notebook(String color, double numberOfPages, double priceInGRN, String coverType) {
		this(color, numberOfPages, priceInGRN, coverType, null, 0);

	}

	public Notebook(String color, double numberOfPages, double priceInGRN, String coverType, String producingCountry,
			int quality) {

		this.producingCountry = producingCountry;
		this.quality = quality;
		this.color = color;
		this.numberOfPages = numberOfPages;
		this.priceInGRN = priceInGRN;
		this.coverType = coverType;
	}

	public String toString() {
		return "Notebook{" + "color='" + color + '\'' + ", numberOfPages=" + numberOfPages + ", priceInGRN="
				+ priceInGRN + ", coverType='" + coverType + '\'' + ", producingCountry='" + producingCountry + '\''
				+ ", quality=" + quality + '}';
	}

	public static int printStaticSize() {
		return size;
	}

	public int printSize() {
		return size;
	}

	public void resetValues(String color, double numberOfPages, double priceInGRN, String coverType,
			String producingCountry, int quality) {
		this.color = color;
		this.numberOfPages = numberOfPages;
		this.priceInGRN = priceInGRN;
		this.coverType = coverType;
		this.producingCountry = producingCountry;
		this.quality = quality;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(double numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPriceInGRN() {
		return priceInGRN;
	}

	public void setPriceInGRN(double priceInGRN) {
		this.priceInGRN = priceInGRN;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}
}