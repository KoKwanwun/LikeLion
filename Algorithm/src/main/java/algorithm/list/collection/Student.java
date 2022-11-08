package algorithm.list.collection;

public class Student {
    private int classNum;
    private String name;
    private String gitRepositoryAddress;

    public Student(int classNum, String name, String gitRepositoryAddress) {
        this.classNum = classNum;
        this.name = name;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }

    public int getClassNum() {
        return classNum;
    }

    public String getName() {
        return name;
    }

    public String getGitRepositoryAddress() {
        return gitRepositoryAddress;
    }
}
