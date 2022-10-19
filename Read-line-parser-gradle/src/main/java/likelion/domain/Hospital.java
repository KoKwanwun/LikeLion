package likelion.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergencyRoom;
    private String name;
    private String subdivision;

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public Hospital(String id, String address, String category, int emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;

        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);

        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
    }

    public String getSqlInsertQuery() {
        this.address = this.address.replace("'", "");
        String query = "INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`) " +
                "VALUES (\"" + this.id + "\",\"" + this.address + "\",\"" + this.district + "\",\"" + this.category + "\"," +
                this.emergencyRoom + ",\"" + this.name + "\",\"" + this.subdivision + "\");";
        return query;
    }

    public String getSqlInsertQuery2() {
        this.address = this.address.replace("'", "");
        String query = String.format("INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`) " +
                "VALUES (\"%s\",\"%s\",\"%s\",\"%s\",%d,\"%s\",\"%s\");", this.id, this.address, this.district, this.category,
                this.emergencyRoom, this.name, this.subdivision);
        return query;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
