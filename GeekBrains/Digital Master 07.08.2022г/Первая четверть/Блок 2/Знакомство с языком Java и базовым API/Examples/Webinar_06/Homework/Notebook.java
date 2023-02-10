package Webinar_06.Homework;

// import java.util.Comparator;

public class Notebook{// implements Comparable<Notebook> {
    String name;
    Double screensize;
    String graphics;
    Integer gpu;
    Integer hdd;
    Integer ram;
    Integer price;

    void Print() {
        System.out.printf("| %-10s | %-10s | %-10s | %-5d | %-5d | %-5d | %-5d |\n",
                name, screensize, graphics, gpu, hdd, ram, price);
    }

    Notebook(String name, Double screensize, String graphics, Integer gpu, Integer hdd, Integer ram, Integer price) {
        this.name = name;
        this.screensize = screensize;
        this.graphics = graphics;
        this.gpu = gpu;
        this.hdd = hdd;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScreensize() {
        return screensize;
    }

    public void setScreensize(Double screensize) {
        this.screensize = screensize;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public Integer getGpu() {
        return gpu;
    }

    public void setGpu(Integer gpu) {
        this.gpu = gpu;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    // @Override
    // public int compareTo(Notebook n) {
    //     int result = this.price - n.price;
    //     if (result == 0)
    //         return this.price;
    //     else if (result > 0)
    //         return this.price;
    //     else
    //         return n.price;
    // }
}

// class CompareByGPU implements Comparator<Notebook> {
//     @Override
//     public int compare(Notebook o1, Notebook o2) {
//         return o1.gpu - o2.gpu;
//     }
// }

// class CompareByHDD implements Comparator<Notebook> {

//     @Override
//     public int compare(Notebook o1, Notebook o2) {
//         return o1.hdd - o2.hdd;
//     }
// }

// class CompareByRAM implements Comparator<Notebook> {

//     @Override
//     public int compare(Notebook o1, Notebook o2) {
//         return o1.ram - o2.ram;
//     }
// }

// class CompareByPrice implements Comparator<Notebook> {

//     @Override
//     public int compare(Notebook o1, Notebook o2) {
//         return o1.price - o2.price;
//     }
// }
