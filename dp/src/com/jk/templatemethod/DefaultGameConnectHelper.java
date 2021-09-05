package com.jk.templatemethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

    @Override protected String doSecurity(String string) {
        System.out.println("디코드");
        return string;
    }

    @Override protected Boolean authentication(String id, String password) {
        System.out.println("id, pw 확인 과정");
        return true;
    }

    @Override protected int authorization(String username) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override protected String connection(String info) {
        System.out.println("마지막 접속단계!");
        return info;
    }
}
