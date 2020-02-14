package com.bitedu.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//javafx 主程序 的要求
//1.必须要求javafx的Application类
//2.必须覆盖（Override）Application类的String方法
public class OSMonitorApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //1.加载 .fxml 文件
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("os_monitor_tab.fxml"));
        //2.真正的加载
        Parent root = loader.load();
        //3. 创建一个 Scene 对象，也就是场景
        Scene scene = new Scene(root,800,600);
        //4. 给 Stage 设置标题
        primaryStage.setTitle("OS Monitor");
        //5. 将 Scene 添加到Stage
        primaryStage.setScene(scene);
        //6.展示
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
