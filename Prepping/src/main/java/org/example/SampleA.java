package org.example;

 public class SampleA {
    private int price;
    private String taste;

    // public String toString(){
    //     return this.price +" "+ this.taste;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((taste == null) ? 0 : taste.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SampleA [price=" + price + ", taste=" + taste + "]";
    }

    public SampleA(){}
    
    public SampleA(int price, String taste) {
        this.price = price;
        this.taste = taste;
    }

public void showA(){
    System.out.println("In sample A");
}

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SampleA other = (SampleA) obj;
        if (price != other.price)
            return false;
        if (taste == null) {
            if (other.taste != null)
                return false;
        } else if (!taste.equals(other.taste))
            return false;
        return true;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    // public boolean equals(SampleA obj){
    //  if(this.taste.equals(obj.taste) && this.price==obj.price)
    //     return true;
    // else 
    //     return false;    
    // }


}

