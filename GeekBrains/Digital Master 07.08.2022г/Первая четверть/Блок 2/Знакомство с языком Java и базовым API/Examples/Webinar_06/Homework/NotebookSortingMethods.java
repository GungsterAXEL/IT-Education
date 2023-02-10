package Webinar_06.Homework;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class NotebookSortingMethods {
    public static void SortingMenuPrint() {
        String[] sortingMenu = { "Выберите номер варианта сортировки:", "1. Бренд.", "2. Диагональ.", "3. Видеопамять.",
                "4. HDD.", "5. ОЗУ.", "6. Цена.", "7. Выход из программы." };
        for (int i = 0; i < sortingMenu.length; i++) {
            System.out.println(sortingMenu[i]);
        }
    }

    public static void SortByName(LinkedList<Notebook> notebookSet) {
        List<String> notebookNames = new ArrayList<>();
        for (int i = 0; i < notebookSet.size(); i++) {
            notebookNames.add(notebookSet.get(i).getName());
        }
        Collections.sort(notebookNames);
        for (int i = 0; i < notebookNames.size(); i++) {
            for (int j = 0; j < notebookSet.size(); j++) {
                if (notebookNames.get(i).equals(notebookSet.get(j).getName()))
                    Collections.swap(notebookSet, j, i);
            }
        }
    }

    public static void SortByScreenSize(LinkedList<Notebook> notebookSet) {
        for (int i = 0; i < notebookSet.size(); i++) {
            for (int j = 1; j < notebookSet.size(); j++) {
                if (notebookSet.get(i).getScreensize() > notebookSet.get(j).getScreensize()) {
                    Collections.swap(notebookSet, i, j);
                }
            }
        }
        notebookSet.add(notebookSet.removeFirst());
    }

    public static void SortByGPU(LinkedList<Notebook> notebookSet) {
        for (int i = 0; i < notebookSet.size(); i++) {
            for (int j = 1; j < notebookSet.size(); j++) {
                if (notebookSet.get(i).getGpu() > notebookSet.get(j).getGpu()) {
                    Collections.swap(notebookSet, i, j);
                }
            }
        }
        notebookSet.add(notebookSet.removeFirst());
    }

    public static void SortByHDD(LinkedList<Notebook> notebookSet) {
        for (int i = 0; i < notebookSet.size(); i++) {
            for (int j = 1; j < notebookSet.size(); j++) {
                if (notebookSet.get(i).getHdd() > notebookSet.get(j).getHdd()) {
                    Collections.swap(notebookSet, i, j);
                }
            }
        }
        notebookSet.add(notebookSet.removeFirst());
    }

    public static void SortByRAM(LinkedList<Notebook> notebookSet) {
        for (int i = 0; i < notebookSet.size(); i++) {
            for (int j = 1; j < notebookSet.size(); j++) {
                if (notebookSet.get(i).getRam() > notebookSet.get(j).getRam()) {
                    Collections.swap(notebookSet, i, j);
                }
            }
        }
        notebookSet.add(notebookSet.removeFirst());
    }

    public static void SortByPrice(LinkedList<Notebook> notebookSet) {
        for (int i = 0; i < notebookSet.size(); i++) {
            for (int j = 1; j < notebookSet.size(); j++) {
                if (notebookSet.get(i).getPrice() > notebookSet.get(j).getPrice()) {
                    Collections.swap(notebookSet, i, j);
                }
            }
        }
        notebookSet.add(notebookSet.removeFirst());
    }
}
