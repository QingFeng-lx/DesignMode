package com.qingfeng.bridge.test1;

public class Args {
    private String color;
    private String size;
    private Integer disk;
    private Integer memory;
    private String name;

    public Args(String color, String size, Integer disk, Integer memory, String name) {
        this.color = color;
        this.size = size;
        this.disk = disk;
        this.memory = memory;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Args{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", disk=" + disk +
                ", memory=" + memory +
                ", name='" + name + '\'' +
                '}';
    }
}
