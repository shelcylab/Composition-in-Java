package udemy.composition.object;

class Processor {

    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String minFrequency;
    private String maxFrequency;

    public Processor() {
        this.brand = "intel";
        this.series = "7200u";
        this.generation = 7;
        this.cores = 2;
        this.threads = 4;
        this.cacheMemory = "3MB";
        this.frequency = "5Ghz";
        this.minFrequency = "2.5Ghz";
        this.maxFrequency = "3.1Ghz";
    }

    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory, String frequency, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }

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

    public String getMaxFrequency() {
        return maxFrequency;
    }
    

    @Override
    public String toString() {
        return "Processor{" + "brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores + ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency + ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + '}';
    }

}
