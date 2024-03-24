import java.util.Scanner;

public class Main {
    public static String[] model = new String[10];

    public static void main(String[] args) {
      viewShowTodoList();
    }

    /**
     * menampilkan todolist
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * menambah todo
     */
    public static void addTodoList(String todo) {
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * menghapus todo
     */
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else {
            model[number - 1] = null;
            return true;
        }
    }


    public static String input(String info) {
        System.out.print(info + " : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    /**
     * view menampilkan todolist
     */
    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }

    }

    /**
     * view menambah todo
     */
    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo ");

        addTodoList(todo);

    }

    /**
     * view menghapus todo
     */
    public static void viewRemoveTodoList() {

    }

}