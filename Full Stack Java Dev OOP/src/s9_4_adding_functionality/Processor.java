package s9_4_adding_functionality;

//subclass
public class Processor {

	// properties
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxfrequency;

	// default constructor
	public Processor() {
		this.brand = "Intel";
		this.series = "i5 7200u";
		this.generation = 7;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory = "3 MB";
		this.frequency = "2.5Ghz";
		this.minFrequency = "2.5Ghz";
		this.maxfrequency = "3.2";
	}

	// customize constructor by parameters
	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxfrequency) {

		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxfrequency = maxfrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", minFrequency=" + minFrequency + ", maxfrequency=" + maxfrequency + "]";
	}

	// accessing the private property value of processor
	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGeneration() {
		return generation;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinFrequency() {
		return minFrequency;
	}

	public String getMaxfrequency() {
		return maxfrequency;
	}

	// setter for frequency set value in frequency property
	public String setFrequency(String frequency) {
		return this.frequency = frequency;
	}
	
	
	
	
	
	
	

}
