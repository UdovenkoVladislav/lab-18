import java.awt.*;

class NotepadFrame extends Frame {

    NotepadFrame(String title) {
        super(title);
        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        MyMenuHandler handler = new MyMenuHandler(this);
        Menu file = new Menu("Файл");
        MenuItem item1,item2,item3,item4,item5,item6,item7;
        file.add(item1 = new MenuItem("Создать"));
        file.add(item2 = new MenuItem("Открыть"));
        file.add(item3 = new MenuItem("Сохранить"));
        file.add(item4 = new MenuItem("Сохранить как"));
        file.add(item5 = new MenuItem("Параметтры страницы"));
        file.add(item6 = new MenuItem("Печать"));
        file.add(item7 = new MenuItem("Выход"));
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        mbar.add(file);
        Menu edit=new Menu("Правка");
        MenuItem itemE1,itemE2,itemE3,itemE4,itemE5,itemE6,itemE7,itemE8,itemE9,itemE10,itemE11;
        edit.add(itemE1 = new MenuItem("Отменить"));
        edit.add(itemE2 = new MenuItem("Вырезать"));
        edit.add(itemE3 = new MenuItem("Копировать"));
        edit.add(itemE4 = new MenuItem("Вставить"));
        edit.add(itemE5 = new MenuItem("Удалить"));
        edit.add(itemE6 = new MenuItem("Найти"));
        edit.add(itemE7 = new MenuItem("Найти далее"));
        edit.add(itemE8 = new MenuItem("Заменить"));
        edit.add(itemE9 = new MenuItem("Перейти"));
        edit.add(itemE10 = new MenuItem("Выделить всё"));
        edit.add(itemE11 = new MenuItem("Время дата"));
        mbar.add(edit);
        Menu format = new Menu("Формат");
        MenuItem itemF1,itemF2;
        format.add(itemF1 = new MenuItem("Перенос по словам"));
        format.add(itemF2 = new MenuItem("Шрифт"));
        mbar.add(format);
        Menu view = new Menu("Вид");
        MenuItem itemV1;
        view.add(itemV1 = new MenuItem("Строка состояния"));
        mbar.add(view);
        Menu help = new Menu("Справка");
        MenuItem itemH1,itemH2;
        help.add(itemH1 = new MenuItem("Посмотреть справку"));
        help.add(itemH1 = new MenuItem("О программе"));
        mbar.add(view);
        Panel panel = new Panel();
        char[] z = {1059,1076,1086,1074,1077,1085,1082,1086,32,1055,1069,45,49,55,49};
        for(char c: z){
            System.out.print(c);
        } System.out.print("\n");
        String txt = "Java  8  is  the  latest  version  of  the  mos\t\n" +
                "widely-used  computer  language  for  Internet  programming\n" +
                "Building  on  а  rich  heritage,  Java  has  advanced  both\n" +
                "the  art  and  science  of  computer  language  design\n" +
                "One of the reasons for Java's ongoing success is its\n" +
                "constant,  steady  rate  of  evolution .  Java  has  never  stood\n" +
                "still.  Instead, Java has consistently adapted to the\n" +
                "rapidly  changing  landscape  of  the  networked  world.\n" +
                "Moreover,   Java  has  often  led  the  way,  charting  the\n" +
                "course  for  others  to  follow.\n";
        TextArea text = new TextArea(txt);
        panel.add(text);
        add(panel);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
}
