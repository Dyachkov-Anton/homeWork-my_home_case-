package src_;

import java.nio.charset.Charset;
import java.util.Scanner;

public class FamilyTreeView<T extends LiveBeing<T>> {
    FamilyTree<T> familyTree;
    T liveBeing;

    public FamilyTreeView(FamilyTree<T> familyTree) {
        this.familyTree = familyTree;
    }

    public void view() {
        while (true) {
            int value = 0;
            String line = null;
            Charset charset = Charset.forName("UTF-8"); // TODO
            Scanner iScanner = new Scanner(System.in, charset); // TODO
            System.out.println(
                    "Выберите  действие с  деревом. Для выбора введите  цифру:\n1 - Показать все объекты\n2 - Сортировать по имени \n3 - Сортировать по дате\n0 - Выход");
            try {
                value = iScanner.nextInt();
            } catch (Exception e) {
                errorMessage(e);
            }

            switch (value) {
                case 1:
                    familyTree.showAllInConsole();
                    break;
                case 2:
                    familyTree.sortByName();
                    familyTree.showAllInConsole();
                    break;
                case 3:
                    familyTree.sortByDate();
                    familyTree.showAllInConsole();
                    break;
                // ! TODO
                case 4:
                try {
                System.out.println("Введите имя для поиска:");
                iScanner.nextLine();
                line = iScanner.nextLine();
                System.out.println(familyTree.findByName(line));
                } catch (Exception e) {
                errorMessage(e);
                }
                break;
                //case 3:
                //try {
                //System.out.println("Введите имя для поиска:");
                //line = iScanner.nextLine();
                //System.out.println(familyTree.findAllByName(line));
                //} catch (Exception e) {
                //errorMessage(e);
                //}
                //break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ошибка ввода. Повторите еще раз.");
                    break;
            }
        }
    }

    private void errorMessage(Exception e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
        System.out.println("Повторите ввод.");
    }
}
