package week3_221004_221007.day_221007.MiniProject;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    // 생성자 추가
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    // 생성자 추가(오버로딩)
    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    // getter 추가
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}
