package com.dr.designPattern.proxy.staticProxy.playingGame.noProxy;

public class Client {
    public static void main(String[] args){
        IGamePlayer iGamePlayer = new GamePlayer("dr");
        iGamePlayer.login("dr","pwd");
        iGamePlayer.killBoss();
        iGamePlayer.upgrade();
    }
}
