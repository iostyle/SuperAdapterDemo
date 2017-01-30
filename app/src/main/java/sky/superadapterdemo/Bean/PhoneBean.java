package sky.superadapterdemo.Bean;

/**
 * Created by SKYMAC on 17/1/31.
 */
public class PhoneBean {
    private String name;
    private String phoneNum;

    public PhoneBean(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
