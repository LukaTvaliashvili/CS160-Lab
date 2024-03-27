package ge.sdsu.session20240325;

public class Course {

    private String code;
    private String title;
    private String department;

    public Course(String code, String title, String department) {
        this.code = code;
        this.title = title;
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
