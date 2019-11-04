package com.dr.designPattern.proxy.staticProxy.playingGame.withProxy;

import com.dr.designPattern.proxy.staticProxy.playingGame.noProxy.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer = null;
    //通过构造方法传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer _gamePlayer){
        this.gamePlayer = _gamePlayer;
    }
    @Override public void login(String username, String password) {
        gamePlayer.login(username,password);
    }

    @Override public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override public void upgrade() {
        gamePlayer.upgrade();
    }
}
