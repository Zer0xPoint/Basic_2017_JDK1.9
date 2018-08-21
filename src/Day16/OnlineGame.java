package Day16;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineGame {
    private String gameServer, gameTitle;
    private int gameLevel, gamers;

    public OnlineGame() {
    }

    public int getGamers() {
        return gamers;
    }

    public void setGamers(int gamers) {
        System.out.println("允许" + gamers + "个玩家共同游戏");
        this.gamers = gamers;
    }

    public OnlineGame(String gameServer, String gameTitle, int gameLevel, int gamers) {
//        this.gameServer = gameServer;
        this.gameTitle = gameTitle;
//        this.gameLevel = gameLevel;
        setGameServer(gameServer);
        setGameLevel(gameLevel);
        setGamers(gamers);
    }

    public String getGameServer() {
        return gameServer;
    }

    public void setGameServer(String gameServer) {
        this.gameServer = (gameServer.equals("联通") || gameServer.equals("铁通") || gameServer.equals("国")) ? gameServer : "联通";
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public int getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(int gameLevel) {
        this.gameLevel = (gameLevel >= 0) ? gameLevel : 0;
    }

}

class OnlineGameTest {
    public static void main(String[] args) {
        ArrayList<OnlineGame> onlineGames = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入游戏名");
            String gameTitle = scanner.nextLine();
            System.out.println("输入服务器");
            String gameServer = scanner.nextLine();
            System.out.println("输入等级");
            int gameLevel = scanner.nextInt();
            System.out.println("输入共同游玩人数");
            int gameGamers = scanner.nextInt();

            OnlineGame onlineGame = new OnlineGame(gameServer, gameTitle, gameLevel, gameGamers);
            onlineGames.add(onlineGame);
        }
        for (OnlineGame onlineGame : onlineGames) {
            System.out.println(onlineGame.getGameTitle() + " " + onlineGame.getGameLevel() + " " + onlineGame.getGamers() + " " + onlineGame.getGameServer());
        }
    }
}
