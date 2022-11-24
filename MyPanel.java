package TankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//绘图区
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    MyTank mytank;
    //定义敌人坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    //定义炸弹
    Vector<Bomb> bombs = new Vector<>();


    //定义三张照片显示爆炸效果
    Image image1;
    Image image2;
    Image image3;

    public MyPanel() {
        //初始化我方坦克
        mytank = new MyTank(500, 600);
        //初始化敌方坦克
        mytank.setSpeed(3);
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            //设置方向
            enemyTank.setDirect(2);
            //启动移动线程
            new Thread(enemyTank).start();
            //加入子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            //加入vectory
            enemyTank.shots.add(shot);
            //启动shot
            new Thread(shot).start();
            //加入
            enemyTanks.add(enemyTank);
        }
        //初始化图片
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/boom_1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/boom_2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/boom_3.png"));
    }

    public void shouInfo(Graphics g) {
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("已击毁", 1020, 30);
        drawTank(1020, 60, g, 0, 0);
        g.setColor(Color.BLACK);
        g.drawString(Recorder.getAllEnemyTankNum() + "", 1080, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        shouInfo(g);
        g.fillRect(0, 0, 1000, 750);
        //画出我方坦克
        if (mytank != null && mytank.isLive) {
            drawTank(mytank.getX(), mytank.getY(), g, mytank.getDirect(), 1);
        }
        for (int i = 0; i < 3; i++) {
            if (mytank.isLive != true) {
                mytank.setX(500);
                mytank.setY(600);
                drawTank(mytank.getX(), mytank.getY(), g, mytank.getDirect(), 1);
                mytank.isLive = true;
            }
        }

        //画出子弹
        if (mytank.isLive) {
            for (int i = 0; i < mytank.shots.size(); i++) {
                Shot shot = mytank.shots.get(i);
                if (shot != null && shot.isLive == true) {
                    g.fillOval(shot.x, shot.y, 4, 4);
                } else {
                    mytank.shots.remove(shot);
                }
            }
        }
        //爆炸效果
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            //生命值减少
            bomb.lifeDown();
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }
        //绘制敌方坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    if (shot.isLive) {
                        g.fillOval(shot.x, shot.y, 4, 4);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
    }

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //direct方向
        //type类型
        switch (type) {
            case 0://我方坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌方坦克
                g.setColor(Color.yellow);
                break;
        }
        switch (direct) {
            case 0://向上
                g.fill3DRect(x, y, 10, 60, false);//左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//中间身体
                g.fillOval(x + 10, y + 20, 20, 20);//炮台
                g.drawLine(x + 20, y + 30, x + 20, y);//炮筒
                break;
            case 1://向右
                g.fill3DRect(x, y, 60, 10, false);//左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//中间身体
                g.fillOval(x + 20, y + 10, 20, 20);//炮台
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//炮筒
                break;
            case 2://向下
                g.fill3DRect(x, y, 10, 60, false);//左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//中间身体
                g.fillOval(x + 10, y + 20, 20, 20);//炮台
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//炮筒
                break;
            case 3://向左
                g.fill3DRect(x, y, 60, 10, false);//左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//中间身体
                g.fillOval(x + 20, y + 10, 20, 20);//炮台
                g.drawLine(x + 30, y + 20, x, y + 20);//炮筒
                break;
        }
    }

    public void hitTank(Shot s, Tank tank) {

        switch (tank.getDirect()) {
            case 0:
            case 2:
                if (s.x > tank.getX() && s.x < tank.getX() + 40
                        && s.y > tank.getY() && s.y < tank.getY() + 60) {
                    s.isLive = false;
                    tank.isLive = false;
                    enemyTanks.remove(tank);
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                    if (tank instanceof EnemyTank) {
                        Recorder.addNum();
                }

                }
                break;
            case 1:
            case 3:
                if (s.x > tank.getX() && s.x < tank.getX() + 60
                        && s.y > tank.getY() && s.y < tank.getY() + 40) {
                    s.isLive = false;
                    tank.isLive = false;
                    enemyTanks.remove(tank);
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                    if (tank instanceof EnemyTank) {
                        Recorder.addNum();
                }

                }
                break;
        }
    }


    public void hitEnemyTank() {
        for (int i = 0; i < mytank.shots.size(); i++) {
            Shot shot = mytank.shots.get(i);
            //判断是否击中
            if (shot != null && shot.isLive) {
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank enemyTank = enemyTanks.get(j);
                    hitTank(shot, enemyTank);
                }
            }
        }
    }

    public void hitMyTank() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (shot != null && shot.isLive) {
                    hitTank(shot, mytank);
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            mytank.setDirect(0);
            if (mytank.getY() > 0) {
                mytank.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            mytank.setDirect(1);
            if (mytank.getX() + 60 < 1000) {
                mytank.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            mytank.setDirect(2);
            if (mytank.getY() + 60 < 750) {
                mytank.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            mytank.setDirect(3);
            if (mytank.getX() > 0) {
                mytank.moveLeft();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            mytank.shotEnemyTank();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.hitMyTank();
            this.hitEnemyTank();
            this.repaint();

        }
    }
}
