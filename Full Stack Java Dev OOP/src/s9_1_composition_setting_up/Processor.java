package s9_1_composition_setting_up;

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
		this.maxfrequency = "3.1";
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
	
	

}
