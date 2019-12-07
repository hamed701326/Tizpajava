package trip;

public class Distance {
    private int origin;
    private int destination;
    private static int[][] map=new int[5][];

    {
        map[0] = new int[]{1, 2, 2, 4, 3};
        map[1] = new int[]{2, 1, 4, 2, 3};
        map[2] = new int[]{3, 5, 1, 3, 2};
        map[3] = new int[]{4, 3, 3, 1, 2};
        map[4] = new int[]{3, 3, 2, 2, 1};
    }

    public Distance(int origin, int destination) {
        this.origin = origin;
        this.destination = destination;
    }
    public int getCosFactor(){
        return map[this.origin][this.destination];
    }


}
