package main.java.com.sda.dpagp.day4.adapter.example;

public class SquareToTriangleAdapter extends Triangle {

    private Square s;

    @Override
    public int[] getLength() {
        return new int[]{
                s.getLength(), s.getLength(),s.getLength()
        };
    }

    public SquareToTriangleAdapter(Square s){

        this.s= s;

    }
}
