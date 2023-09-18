public class ProjectFile {

    private String filename;
    private int setting1;
    private String setting2;
    private boolean setting3;

    public ProjectFile(String filename) {
        //TODO Загрузка с диска
        this.filename = filename;
        //Пример
        setting1 = 1;
        setting2 = "12dasd";
        setting3 = true;
    }

    public String getFilename() {
        return filename;
    }

    public int getSetting1() {
        return setting1;
    }

    public String getSetting2() {
        return setting2;
    }

    public boolean getSetting3() {
        return setting3;
    }
}
