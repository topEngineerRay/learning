package com.dr.designPattern.proxy.staticProxy.playingGame.noProxy;

public class GamePlayer implements IGamePlayer{
    private String username = "";

    public GamePlayer(String username){
        this.username = username;
    }
    @Override public void login(String username, String password) {
        System.out.println("登陆成功："+ username);
    }

    @Override public void killBoss() {
        System.out.println(username+"在打怪：");
    }

    @Override public void upgrade() {
        System.out.println("升了1级："+ username);
    }
}
