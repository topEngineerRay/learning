package com.dr.designPattern.proxy.staticProxy.playingGame.withProxy;

import com.dr.designPattern.proxy.staticProxy.playingGame.noProxy.GamePlayer;
import com.dr.designPattern.proxy.staticProxy.playingGame.noProxy.IGamePlayer;

public class Client {
    public static void main(String[] args){
        IGamePlayer iGamePlayer = new GamePlayer("dr");
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(iGamePlayer);
        gamePlayerProxy.login("dr","pwd");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
