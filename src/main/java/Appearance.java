import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;


public class Appearance extends Application {
    //lewy
    Button glownaStrona = new Button("Strona główna");
    Button kalkulator = new Button("Kalkulator");
    Button galeria = new Button("Galeria");
    Label label = new Label();
    //prawy
    Label saved = new Label("Zapisani członkowie rodziny");
    Label label2 = new Label();
    Button button1 = new Button("but1");
    Button button2 = new Button("but2");
    Button button3 = new Button("but3");
    Button button4 = new Button("but4");
    Button button5 = new Button("but5");
    Button button6 = new Button("but6");
    Button button7 = new Button("but7");
    Button button8 = new Button("but8");
    Button button9 = new Button("but9");
    //kalkulator
    Button qbutton = new Button("Zapisz członka rodziny");
    Button wbutton = new Button("Wyczyść dane");
    Button ebutton = new Button("Oblicz szansę na cechy");
    Button rbutton = new Button("Eksportuj do pliku");
    Label pasek = new Label();
    Label pasek2 = new Label();
    Label czlonekRL = new Label("Wybierz członka rodziny");
    Label sierscRL = new Label("Wybierz rodzaj sierści");
    Label sierscKL = new Label("Wybierz kolor sierści");
    Label oczyKL = new Label("Wybierz kolor oczu");
    Label uczyKL = new Label("Wybierz kształt uszu");
    Label znaczenia = new Label("Wybierz czy występowały znaczenia");
    ComboBox czlonekC = new ComboBox();
    ComboBox sierscrC = new ComboBox();
    ComboBox siersckC = new ComboBox();
    ComboBox oczykC = new ComboBox();
    ComboBox uszykC = new ComboBox();
    ComboBox znaczeniaK = new ComboBox();
    //galeria
    Label uszyGL= new Label("Tu można rozróżnić rodzaje uszu.");
    Label oczyGL= new Label("Tu można rozróżnić kolory oczu.");
    Label rodzajsiersciGL= new Label("Tu można rozróżnić rodzaje sierści.");
    Label kolorsiersciGL= new Label("Tu można rozróżnić kolory sierści.");
    Label znaczeniaGL= new Label("Tu można rozrużnić naznaczenia na sierści.");
    ImageView imageView = new ImageView(new Image(new File("C:/Users/Ithilgore/Desktop/galeria_inżynierki/uchate.jpg").toURI().toString()));
//
    BorderPane borderPane;
    public void out (){
        HBox hBox0= new HBox();
        hBox0.setPrefSize(1400,700);
//lewy/menu
        VBox lewy= new VBox();
        lewy.setPrefSize(350,700);
        Background backgroundV1 = new Background((new BackgroundFill(Color.rgb(105,105,105), CornerRadii.EMPTY, Insets.EMPTY)));
        Background backgroundbuts = new Background((new BackgroundFill(Color.rgb(203,128,141), new CornerRadii(2,2,2,2,2,2,2,2,false,false,false,false,false,false,false,false), new Insets(1,1,1,1))));
        lewy.setBackground(backgroundV1);
        HBox hBox1= new HBox();
        HBox hBox2= new HBox();
        HBox hBox3= new HBox();
        HBox hBox4= new HBox();
        hBox2.setBackground(backgroundbuts);
        hBox3.setBackground(backgroundbuts);
        hBox4.setBackground(backgroundbuts);
        hBox1.getChildren().add(label);
        hBox2.getChildren().add(glownaStrona);
        hBox3.getChildren().add(kalkulator);
        hBox4.getChildren().add(galeria);
        hBox1.setPrefSize(350,30);
        hBox2.setPrefSize(350,150);
        hBox3.setPrefSize(350,150);
        hBox4.setPrefSize(350,150);
        lewy.getChildren().addAll(hBox1,hBox2,hBox3,hBox4);
//prawy
        VBox prawy= new VBox();
        Background backgroundV2 = new Background((new BackgroundFill(Color.rgb(137,137,137), CornerRadii.EMPTY, Insets.EMPTY)));
        prawy.setBackground(backgroundV2);
        prawy.setPrefSize(1050,700);
//górne buttony
        HBox góra = new HBox();
        VBox vBox3_1 = new VBox();
        vBox3_1.setPrefSize(100,100);
        vBox3_1.setBackground(backgroundbuts);
        VBox vBox3_2 = new VBox();
        vBox3_2.setPrefSize(100,100);
        vBox3_2.setBackground(backgroundbuts);
        VBox vBox3_3 = new VBox();
        vBox3_3.setPrefSize(100,100);
        vBox3_3.setBackground(backgroundbuts);
        VBox vBox3_4 = new VBox();
        vBox3_4.setPrefSize(100,100);
        vBox3_4.setBackground(backgroundbuts);
        VBox vBox3_5 = new VBox();
        vBox3_5.setPrefSize(100,100);
        vBox3_5.setBackground(backgroundbuts);
        VBox vBox3_6 = new VBox();
        vBox3_6.setPrefSize(100,100);
        vBox3_6.setBackground(backgroundbuts);
        VBox vBox3_7 = new VBox();
        vBox3_7.setPrefSize(100,100);
        vBox3_7.setBackground(backgroundbuts);
        VBox vBox3_8 = new VBox();
        vBox3_8.setPrefSize(100,100);
        vBox3_8.setBackground(backgroundbuts);
        VBox vBox3_9 = new VBox();
        vBox3_9.setPrefSize(100,100);
        vBox3_9.setBackground(backgroundbuts);
        vBox3_1.getChildren().add(button1);
        vBox3_2.getChildren().add(button2);
        vBox3_3.getChildren().add(button3);
        vBox3_4.getChildren().add(button4);
        vBox3_5.getChildren().add(button5);
        vBox3_6.getChildren().add(button6);
        vBox3_7.getChildren().add(button7);
        vBox3_8.getChildren().add(button8);
        vBox3_9.getChildren().add(button9);
        góra.getChildren().addAll(label2,vBox3_1,vBox3_2,vBox3_3,vBox3_4,vBox3_5,vBox3_6,vBox3_7,vBox3_8,vBox3_9);
//kalkulator
        HBox kalkulator = new HBox();
        VBox jeden = new VBox();
        VBox dwa = new VBox();
        VBox trzy = new VBox();
        VBox cztery = new VBox();
        jeden.setPrefSize(300,600);
        dwa.setPrefSize(205,600);
        trzy.setPrefSize(200,600);
        cztery.setPrefSize(145,600);
        czlonekC.getItems().addAll(Rodzina.values());
        sierscrC.getItems().addAll(RodzajSiersci.values());
        siersckC.getItems().addAll(KolorSiersci.values());
        oczykC.getItems().addAll(Oczy.values());
        uszykC.getItems().addAll(Uszy.values());
        znaczeniaK.getItems().addAll(Znaczenia.values());
       /* if (Rodzina.Mama = KolorSiersci.Agouti & Rodzina.Tata = KolorSiersci.Agouti){
            System.out.println("Futro w kolorze"%s agouti);
        }else if (Rodzina.Mama = KolorSiersci.Agouti & Rodzina.Tata = KolorSiersci.Agouti){

        }else if (Rodzina.Mama = KolorSiersci.Agouti & Rodzina.Tata = KolorSiersci.Agouti){

        }*/

        dwa.getChildren().addAll(pasek,czlonekRL,sierscRL,sierscKL,oczyKL,uczyKL,znaczenia,qbutton,wbutton);
        trzy.getChildren().addAll(pasek2,czlonekC,sierscrC,siersckC,oczykC,uszykC,znaczeniaK,ebutton,rbutton);
        cztery.getChildren().add(saved);
        kalkulator.getChildren().addAll(jeden,dwa,trzy,cztery);
//galeria
        /*HBox galeria = new HBox();
        VBox ukladanie = new VBox();
        HBox uszyksztaltyH1 = new HBox();
        uszyksztaltyH1.getChildren().addAll(uszyGL);
        HBox uszyksztaltyH2 = new HBox();
        imageView.setFitHeight(250);
        imageView.setFitWidth(200);
        uszyksztaltyH2.getChildren().addAll(imageView);
        HBox oczykoloryH1 = new HBox();
        oczykoloryH1.getChildren().addAll(oczyGL);
        HBox rodzajsiersciH1 = new HBox();
        rodzajsiersciH1.getChildren().addAll(rodzajsiersciGL);
        HBox kolorsiersciH1 = new HBox();
        kolorsiersciH1.getChildren().addAll(kolorsiersciGL);
        HBox znaczeniaH1 = new HBox();
        znaczeniaH1.getChildren().addAll(znaczeniaGL);

        ukladanie.getChildren().addAll(uszyksztaltyH1,uszyksztaltyH2,oczykoloryH1,rodzajsiersciH1,kolorsiersciH1,znaczeniaH1);
        galeria.getChildren().addAll(ukladanie);*/
        prawy.getChildren().addAll(góra,kalkulator);
        hBox0.getChildren().addAll(lewy,prawy);
        look();
        borderPane.setCenter(hBox0);
    }
    public void look (){
        Background background = new Background(new BackgroundFill(Color.rgb(255,192,203), new CornerRadii(2,2,2,2,2,2,2,2,false,false,false,false,false,false,false,false), new Insets(1,1,1,1)));
        Background backgroundlabs = new Background(new BackgroundFill(Color.GRAY, new CornerRadii(2,2,2,2,2,2,2,2,false,false,false,false,false,false,false,false), new Insets(1,1,1,1)));
        label.setPrefSize(350,30);
        label2.setPrefSize(75,100);
        glownaStrona.setPrefSize(345,147);
        glownaStrona.setBackground(background);
        kalkulator.setPrefSize(345,147);
        kalkulator.setBackground(background);
        galeria.setPrefSize(345,147);
        galeria.setBackground(background);      //203,128,141

        button1.setPrefSize(95,97);
        button1.setBackground(background);
        button2.setPrefSize(95,97);
        button2.setBackground(background);
        button3.setPrefSize(95,97);
        button3.setBackground(background);
        button4.setPrefSize(95,97);
        button4.setBackground(background);
        button5.setPrefSize(95,97);
        button5.setBackground(background);
        button6.setPrefSize(95,97);
        button6.setBackground(background);
        button7.setPrefSize(95,97);
        button7.setBackground(background);
        button8.setPrefSize(95,97);
        button8.setBackground(background);
        button9.setPrefSize(95,97);
        button9.setBackground(background);

        pasek.setPrefSize(200,50);
        pasek2.setPrefSize(200,50);
        czlonekRL.setPrefSize(200,50);
        czlonekRL.setBackground(backgroundlabs);
        sierscRL.setPrefSize(200,50);
        sierscRL.setBackground(backgroundlabs);
        sierscKL.setPrefSize(200,50);
        sierscKL.setBackground(backgroundlabs);
        oczyKL.setPrefSize(200,50);
        oczyKL.setBackground(backgroundlabs);
        uczyKL.setPrefSize(200,50);
        uczyKL.setBackground(backgroundlabs);
        znaczenia.setPrefSize(200,50);
        znaczenia.setBackground(backgroundlabs);
        czlonekC.setPrefSize(200,50);
        sierscrC.setPrefSize(200,50);
        siersckC.setPrefSize(200,50);
        oczykC.setPrefSize(200,50);
        uszykC.setPrefSize(200,50);
        znaczeniaK.setPrefSize(200,50);
        qbutton.setPrefSize(203,50);
        wbutton.setPrefSize(203,50);
        ebutton.setPrefSize(200,50);
        rbutton.setPrefSize(200,50);

        saved.setPrefSize(145,600);
        saved.setBackground(backgroundlabs);
    }

    public void start(Stage primaryStage) throws Exception {
        borderPane = new BorderPane();
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        out();
        primaryStage.show();
    }
}
