package com.jk.templatemethod;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String string);
    protected abstract Boolean authentication(String id, String password);
    protected abstract int authorization(String username);
    protected abstract String connection(String info);

    // 템플릿 메소드
    public String requestConnection(String encodeddInfo) {
        String decodeddInfo = this.doSecurity(encodeddInfo);

        String id = "aaa";
        String pw = "bbb";
        this.authentication(id, pw);
        this.authorization(decodeddInfo);
        return connection(decodeddInfo);
    }
}

